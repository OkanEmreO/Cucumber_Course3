package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class EmployeContent extends Parent{


    public EmployeContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "//a/span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//a/span[text()='Employees']")
    private WebElement Employees;

    @FindBy(xpath = "//button[@matbadgeposition='below']")
    private WebElement addButton2;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(id = "mat-input-14")
    private WebElement birthDate;

    @FindBy(xpath = "//div[@id='mat-select-value-13']//span")
    private WebElement gender;

    @FindBy(xpath = "//div[@id='mat-select-value-15']//span")
    private WebElement employeType;

    @FindBy(xpath = "//div[@id='mat-select-value-21']//span")
    private WebElement qualification;

    @FindBy(id = "mat-input-5")
    private WebElement employeID;

    WebElement myElement;




    public void findAndClick(String strElement){

        switch (strElement){


            case "humanResources" : myElement=humanResources;break;
            case "Employees" : myElement=Employees;break;
            case "addButton2" : myElement=addButton2;break;


        }

        clickFunction(myElement);

    }


    public void findAndSend(String strElement, String value){

        switch (strElement){

            case "firstName" : myElement=firstName;break;
            case "lastName" : myElement=lastName;break;
            case "birthDate" : myElement=birthDate;break;
            case "gender" : myElement=gender;break;
            case "employeType" : myElement=employeType;break;
            case "qualification" : myElement=qualification;break;
            case "employeID" : myElement =employeID;break;
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
