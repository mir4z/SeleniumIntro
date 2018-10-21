package util.helperClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.objects.FooterPage;
import page.objects.Header;
import util.driver.DriverManager;
import page.objects.LoggedMainPage;
import page.objects.LoginPage;
import util.navigation.ApplicationURLs;

import java.util.concurrent.TimeoutException;

import static util.navigation.ApplicationURLs.*;

public class Login {
    private  static Logger logger = LogManager.getRootLogger();

    public static LoggedMainPage logIn() {
        DriverManager.getWebDriver().navigate().to(LOGIN_PAGE);
        return new Header()
                .goToLoginPage()
                .successfullLogin();
    }

    public static void loginResult() {
        if (new FooterPage().isBannerAfterLoginDisplayed()) {
            logger.info("You were succesfully logged in,");
        } else {
            logger.info("Login failed.");
        }

    }

}
