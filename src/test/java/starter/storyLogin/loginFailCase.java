package starter.storyLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.Login;

public class loginFailCase {
    @Steps
    Login login;

    @When("I enter my username correctly and Password Blank")
    public void i_enter_my_username_and_Password_incorrectly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.setBodyReqBlankPass();
    }

    @When("I click {string} button with failed case")
    public void i_click_button_with_failed_case(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.hitEndPointLoginBlankPass();
    }

    @Then("Warning Password invalid and stay Sign in page")
    public void warning_Pass_invalid_and_stay_Sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        login.valDateEndpointLoginBlank();
    }
}
