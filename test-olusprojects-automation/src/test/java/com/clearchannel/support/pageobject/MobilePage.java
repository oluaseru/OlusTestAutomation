package com.clearchannel.support.pageobject;

import com.clearchannel.utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePage extends BasePage {

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".slab-content .h2")
    private WebElement subTitleText;

    public String getSubTitleText() {
        return subTitleText.getText();
    }
}
