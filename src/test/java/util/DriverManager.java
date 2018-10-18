package util;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;
    private final static BrowserType BROWSER_TYPE = BrowserType.FIREFOX;
    public DriverManager() {
    }

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
