package org.xchange.pom.tagent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

public class DashboardPage extends Helper {
    public DashboardPage () {
        PageFactory.initElements (driver, this);
    }

    @FindBy (xpath = "//span[text()='TRANSFER AGENT']")
    private WebElement appLogo;

    @FindBy(css = "#composition-button")
    private WebElement avatar;

    @FindBy(xpath = "//img[contains(@src, '782c6687db8db2a10948.svg')]")
    private WebElement notificationIcon;

    @FindBy (xpath = "//span[text()='Properties']")
    private WebElement propertiesTab;

    @FindBy (xpath = "//span[text()='Users']")
    private WebElement usersTab;

    @FindBy (xpath = "//span[text()='Transactions']")
    private WebElement transactionTab;

    @FindBy (xpath = "//span[text()='Shares']")
    private WebElement sharesTab;

    @FindBy (xpath = "//span[text()='Entities']")
    private WebElement entitiesTab;

    @FindBy (xpath = "//span[text()='Admin']")
    private WebElement adminTab;

    public boolean isLogoDisplayed() {
        pause (1000);
        return isDisplayed (appLogo);
    }

    public String getLogoLabel() {
        return getText (appLogo);
    }

    public boolean isAvatarDisplayed() {
        return isDisplayed (avatar);
    }

    public String getAvatarInitials() {
        return getText (avatar);
    }

    public boolean isNotificationIconDisplayed() {
        return isDisplayed (notificationIcon);
    }

    public void clickPropertiesTab() {
        clickOnWebElement (propertiesTab);
    }

    public void clickUsersTab() {
        clickOnWebElement (usersTab);
    }

    public boolean isTransactionTabDisplayed() {
        return isDisplayed (transactionTab);
    }

    public void clickTransactionTab() {
        clickOnWebElement (transactionTab);
        pause (3000);
    }

    public void clickSharesTab() {
        clickOnWebElement (sharesTab);
    }

    public void clickEntitiesTab() {
        clickOnWebElement (entitiesTab);
    }

    public void clickAdminTab() {
        clickOnWebElement (adminTab);
    }
}
