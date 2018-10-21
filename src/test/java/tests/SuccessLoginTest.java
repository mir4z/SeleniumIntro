package tests;

import org.testng.annotations.Test;
import page.objects.LoggedMainPage;
import util.helperClasses.Login;

public class SuccessLoginTest extends BaseTest {

    @Test
    public void check() {
        LoggedMainPage loggedMainPage = Login.logIn();



    }

}
