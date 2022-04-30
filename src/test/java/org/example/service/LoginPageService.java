package org.example.service;

import org.example.model.User;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;

public class LoginPageService {

    private static final String URL = "https://tms7.my.salesforce.com";
    private static final String LOGIN = "elizabeth.kotovich-vtf4@force.com";
    private static final String PASSWORD = "TMSonlAQA12Java";

    LoginPage loginPage = new LoginPage();

    public HomePage login() {
        loginPage.openPage(URL)
                .fillInLogin(LOGIN)
                .fillInPassword(PASSWORD)
                .clickLoginButton();
        return new HomePage();
    }
}
