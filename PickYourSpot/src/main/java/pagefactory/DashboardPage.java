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
    public void clickOnLoginBtn() {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }

    public void clickOnTheProfileBtn() {
        wait.until(ExpectedConditions.visibilityOf(profileBtn));
        profileBtn.click();
    }


}
