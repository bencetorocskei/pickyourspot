package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage{

    public ProfilePage() {
    super();
        System.out.println("profil page created");
    }

    @FindBy (id = "profile-name")
    WebElement profileName;

    public String getProfileName() {
        wait.until(ExpectedConditions.visibilityOf(profileName));
        return profileName.getText();
    }
}
