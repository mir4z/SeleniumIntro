package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.driver.DriverManager;
import util.helperClasses.Login;
import util.helperClasses.WaitForElement;

import static util.helperClasses.Login.*;

public class LoginPage {
    private Logger logger = LogManager.getRootLogger();
    private String correctLogin = "j2ee";
    private String correctPassword = "j2ee";
    private static int count = 0;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(css = "#Content .messages li")
    private WebElement errorMessage;

    public LoginPage() {
        System.out.println(count++);
        logger.info("You were succesfully redirected to login page");
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage inputUsername(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        this.usernameField.clear();
        this.usernameField.sendKeys(username);
        logger.info("Typed into username filed: " + username);

        return this;
    }

     public LoginPage inputPassword(String password) {
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
        logger.info("Typed into password filed: " + password);

        return this;
    }

    public String getEerrorMessage() {
        return this.errorMessage.getText();
    }

    public LoggedMainPage clickOnLoginButton() {
        this.loginButton.click();
        logger.info("Clicked login button");

        loginResult();
        return new LoggedMainPage();

    }

    public void passLoginInformation(String username, String password) {

        this.inputUsername(username);
        this.inputPassword(password);
        this.clickOnLoginButton();


    }


    public LoggedMainPage successfullLogin() {
        this.inputUsername(correctLogin);
        this.inputPassword(correctPassword);
        return this.clickOnLoginButton();

    }



}
