package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.DashboardPage;
import pagefactory.LoginPage;
import org.junit.jupiter.api.Assertions;

public class LogoutSteps {

    LoginPage login;
    DashboardPage dashboardPage;



    @Before
    public void setup() {
        login = new LoginPage();
        dashboardPage = new DashboardPage();

    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        login.login();
    }

    @When("I click on the Logout button")
    public void i_click_on_the_logout_button() {
        dashboardPage.clickOnTheLogoutBtn();
    }

    @Then("there is a login button instead of logout button")
    public void there_is_a_login_button_instead_of_logout_button() {
        Assertions.assertTrue(dashboardPage.loginBtnIsPresent());
    }

}
