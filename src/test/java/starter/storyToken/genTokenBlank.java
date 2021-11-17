package starter.storyToken;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.tokenSteps;

public class genTokenBlank {
    @Steps
    tokenSteps token;
    @When("I enter my Password is Blank")
    public void i_enter_my_passBlank() {
        token.setBodyReqGenTokenBlank();
    }

    @When("I click {string} in GenToken Page")
    public void i_click_button_page_genToken(String string) {
        token.setBodyReqGenTokenBlank();
    }

    @Then("I am stay in GenToken page")
    public void i_am_taken_to_New_Page() {
    }
}
