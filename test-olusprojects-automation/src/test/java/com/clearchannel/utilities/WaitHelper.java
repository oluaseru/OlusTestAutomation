package com.clearchannel.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitHelper {

    public static void waitForElementToDisplay(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
    }

    public static void waitForPresenceOfElementLocated(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
