package StepDefinitions;

import Pages.DialogContent;
import Pages.EmployeContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DatatableSteps {

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    FormContent fc = new FormContent();

    EmployeContent ec = new EmployeContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            ln.findAndClick(listElement.get(i));
        }

    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialog(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.searchAndDelete(listElement.get(i));
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            fc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Employe Content")
    public void userSendingTheKeysInEmployeContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            ec.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
}
