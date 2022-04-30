package org.example.pages;

import org.example.elements.DropDown;
import org.example.elements.InputField;
import org.example.model.Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage {

    @FindBy(xpath = "//button[@title = 'Save']")
    private WebElement saveButton;

    public NewAccountPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public NewAccountPage accountNameInput(Account account) {
        new InputField("Account Name").writeText(account.getAccountName());
        return this;
    }

    public NewAccountPage websiteInput(Account account) {
        new InputField("Website").writeText(account.getWebSite());
        return this;
    }

    public NewAccountPage chooseAnIndustry(Account account) {
        new DropDown("Industry").selectOption(account.getIndustry());
        return this;
    }

    public void clickSave() {
        saveButton.click();
    }

    @FindBy(xpath = "//div[@class='testonly-outputNameWithHierarchyIcon slds-grid sfaOutputNameWithHierarchyIcon']//*[contains(text(), 'AQA Account 1')]")
    private WebElement nameOfAccount;

    public String getTextOfNameOfAccount() {
        return nameOfAccount.getText();
    }

}
