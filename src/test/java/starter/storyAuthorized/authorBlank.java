package starter.storyAuthorized;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.authorSteps;

public class authorBlank {
    @Steps
    authorSteps author;
    @When("I enter my username and Password Blank")
    public void i_enter_my_username_and_Password_Blank() {
        author.setBodyReqAuthorBlank();
    }

    @When("I click {string} button system")
    public void i_click_button_system(String string) {
        author.setBodyReqAuthorBlank();
    }

    @Then("I am stay in Authorized page")
    public void i_am_stay_in_Authorized_page() {
    }
}
