package starter.storyToken;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.tokenSteps;

public class genTokenFailCase {
    @Steps
    tokenSteps token;

    @When("I enter username correctly and Password Blank")
    public void i_enter_my_username_and_Password_valid() {
        token.setBodyReqGenTokenBlankPass();
    }

    @When("I click {string} with failed Pass")
    public void i_click_button_page(String string) {
        token.setBodyReqGenTokenBlankPass();
    }

    @Then("Warning Password invalid and stay in page")
    public void i_am_taken_to_New_Page() {
    }
}
