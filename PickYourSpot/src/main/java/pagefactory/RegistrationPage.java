package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage {
    public RegistrationPage() {
        super();
    }

    @FindBy (id = "registration-name")
    WebElement registrationName;

    @FindBy (id = "registration-password")
    WebElement registrationPassword;

    @FindBy (id = "registration-email")
    WebElement registrationEmail;

    @FindBy (id = "registration-submit")
    WebElement registrationSubmitBtn;

    @FindBy (id = "registration-feedback")
    WebElement errorMsg;

    public void registrate(String name, String pw, String email) {
        wait.until(ExpectedConditions.visibilityOf(registrationName));
        registrationName.sendKeys(name);
        registrationPassword.sendKeys(pw);
        registrationEmail.sendKeys(email);
    }

    public void clickOnSubmitBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationSubmitBtn));
        registrationSubmitBtn.click();

    }

    public boolean errorMsgIsPresent() {
        wait.until(ExpectedConditions.visibilityOf(errorMsg));
        return errorMsg.isDisplayed();
    }


}
