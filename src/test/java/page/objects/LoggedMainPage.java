package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;
import util.Login;

public class LoggedMainPage {
    private String mainPageURL = "http://przyklady.javastart.pl/jpetstore/actions/Catalog.action";

    @FindBy(css = "img[src*='banner_dogs.gif']")
    private WebElement dogBanner;

    @FindBy(css = "area[alt='Fish']")
    private WebElement fishImage;

    @FindBy(xpath = "//area[@alt='Birds'][1]")
    private WebElement birdBigParrotImage;

    @FindBy(xpath = "//area[@alt='Birds'][2]")
    private WebElement birdSmallParrotImage;


    @FindBy(css = "area[alt='Dogs']")
    private WebElement dogImage;

    @FindBy(css = "area[alt='Cats']")
    private WebElement catImage;


    public LoggedMainPage() {
        Login.logIn();
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void pickDogs() {
        dogImage.click();
    }
    public void goToMainPage() {
        DriverManager.getWebDriver().navigate().to(mainPageURL);
    }

}
