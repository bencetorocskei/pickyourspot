package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();

    }

    @FindBy(id = "login-name")
    WebElement usernameInput;

    @FindBy(id = "login-password")
    WebElement passwordInput;

    @FindBy(id = "login-submit")
    WebElement submitBtn;

    @FindBy(id = "login-response")
    WebElement errorMsg;

    public void fillUsername(String Username) {
        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys(Username);
    }

    public void fillPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
    }

    public void clickOnSubmitBtn() {
        wait.until(ExpectedConditions.visibilityOf(submitBtn));
        submitBtn.click();
    }

    public void login() {
        navigate();
        fillUsername("b");
        fillPassword("b");
        clickOnSubmitBtn();
    }

    public void navigate(){
        driver.get("http://localhost:3000/login");
    }


    public boolean isErrorMsgPresent(){
        wait.until(ExpectedConditions.visibilityOf(errorMsg));
        return errorMsg.isDisplayed();
    }

}
