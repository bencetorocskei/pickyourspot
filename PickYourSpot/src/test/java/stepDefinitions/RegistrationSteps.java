package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.DashboardPage;
import pagefactory.LoginPage;
import pagefactory.ProfilePage;
import pagefactory.RegistrationPage;

public class RegistrationSteps {

    LoginPage login;
    DashboardPage dashboardPage;
    ProfilePage profile;

    RegistrationPage registration;


    @Before
    public void setup(){
        login = new LoginPage();
        dashboardPage = new DashboardPage();
        profile  = new ProfilePage();
        registration = new RegistrationPage();
    }


    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        dashboardPage.navigate();
        dashboardPage.clickOnRegistrationBtn();
    }
    @When("I fill the Username and Password and Email with valid data")
    public void i_fill_the_username_and_password_and_email_with_valid_data() {
        registration.registrate("test", "test", "test@test.com");
    }
    @When("I click on the Registration Submit button")
    public void i_click_on_the_registration_submit_button() {
        registration.clickOnSubmitBtn();
    }
    @Then("I am on the Login page and I can login")
    public void i_am_on_the_login_page_and_i_can_login() {
        login.fillUsername("test");
        login.fillPassword("test");
        login.clickOnSubmitBtn();
        dashboardPage.clickOnTheProfileBtn();
        String current = profile.getProfileName();
        String expected = "Hello " + "test!";
        Assertions.assertEquals(expected, current);
    }

    @When("I fill the Username and Password and Email with invalid data")
    public void i_fill_the_username_and_password_and_email_with_invalid_data() {
        registration.registrate("test", "test", "test@test.com");
    }

    @Then ("Error message is displayed")
    public void Error_message_is_displayed() {
        Assertions.assertTrue(registration.errorMsgIsPresent());
    }
}
