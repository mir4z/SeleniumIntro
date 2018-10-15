package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.Header;
import page.objects.LoginPage;
public class FailedLoginTest extends BaseTest {

    @Test
    public void check() {
        Header header = new Header();
        LoginPage loginPage = header.goToLoginPage();
        loginPage.inputUsername("mir4ge");
        loginPage.inputPassword("test");
        loginPage.clickOnLoginButton();

        Assert.assertEquals(loginPage.getEerrorMessage(), "Invalid username or password. Signon failed.");
    }

}
