package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@title='Sales']")
    private WebElement elementForTest;


    public String getTextOfSpanElement() {
        return elementForTest.getAttribute("title");
    }
}
