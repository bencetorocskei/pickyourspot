package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProfilePage extends BasePage{

    public ProfilePage() {
    super();

    }

    @FindBy (id = "profile-name")
    WebElement profileName;

    @FindBy (xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']")
    List<WebElement> reservations;

    @FindBy (xpath = "//div[@class='card-header']")
    WebElement reservationName;

    public String getProfileName() {
        wait.until(ExpectedConditions.visibilityOf(profileName));
        return profileName.getText();
    }
    public String getReservationName() {
        WebElement reservation = reservations.get(0);
        return reservation.getText();
    }
}
