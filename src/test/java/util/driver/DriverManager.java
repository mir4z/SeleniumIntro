package util.driver;

import configuration.LocalWebDriverProperties;
import org.openqa.selenium.WebDriver;
import util.BrowserFactory;
import util.BrowserType;

public enum DriverManager {
    INSTANCE;
    private static WebDriver driver;
    private final static BrowserType BROWSER_TYPE = LocalWebDriverProperties.getLocalBrowser();


    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = BrowserFactory.getBrowserDriver(BROWSER_TYPE);

        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
