package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LoggedMainPage;
import util.DriverManager;

public class CheckTest extends BaseTest {

    @Test
    public void check() {

        LoggedMainPage loggedMainPage = new LoggedMainPage();
        loggedMainPage.pickDogs();
        WebElement bulldog = DriverManager.getWebDriver().findElement(By.cssSelector("a[href*='K9-BD-01']"));
        Assert.assertTrue(bulldog.isDisplayed());
    }
}
