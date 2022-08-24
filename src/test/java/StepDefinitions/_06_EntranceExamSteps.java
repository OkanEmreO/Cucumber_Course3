package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import io.cucumber.java.en.When;

public class _06_EntranceExamSteps {

    DialogContent dc = new DialogContent();
    @When("User delete the {string} from Form")
    public void userDeleteTheFromForm(String silinecekSinacAdi) {

        dc.searchAndDelete(silinecekSinacAdi);
    }
}
