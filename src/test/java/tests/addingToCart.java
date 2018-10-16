package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LoggedMainPage;
import util.DriverManager;
import util.Login;

public class addingToCart extends  BaseTest{

    @Test
    public void buyAFish() {
        LoggedMainPage loggedMainPage = new LoggedMainPage();
        loggedMainPage.pickFish();
        DriverManager.getWebDriver().findElement(By.linkText("FI-SW-01")).click();
        DriverManager.getWebDriver().findElement(By.linkText("EST-2")).click();
        DriverManager.getWebDriver().findElement(By.partialLinkText("to Cart")).click();
        WebElement remove = DriverManager.getWebDriver().findElement(By.linkText("Remove"));

        Assert.assertTrue(remove.isDisplayed());
    }
}

