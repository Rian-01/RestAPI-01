package starter.storyLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.Login;

public class loginSuccess {
    @Steps
    Login login;

    @Given("I am on the Login page")
    public void i_am_on_the_Login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter my username and Password correctly")
    public void i_enter_my_username_and_Password_correctly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.setBodyReq();
    }

    @When("I click {string} button")
    public void i_click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.hitEndpointLogin();
    }

    @Then("I am taken to the dashboard")
    public void i_am_taken_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.valDateEndpointLogin();
    }
}
