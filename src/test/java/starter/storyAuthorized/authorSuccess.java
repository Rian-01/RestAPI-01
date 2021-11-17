package starter.storyAuthorized;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.authorSteps;

public class authorSuccess {
    @Steps
    authorSteps author;
    @Given("I am on the page Authorized")
    public void i_am_on_the_page_Authorized() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter my username and Password is valid")
    public void i_enter_my_username_and_Password_is_valid() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        author.setBodyReqAuthor();
    }

    @When("I click {string} button in page system")
    public void i_click_button_in_page_system(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        author.hitEndpointAuthor();
    }

    @Then("I am taken new page Authorized")
    public void i_am_taken_new_page_Authorized() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        author.valDateEndpointAuthor();
    }
}
