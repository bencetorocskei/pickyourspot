package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.DashboardPage;
import pagefactory.LoginPage;
import pagefactory.ProfilePage;


public class PickYourSpotSteps {

    LoginPage login;
    DashboardPage dashboardPage;
    ProfilePage profile;


    @Before
    public void setup(){
        login = new LoginPage();
        dashboardPage = new DashboardPage();
        profile  = new ProfilePage();
    }

    @When("I click on the first table")
    public void i_click_on_the_first_table() {
        dashboardPage.clickFirstTable();
    }
    @And("I click on the reserve button")
    public void i_click_on_the_reserve_button() {
        System.out.println(dashboardPage.getTableName());
        dashboardPage.clickOnModalReserveBtn();
    }
    @Then("I can see the reserved table on my profile")
    public void i_can_see_the_reserved_table_on_my_profile() {
        dashboardPage.clickOnTheProfileBtn();

    }

}
