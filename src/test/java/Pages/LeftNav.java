package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    private WebElement setupOne;

    @FindBy(xpath = "//a/span[text()='Setup']")
    public WebElement setup;

    @FindBy(xpath = "//a/span[text()='Parameters']")
    public WebElement Parameters;

    @FindBy(xpath = "//a/span[text()='Countries']")
    public WebElement Countries;

    @FindBy(xpath = "//*[@id='ms-table-1_buttons']/ms-table-toolbar/div/ms-add-button/div/button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-2']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-3']/input")
    public WebElement code;

    @FindBy(xpath = "//span[contains (text(), 'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='ccb__button']/button")
    public WebElement cookies;

    @FindBy(xpath = "//tbody")
    public List<WebElement> countryList;




    WebElement myElement;

    List <WebElement> myElements;

    public void findAndClick(String strElement){

        switch (strElement){

            case "setup" : myElement = setup; break;
            case "Parameters" : myElement = Parameters; break;
            case "Countries" : myElement = Countries; break;
            case "cookies" : myElement = cookies;break;
            case "addButton" : myElement = addButton; break;
            case "saveButton" : myElement = saveButton;break;
            case "countryList" : myElements = countryList;break;

        }

        clickFunction(myElement);

    }

    public void findAndSend(String strElement, String value){

        switch (strElement){

            case "nameInput" : myElement = nameInput; break;
            case "code" : myElement = code;break;
        }

        sendKeysFunction(myElement,value);

    }

    public void verifyContainsText(List <WebElement> element,String text){

        for (WebElement e:element) {

            if (e.getText().equals(text)){
                Assert.assertTrue(e.getText().toLowerCase().contains(text.toLowerCase()));
            }
        }
    }


}
