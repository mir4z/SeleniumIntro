package tests;

import configuration.ConfigurationProperties;
import configuration.PropertiesLoader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import util.driver.DriverManager;
import util.driver.DriverUtils;
import util.navigation.ApplicationURLs;

import java.util.Properties;

import static util.navigation.ApplicationURLs.*;

public class BaseTest {
    @BeforeClass
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);

    }
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
