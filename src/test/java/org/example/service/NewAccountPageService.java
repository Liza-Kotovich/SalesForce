package org.example.service;

import org.example.model.Account;
import org.example.pages.HomePage;
import org.example.pages.NewAccountPage;

public class NewAccountPageService extends LoginPageService {

    public String accountName = "AQA Account 1";
    public String webSite = "www.onliner.by";
    public String industry = "Apparel";

    NewAccountPage newAccountPage = new NewAccountPage();

    public String getAccountName() {
        return accountName;
    }

    public void createNewAccount() {
        login();
        Account account = new Account(accountName, webSite, industry);
        newAccountPage.openPage("https://tms7.lightning.force.com/lightning/o/Account/new")
                .accountNameInput(account)
                .websiteInput(account)
                .chooseAnIndustry(account)
                .clickSave();
    }

    public String getTextNameCreatedAccount() {
        return newAccountPage.getTextOfNameOfAccount();
    }
}
