package com.clearchannel.steps;

import com.clearchannel.support.pageobject.HomePage;
import com.clearchannel.utilities.DriverFactory;
import com.clearchannel.utilities.DriverUtilities;
import com.clearchannel.utilities.WaitHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;


public class BeforeTest extends DriverFactory {


    @Before("@search,")
    public void beforeScenario() {
        DriverFactory.getDriver();
    }

    @After("@search,")
    public void afterScenario(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            new DriverUtilities().takeScreenShot(scenario.getName().concat(new DriverUtilities().getTimeStamp()));
            DriverFactory.destroyDriver();
        }
        DriverFactory.destroyDriver();
    }

    @Given("^I'm on the the Clear Channel website \"([^\"]*)\"$")
    public void iMOnTheTheClearChannelWebsite(String url) throws Throwable {
        getDriver().get(url);
        WaitHelper.waitForPresenceOfElementLocated(driver, By.cssSelector("[style ='opacity: 0; display: none;']"));
        assertTrue("This is NOT the HomePage", new HomePage(driver).isHeroImageDisplayed());
    }

}
