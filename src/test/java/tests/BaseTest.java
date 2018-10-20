package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.driver.DriverManager;
import util.driver.DriverUtils;

public class BaseTest {
    String mainPageURL ="http://przyklady.javastart.pl/jpetstore/actions/Catalog.action";

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(mainPageURL);
    }
    @AfterMethod
    public void afterTest() {
       DriverManager.disposeDriver();
    }

}
