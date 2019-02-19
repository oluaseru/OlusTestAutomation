package com.clearchannel.support.pageobject;

import com.clearchannel.utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "textarea")
    private WebElement searchTextBox;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    public void setSearchTextBox(String sTerm) {
        searchTextBox.sendKeys(sTerm);
        submitButton.click();
    }

}
