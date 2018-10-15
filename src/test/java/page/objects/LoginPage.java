package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.DriverManager;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(css = "#Content .messages li")
    private WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void inputUsername(String username) {
        this.usernameField.clear();
        this.usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
    }

    public String getEerrorMessage() {
        return this.errorMessage.getText();
    }

    public void clickOnLoginButton() {
        this.loginButton.click();
    }

    public void successfullLogin() {
        this.inputUsername("j2ee");
        this.inputPassword("j2ee");
        this.clickOnLoginButton();
        WebElement dogGif = DriverManager.getWebDriver().findElement(By.cssSelector("img[src*='banner_dogs.gif']"));
        Assert.assertTrue(dogGif.isDisplayed());

    }


}
