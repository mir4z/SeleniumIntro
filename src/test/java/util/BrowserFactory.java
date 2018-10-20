package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.BrowserType;

public class BrowserFactory {
    private static  String path = "C:\\Users\\mir4ge\\Desktop\\libraries\\";
    public static WebDriver getBrowserDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
                return new FirefoxDriver();
            case EDGE:
                System.setProperty("webdriver.edge.driver", path + "MicrosoftWebDriver.exe");
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Unknown browser type");
        }
    }
}
