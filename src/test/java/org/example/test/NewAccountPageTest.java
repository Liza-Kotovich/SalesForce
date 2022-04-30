package org.example.test;

import org.example.driver.DriverSingleton;
import org.example.service.NewAccountPageService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewAccountPageTest extends BaseTest {

    NewAccountPageService newAccountPageService = new NewAccountPageService();

    @Test
    public void createNewAccountTest() {
        newAccountPageService.createNewAccount();
        String actualNameCreatedAccount = newAccountPageService.getTextNameCreatedAccount();
        String expectedNameCreatedAccount = newAccountPageService.getAccountName();
        Assert.assertTrue(actualNameCreatedAccount.contains(expectedNameCreatedAccount), "New account didn't created!");
    }
}
