package util.helperClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.objects.FooterPage;
import util.driver.DriverManager;
import page.objects.LoggedMainPage;
import page.objects.LoginPage;

public class Login {
    private  static Logger logger = LogManager.getRootLogger();
    private static String loginURL = "http://przyklady.javastart.pl/jpetstore/actions/Account.action?signonForm=";

    public static LoggedMainPage logIn() {
        DriverManager.getWebDriver().navigate().to(loginURL);


        return new LoginPage().successfullLogin();
    }

    public static void loginResult() {
        if (new FooterPage().isBannerAfterLoginDisplayed()) {
            logger.info("You were succesfully logged in,");
        } else {
            logger.info("Login failed.");
        }

    }

}
