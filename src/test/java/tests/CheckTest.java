package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.Header;
import page.objects.LoggedMainPage;
import page.objects.LoginPage;
import util.driver.DriverManager;
import util.helperClasses.WaitForElement;

public class CheckTest extends BaseTest {

    @Test
    public void check() {

        LoggedMainPage loggedMainPage =
                new Header()
                        .goToLoginPage()
                        .successfullLogin();

        loggedMainPage.checkDog();
        WebElement bulldog = DriverManager.getWebDriver().findElement(By.linkText("K9-BD-01"));
        WaitForElement.waitUntilElementIsVisible(bulldog);
        Assert.assertTrue(bulldog.isDisplayed());

    }
}
