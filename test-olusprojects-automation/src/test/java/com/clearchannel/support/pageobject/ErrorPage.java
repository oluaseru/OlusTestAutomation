package com.clearchannel.support.pageobject;

import com.clearchannel.utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ErrorPage extends BasePage {

    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement pageTitle;

    @FindBy(css = "[href='JavaScript:history.go(-1)']")
    private List<WebElement> returnToPreviousButton;

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public boolean isReturnToPreviousPageButtonDisplayed() {
        return !returnToPreviousButton.isEmpty();
    }

    public void clickReturnToPreviousPage() {
        returnToPreviousButton.get(0).click();
    }


}
