package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.driver.DriverManager;
import util.helperClasses.WaitForElement;

public class FooterPage {

    @FindBy(css = "img[src*='banner_dogs.gif']")
    private WebElement dogBanner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean  isBannerAfterLoginDisplayed() {
        WaitForElement.waitUntilElementIsVisible(dogBanner);
        return dogBanner.isDisplayed();

    }
}
