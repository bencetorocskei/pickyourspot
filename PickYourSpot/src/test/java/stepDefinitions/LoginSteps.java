package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.DashboardPage;
import pagefactory.LoginPage;
import pagefactory.ProfilePage;

public class LoginSteps {

    LoginPage login = new LoginPage();
    DashboardPage dashboardPage;
    ProfilePage profile = new ProfilePage();

    @Given("I am on the home page")
    public void i_am_on_the_login_page() {
        dashboardPage = new DashboardPage();
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
        System.out.println(profile.getProfileName());
        String current = profile.getProfileName();
        String expected = "Hello " + "b!";
        Assertions.assertEquals(expected, current);
    }

}
