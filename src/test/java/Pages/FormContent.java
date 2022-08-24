package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent(){
        PageFactory.initElements(GWD.getDriver(), this);
    }





    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),' 2021-2022 ')]")
    private WebElement academicPeriod2;

    @FindBy(xpath = "//div/span[text()='Grade Level']")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;





    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {



        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "academicPeriod" : myElement=academicPeriod;break;

            case "academicPeriod2" : myElement=academicPeriod2;break;

            case "gradeLevel" : myElement=gradeLevel;break;

            case "gradeLevel2" : myElement=gradeLevel2;break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {



        }

        verifyContainsText(myElement, text);
    }

}
