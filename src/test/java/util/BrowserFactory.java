package util;

import configuration.ConfigurationProperties;
import configuration.LocalWebDriverProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.BrowserType;

import java.util.Locale;

public class BrowserFactory {
    //private static  String path = "C:\\Users\\mir4ge\\Desktop\\libraries\\";
    public static WebDriver getBrowserDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", LocalWebDriverProperties.getChromeWebDriverLocation());
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", LocalWebDriverProperties.getFirefoxWebDriverLocation());
                return new FirefoxDriver();
            case EDGE:
                System.setProperty("webdriver.edge.driver", LocalWebDriverProperties.getEdgeWebDriverLocation());
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Unknown browser type");
        }
    }
}
