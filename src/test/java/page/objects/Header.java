package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.driver.DriverManager;
import util.helperClasses.WaitForElement;

public class Header {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOn;

    public LoginPage goToLoginPage() {
        signOn.click();
        logger.info("Clicked on sign on button. Go to login page");
        return new LoginPage();
    }

    public Header() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


}
