package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    final String BASE_URL = "http://localhost:3000/";

    public BasePage() {
        this.driver = WebdriverFactory.createWebDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(BASE_URL);
        PageFactory.initElements(driver, this);
    }

    public void close() {
        WebdriverFactory.createWebDriver().quit();
    }

}
