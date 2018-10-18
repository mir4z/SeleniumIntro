package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    private static WebDriver getBrowserDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\lib\\chromedriver.exe");
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\lib\\geckodriver.exe");
                return new FirefoxDriver();
            case EDGE:
                System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\lib\\MicrosoftWebDriver.exe");
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Unknown browser type");
        }
    }
}
