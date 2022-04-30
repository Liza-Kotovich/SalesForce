package org.example.test;

import org.example.pages.BasePage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPageService loginPageService = new LoginPageService();
    String expectedPageText = "Sales";

    @Test
    public void loginTest() {
        HomePage homePage = loginPageService.login();
        String actualTextOfPage = homePage.getTextOfSpanElement();
        Assert.assertEquals(actualTextOfPage, expectedPageText, "The actual text of the page does not match expected!");
    }
}
