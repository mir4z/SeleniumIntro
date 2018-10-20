package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.driver.DriverManager;
import util.helperClasses.WaitForElement;

public class LoggedMainPage {

    private String mainPageURL = "http://przyklady.javastart.pl/jpetstore/actions/Catalog.action";
    private Logger logger = LogManager.getRootLogger();
    private FooterPage footerPage;

    @FindBy(css = "img[src*='sm_fish.gif']")
    private WebElement fishImage;

    @FindBy(xpath = "//area[@alt='Birds'][1]")
    private WebElement birdBigParrotImage;

    @FindBy(xpath = "//area[@alt='Birds'][2]")
    private WebElement birdSmallParrotImage;


    @FindBy(css = "img[src*='sm_dogs.gif']")
    private WebElement dogImage;

    @FindBy(css = "area[alt='Cats']")
    private WebElement catImage;


    public LoggedMainPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void checkDog() {
        WaitForElement.waitUntilElementIsClickable(dogImage);
        Assert.assertTrue(dogImage.isDisplayed());
        dogImage.click();

    }

    public void pickDogs() {
        WaitForElement.waitUntilElementIsVisible(dogImage);
        dogImage.click();
    }

    public void pickFish() {
        WaitForElement.waitUntilElementIsVisible(fishImage);
        fishImage.click();
    }

    public void goToMainPage() {
        DriverManager.getWebDriver().navigate().to(mainPageURL);
    }

}
