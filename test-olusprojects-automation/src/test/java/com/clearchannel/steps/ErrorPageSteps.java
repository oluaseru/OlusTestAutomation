package com.clearchannel.steps;

import com.clearchannel.support.pageobject.ErrorPage;
import com.clearchannel.utilities.DriverFactory;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;


public class ErrorPageSteps extends DriverFactory {

    ErrorPage errorPage = new ErrorPage(driver);

    @Then("^an error page be should be displayed$")
    public void anErrorPageBeShouldBeDisplayed() throws Throwable {
        assertEquals("Error page is NOT displayed", errorPage.getPageTitle(), "The following errors were encountered");
    }

}
