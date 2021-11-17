package starter.storyToken;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.tokenSteps;

public class genTokenSuccess {
    @Steps
    tokenSteps token;
    @Given("I am on the GenToken page")
    public void i_am_on_the_GenToken_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter my username and Password valid")
    public void i_enter_my_username_and_Password_valid() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        token.setBodyReqGenToken();
    }

    @When("I click {string} button page")
    public void i_click_button_page(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        token.hitEndpointToken();
    }

    @Then("I am taken to New Page")
    public void i_am_taken_to_New_Page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        login.valDateEndpointToken();
    }
}