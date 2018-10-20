package page.objects;

import org.openqa.selenium.support.PageFactory;
import util.driver.DriverManager;

public class UnloggedMainPage {
    private String mainPageURL = "http://przyklady.javastart.pl/jpetstore/actions/Catalog.action";


    public UnloggedMainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void goToMainPage() {
        DriverManager.getWebDriver().navigate().to(mainPageURL);
    }

}
