package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setup");
        ln.findAndClick("Parameters");
        ln.findAndClick("Countries");

    }

    @When("Create a country")
    public void createACountry() {

        ln.findAndClick("cookies");
        ln.findAndClick("addButton");
        ln.findAndSend("nameInput","Çorum");
        ln.findAndSend("code","AK121");
        ln.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        ln.verifyContainsText(ln.countryList,"Çorum");

    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        ln.findAndClick("cookies");
        ln.findAndClick("addButton");
        ln.findAndSend("nameInput",name);
        ln.findAndSend("code",code);
        ln.findAndClick("saveButton");
    }
}
