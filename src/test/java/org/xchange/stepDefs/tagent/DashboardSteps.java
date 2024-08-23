package org.xchange.stepDefs.tagent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.xchange.pom.tagent.DashboardPage;

public class DashboardSteps {
    DashboardPage dashboardPage;

    @And ("User click on the transaction tab.")
    public void userClickOnTheTransactionTab () {
        dashboardPage = new DashboardPage ();
        dashboardPage.clickTransactionTab();
    }

    @Then ("User clicks on the users tab.")
    public void userClicksOnTheUsersTab () {
        dashboardPage = new DashboardPage ();
        dashboardPage.clickUsersTab ();
    }

    @And ("User lands on the dashboard page on which properties tab is selected by default")
    public void userLandsOnTheDashboardPageOnWhichPropertiesTabIsSelectedByDefault () {
        dashboardPage = new DashboardPage ();
        Assert.assertTrue ("App logo is not displayed.",
            dashboardPage.isLogoDisplayed ());
        Assert.assertTrue ("Avatar is not displayed.",
            dashboardPage.isAvatarDisplayed ());
        Assert.assertTrue ("Notification icon is not displayed.",
            dashboardPage.isNotificationIconDisplayed ());
    }

    @And ("Verify user is able to see the transactions tab.")
    public void verifyUserIsAbleToSeeTheTransactionsTab () {
        dashboardPage = new DashboardPage ();
        Assert.assertTrue ("", dashboardPage.isTransactionTabDisplayed ());
    }
}
