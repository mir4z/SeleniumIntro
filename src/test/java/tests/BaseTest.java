package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.driver.DriverManager;
import util.driver.DriverUtils;
import util.navigation.ApplicationURLs;

import static util.navigation.ApplicationURLs.*;

public class BaseTest {

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(MAIN_PAGE);
    }
    @AfterMethod
    public void afterTest() {
       DriverManager.disposeDriver();
    }

}
