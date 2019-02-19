package com.clearchannel.support.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "h4")
    private WebElement pageTitle;

    @FindBy(css = "h3.h5 a")
    private List<WebElement> titleOfResult;

    @FindBy(css = ".grid_3.cat-")
    private List<WebElement> searchResults;

    @FindBy(className = "h5")
    private WebElement noResultsMessage;

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public int getSearchResults() {
        return searchResults.size();
    }

    public String getNoResultsMessage() {
        return noResultsMessage.getText();
    }

    public String getResultText(int res) {
        return titleOfResult.get(res).getText();
    }

    public void clickOnResultLink(int res) {
        titleOfResult.get(res).click();
    }

}
