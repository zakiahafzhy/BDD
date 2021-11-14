package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFailed {
    @Given("I am on the Login page with case invalid password")
    public void i_am_on_the_Login_page_with_case_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
    }

    @When("I enter my valid username and invalid password")
    public void i_enter_my_valid_username_and_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
    }

    @When("I click {string} button with case invalid password")
    public void i_click_button_with_case_invalid_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
    }

    @Then("I can see error message invalid password")
    public void i_can_see_error_message_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
    }
}
