package util;


import page.objects.LoginPage;

public class Login {
    private static String loginURL = "http://przyklady.javastart.pl/jpetstore/actions/Account.action?signonForm=";

    public static void logIn() {
        DriverManager.getWebDriver().navigate().to(loginURL);
        LoginPage loginPage = new LoginPage();
        loginPage.successfullLogin();
    }

}
