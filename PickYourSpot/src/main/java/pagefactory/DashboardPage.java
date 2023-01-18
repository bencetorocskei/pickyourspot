package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage{

    public DashboardPage() {
        super();

    }
    @FindBy(id = "login")
    WebElement loginBtn;

    @FindBy (id = "profile")
    WebElement profileBtn;

    @FindBy(id = "admin")
    WebElement adminBtn;

    @FindBy (id = "logout")
    WebElement logoutBtn;

    @FindBy(id = "registration")
    WebElement registrationBtn;

    public void clickOnLoginBtn() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }

    public void clickOnTheProfileBtn() {
        wait.until(ExpectedConditions.visibilityOf(profileBtn));
        profileBtn.click();
    }

    public boolean adminBtnIsPresent() {
        wait.until(ExpectedConditions.visibilityOf(adminBtn));
        return adminBtn.isDisplayed();
    }
    public void clickOnTheAdminBtn() {
        wait.until(ExpectedConditions.visibilityOf(adminBtn));
        adminBtn.click();
    }

    public void clickOnTheLogoutBtn() {
        wait.until(ExpectedConditions.visibilityOf(logoutBtn));
        logoutBtn.click();
    }

    public boolean loginBtnIsPresent() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        return loginBtn.isDisplayed();
    }

    public void clickOnRegistrationBtn() {
        wait.until(ExpectedConditions.visibilityOf(registrationBtn));
        registrationBtn.click();
    }

    public void navigate(){
        driver.get("http://localhost:3000/");
    }
}
