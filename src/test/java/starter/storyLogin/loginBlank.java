package starter.storyLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.Login;

public class loginBlank {
    @Steps
    Login login;

    @When("I enter username and Password Blank")
    public void i_enter_username_and_Password_Blank() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.setBodyReqBlank();
    }

    @When("I click {string} button in page")
    public void i_click_button_in_page(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.hitEndPointLoginBlank();
    }

    @Then("I am stay in login page")
    public void i_am_stay_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        login.valDateEndpointLoginBlank();
    }
}
