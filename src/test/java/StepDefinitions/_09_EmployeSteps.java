package StepDefinitions;

import Pages.EmployeContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _09_EmployeSteps {

    EmployeContent ec = new EmployeContent();
    @And("User sending the keys in Employe Content")
    public void userSendingTheKeysInEmployeContent(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            ec.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
}
