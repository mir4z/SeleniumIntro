package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.DriverManager;
import util.Login;
import util.WaitForElement;

public class LoggedMainPage {
    private String mainPageURL = "http://przyklady.javastart.pl/jpetstore/actions/Catalog.action";


    @FindBy(css = "area[alt='Fish']")
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
        Login.logIn();
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

    public void goToMainPage() {
        DriverManager.getWebDriver().navigate().to(mainPageURL);
    }

}
