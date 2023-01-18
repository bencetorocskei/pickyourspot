package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {
        this.driver = WebdriverFactory.createWebDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }



    public void close() {
        WebdriverFactory.shutdown();
    }

}
