package util.driver;

import org.openqa.selenium.WebDriver;
import util.BrowserFactory;

import static configuration.LocalWebDriverProperties.getBrowser;
import static configuration.LocalWebDriverProperties.getIsRemoteRun;
import static util.BrowserType.FIREFOX;

public enum DriverManager {
    INSTANCE;
    private static WebDriver driver;


    public static WebDriver getWebDriver() {
        if (driver == null) {
            BrowserFactory browserFactory = new BrowserFactory(getBrowser(), getIsRemoteRun());
            driver = browserFactory.getBrowser();

        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (getBrowser().equals(FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
