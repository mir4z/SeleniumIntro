package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.Header;
import page.objects.LoginPage;
import util.DriverManager;

public class SuccessLoginTest extends BaseTest {

    @Test
    public void check() {
        Header header = new Header();
        LoginPage loginPage = header.goToLoginPage();
        loginPage.inputUsername("j2ee");
        loginPage.inputPassword("j2ee");
        loginPage.clickOnLoginButton();

        WebElement dogGif = DriverManager.getWebDriver().findElement(By.cssSelector("img[src*='banner_dogs.gif']"));
        Assert.assertTrue(dogGif.isDisplayed());


    }

}
