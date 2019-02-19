package com.clearchannel.steps;


import com.clearchannel.support.pageobject.MobilePage;
import com.clearchannel.support.pageobject.SearchResultsPage;
import com.clearchannel.utilities.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchResultPageSteps extends DriverFactory {

    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
    MobilePage mobilePage = new MobilePage(driver);
    private String linkTitle;
    private int results;

    @Then("^Results page title should contain \"([^\"]*)\"$")
    public void iShouldSeeResultsPageTitleContaining(String sTerm) throws Throwable {
        assertTrue(searchResultsPage.getPageTitle().contains(sTerm));
    }

    @Then("^I should see results displayed$")
    public void iShouldSeeResultsDisplayed() throws Throwable {
        assertTrue(searchResultsPage.getSearchResults() > 0);
    }

    @When("^there are no results$")
    public void thereAreNoResults() throws Throwable {
        assertEquals("There are Results displayed", searchResultsPage.getSearchResults(), 0);
    }

    @Then("^a \"([^\"]*)\" message should be displayed$")
    public void aMessageShouldBeDisplayed(String msg) throws Throwable {
        assertEquals("Incorrect Message is displayed", searchResultsPage.getNoResultsMessage(), msg);
    }

    @When("^I click on search result link (\\d+)$")
    public void iClickOnSearchResultLink(int index) throws Throwable {
        linkTitle = searchResultsPage.getResultText(index);
        results = searchResultsPage.getSearchResults();
        searchResultsPage.clickOnResultLink(index);
    }

    @Then("^I should be able to navigate to the corresponding page$")
    public void iShouldBeAbleToNavigateToTheCorrespondingPage() throws Throwable {
        assertEquals("The page is different from result link selected", linkTitle, mobilePage.getSubTitleText());
    }

    @Then("^navigate back to my results page$")
    public void navigateBackToMyResultsPage() throws Throwable {
        driver.navigate().back();
        assertEquals("Number of Results displayed are NOT correct", results, searchResultsPage.getSearchResults());
    }

}
