package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.DashboardPage;
import pagefactory.LoginPage;
import pagefactory.ProfilePage;

public class LoginSteps {

    LoginPage login;
    DashboardPage dashboardPage;
    ProfilePage profile;


    @Before
    public void setup(){
        System.out.println("before");
        login = new LoginPage();
        dashboardPage = new DashboardPage();
        profile  = new ProfilePage();
    }
    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        dashboardPage.navigate();
    }

    @When("I click on the Login button")
    public void i_click_on_the_Login_button() {
        dashboardPage.clickOnLoginBtn();
    }

    @When("I set the Username and Password with valid data")
    public void i_set_the_username_input() {
        login.fillUsername("b");
        login.fillPassword("b");
    }

    @When("I click on the Submit button")
    public void i_click_on_the_submit_button() {
        login.clickOnSubmitBtn();
    }

    @Then("I am on the Dashboard page")
    public void i_am_on_the_dashboard_page() {
        dashboardPage.clickOnTheProfileBtn();
        String current = profile.getProfileName();
        String expected = "Hello " + "b!";
        Assertions.assertEquals(expected, current);
        System.out.println("successful");
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        login.navigate();
    }

    @When("I set the Username and Password with invalid data")
    public void i_set_the_Username_and_Password_with_invalid_data(){
        login.fillUsername("invalid-username");
        login.fillPassword("invalid-password");
    }

    @Then("I got error message")
    public void i_got_error_message(){
        Assertions.assertTrue(login.isErrorMsgPresent());
    }

    @After
    public void teardown(){
        System.out.println("after");
        dashboardPage.close();
    }

}
