package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Locale;

public class Parent {



    public void  sendKeysFunction(WebElement element, String value){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(element));

        //kaydırmayı da yap

        scrollToElement(element);

        // kutucuğu temizle

        element.clear();

        // değeri gönder

        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void clickFunction(WebElement element){

        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        // beklemeyi yap
        scrollToElement(element); // element'e scroll yap
        element.click();

    }

    public void waitUntilClickable(WebElement element){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyContainsText(WebElement element,String text){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

}
