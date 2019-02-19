package com.clearchannel.support.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "media-modules")
    private List<WebElement> heroImage;

    public boolean isHeroImageDisplayed() {
        return !heroImage.isEmpty();
    }
}
