package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class Header {

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signOn;

    public Header() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage goToLoginPage() {
        signOn.click();
        return new LoginPage();
    }

}
