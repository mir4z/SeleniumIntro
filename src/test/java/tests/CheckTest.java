package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LoggedMainPage;
import util.driver.DriverManager;
import util.helperClasses.Login;
import util.helperClasses.WaitForElement;

public class CheckTest extends BaseTest {

    @Test
    public void check() {

        LoggedMainPage loggedMainPage = Login.logIn();

        loggedMainPage.clickDogImage();
        WebElement bulldog = DriverManager.getWebDriver().findElement(By.linkText("K9-BD-01"));
        WaitForElement.waitUntilElementIsVisible(bulldog);
        Assert.assertTrue(bulldog.isDisplayed());

    }
}
