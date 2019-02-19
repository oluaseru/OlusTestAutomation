package com.clearchannel.support.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GeneralPage extends BasePage {

    public GeneralPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "h4")
    private WebElement pageTitle;

    @FindBy(css = "#icon-search")
    private WebElement searchIcon;

    public SearchPage clickSearchIcon() {
        searchIcon.click();
        return new SearchPage(driver);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

}
