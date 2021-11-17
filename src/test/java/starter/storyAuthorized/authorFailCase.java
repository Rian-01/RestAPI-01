package starter.storyAuthorized;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.authorSteps;

public class authorFailCase {
    @Steps
    authorSteps author;
    @When("I enter my Password Blank")
    public void i_enter_my_Password_Blank(){
        author.setBodyReqAuthorBlankPass();
    }

    @When("I click {string} button Authorized page")
    public void i_click_button_(String string) {
        author.setBodyReqAuthorBlankPass();
    }

    @Then("Warning Password invalid and stay Authorized page")
    public void Warning_Password(){
    }
}
