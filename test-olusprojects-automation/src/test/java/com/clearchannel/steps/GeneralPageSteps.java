package com.clearchannel.steps;

import com.clearchannel.support.pageobject.ErrorPage;
import com.clearchannel.support.pageobject.GeneralPage;
import com.clearchannel.utilities.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;


public class GeneralPageSteps extends DriverFactory {

    GeneralPage generalPage = new GeneralPage(getDriver());
    ErrorPage errorPage = new ErrorPage(driver);
    private String pageTitleText = "";

    @When("^I enter \"([^\"]*)\" into main search$")
    public void iEnterIntoMainSearch(String sTerm) throws Throwable {
        pageTitleText = generalPage.getPageTitle();
        generalPage.clickSearchIcon().setSearchTextBox(sTerm);
    }

    @Then("^I should be able to return to previous Page$")
    public void theOptionToReturnToPreviousPage() throws Throwable {
        errorPage.clickReturnToPreviousPage();
        assertEquals("This is NOT the previous page", pageTitleText, generalPage.getPageTitle());
    }

}

