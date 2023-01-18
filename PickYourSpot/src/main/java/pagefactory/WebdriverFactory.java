package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverFactory {

    private static WebDriver webDriver = null;
    /*public static WebDriver createWebDriver() {
        if (webDriver == null){
            String webdriverType = System.getProperty("browser", "chrome");
            switch (webdriverType) {
                case "firefox" -> webDriver =  new FirefoxDriver();
                case "chrome" -> webDriver = new ChromeDriver();
                default -> throw new RuntimeException("Unsupported webdriver: " + webdriverType);
            };
        }
        return webDriver;
    }*/

    public static WebDriver createWebDriver() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();

        }
        return webDriver;
    }

    public static void shutdown() {
        webDriver.quit();
        webDriver = null;

    }
}
