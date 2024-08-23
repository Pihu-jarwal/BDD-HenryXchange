package org.xchange.base;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import logger.LogReporter;
import org.openqa.selenium.WebDriver;

public class BaseLib {
    public static WebDriver driver;

    @Before ()
    public void before () {
        LogReporter.INFO ("Launching browser");
        driver = DriverFactory.getInstance ()
            .instantiateWebDriver ("chrome");
    }

    @After (order = 0)
    public void after () {
        LogReporter.INFO ("Runs after each scenarios");
        DriverFactory.getInstance ()
            .tearDown ();
    }

    @After (order = 1)
    public void captureFailureScreenshot (Scenario scenario) {
        if (scenario.isFailed ()) {
            LogReporter.INFO ("Screenshot for failure scenario: " + scenario.getName ());
            LogReporter.captureScreenShot ();
        }
    }
}
