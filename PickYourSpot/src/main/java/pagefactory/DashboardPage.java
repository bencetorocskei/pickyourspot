package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    @FindBy (id = "date-picker")
    WebElement datePicker;

    @FindBy (id = "spot-selection")
    WebElement spotSelection;

    @FindBy (xpath = "//div[@class='tables-container row row-cols-1 row-cols-md-3 g-4']")
    List<WebElement> tables;

    @FindBy (id = "49f82257-3914-4d01-960d-5dad4f150436")
    WebElement firstTable;

    @FindBy (id = "modal-close")
    WebElement modalCloseBtn;

    @FindBy (id = "reserve-button")
    WebElement reserveBtn;

    @FindBy (id = "modal-title")
    WebElement modal;

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

/*    public void pickTable() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        //WebElement table = tables.get(0);
        //table.click();
    }*/

    public void clickFirstTable() {
        wait.until(ExpectedConditions.elementToBeClickable(firstTable));
        firstTable.click();
    }

    public void clickOnModalReserveBtn() {
        wait.until(ExpectedConditions.visibilityOf(modal));
        reserveBtn.click();
    }

    public String getTableName() {
        wait.until(ExpectedConditions.visibilityOf(modal));
        return modal.getText();
    }


    public void navigate(){
        driver.get("http://localhost:3000/");
    }
}
