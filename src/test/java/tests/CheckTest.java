package tests;

import org.testng.annotations.Test;
import page.objects.LoggedMainPage;

public class CheckTest extends BaseTest {

    @Test
    public void check() {

        LoggedMainPage loggedMainPage = new LoggedMainPage();

        loggedMainPage.checkDog();
//        WebElement bulldog = DriverManager.getWebDriver().findElement(By.linkText("K9-BD-01"));
//        WaitForElement.waitUntilElementIsVisible(bulldog);
//        Assert.assertTrue(bulldog.isDisplayed());

    }
}
