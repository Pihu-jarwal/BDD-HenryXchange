package org.xchange.pom;

import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class HomePage extends Helper {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Logo']")
    private WebElement henryLogo;

    @FindBy(xpath = "//button[normalize-space()='Market']")
    private WebElement marketText;

    @FindBy(xpath = "//div[@role='tablist']/button[normalize-space()='Market']")
    private WebElement marketDefaultSelect;

    @FindBy(xpath = "//button[normalize-space()='How It Works']")
    private WebElement howItWorksTab;

    @FindBy(xpath = "//button[normalize-space()='Investors']")
    private WebElement investorsTab;

    @FindBy(xpath = "//button[normalize-space()='Syndicators']")
    private WebElement syndicatorsTab;

    @FindBy(xpath = "//button[normalize-space()='About']")
    private WebElement aboutTab;

    @FindBy(xpath = "//div[@role='tablist']/button")
    private List<WebElement> tabListButton;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    private WebElement loginButtonText;

    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//p[contains(text(),'Get Started')]")
    private WebElement verifySignupPage;

    @FindBy(xpath = "//h1[normalize-space()='Discover your next real opportunity.']")
    private WebElement placeHolderText;

    @FindBy(xpath = "//h5[@class='property-name']")
    private List<WebElement> propertyName;

    @FindBy(xpath = "//figure[@class='property-image']")
    private List<WebElement> assetPicture;

    @FindBy(xpath = "(//div[contains(@class,'v-flex')]/h5)[1]")
    private WebElement assetName;

    @FindBy(xpath = "//div[contains(@class,'white-card')][1]//div[1]/div[1]//p[3]")
    private WebElement assetOwner;

    @FindBy(xpath = "(//div[contains(@class,'v-flex MuiBox-root')][1]//p//span)[1]")
    private WebElement location;

    @FindBy(xpath = "//*[@id='home-container']/div[2]/div[1]/div[2]/div/div[1]/div/p/span[@class='class']")
    private List<WebElement> assetClassList;

    @FindBy(xpath = "//div[contains(@class,'white-card')][1]//div[1]/div[1]//p//span[3]")
    private WebElement numberOfUnits;

    @FindBy(xpath = "//div[contains(@class,'white-card')][1]//div[1]//div[2]//h6")
    private WebElement sharePrice;

    @FindBy(xpath = "(//p[@class='total-owner']/span)[1]")
    private WebElement owner2others;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[1]//p[2]")
    private WebElement IRRText;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/p[2]/span[1]")
    private WebElement IRRTextValue;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[1]//p[3]")
    private WebElement ARRText;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[1]//p[3]//span")
    private WebElement ARRTextValue;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[1]//p[4]")
    private WebElement equityMultipleText;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[1]//p[4]//span")
    private WebElement equityMultipleTextValue;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[2]")
    private WebElement purchaseDate;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[2]//span")
    private WebElement purchaseDateValue;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[3]")
    private WebElement dividends;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[3]//span")
    private WebElement dividendsValue;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[4]")
    private WebElement depreciation;

    @FindBy(xpath = "//div[contains(@class,'right-section')]//div[1]//div[2]//div[2]//p[4]//span")
    private WebElement depreciationValue;

    @FindBy(xpath = "(//button[contains(@class,'btn buy-btn')])[1]")
    private WebElement buyButton;

    @FindBy(xpath = "(//div[contains(@class,'MuiListSubheader-root')])[1]")
    private WebElement resourcesHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'MuiListSubheader-root')])[2]")
    private WebElement aboutHeadingTextOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[1]")
    private WebElement howItWorkSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[2]")
    private WebElement resourcesSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[3]")
    private WebElement supportSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[4]")
    private WebElement aboutUsSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[5]")
    private WebElement contactUsSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[6]")
    private WebElement careersSubHeadingOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[7]")
    private WebElement linkedInOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[8]")
    private WebElement twitterOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[9]")
    private WebElement facebookOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'main-footer home')]//a)[10]")
    private WebElement fullDisclosureOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'f-bottom-links')]//a)[1]")
    private WebElement privacyPolicyOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'f-bottom-links')]//a)[2]")
    private WebElement dataSecurityOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'f-bottom-links')]//a)[3]")
    private WebElement termsOfUseOnFooter;

    @FindBy(xpath = "(//div[contains(@class,'f-bottom-links')]//a)[4]")
    private WebElement websiteDataCollectionProcess;

    @FindBy(xpath = "//p[contains(@class,'MuiTypography-root MuiTypography-body1')]")
    private WebElement henryOverviewFooter;


    public String verify_Redirection_Of_Home_Page() {
        waitForElement(2);
          return driver.getCurrentUrl();
    }

    public Boolean verify_Henry_Logo() {
        return henryLogo.isDisplayed();
    }

    public Boolean verify_Market_Tab_Default_Selected(){
      return  marketDefaultSelect.getAttribute("class").contains("aria-selected");
    }

    public String view_Market_Tab() {
        return getText(marketText);
    }

    public void verify_Tab_List_Button() {
        for (WebElement element : tabListButton) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public String view_How_It_Works_Tab(){
        return getText(howItWorksTab);
    }

    public String view_Investors_Tab(){
        return getText(investorsTab);
    }

    public String view_Syndicators_Tab(){
        return getText(syndicatorsTab);
    }

    public String view_About_Tab(){
        return getText(aboutTab);
    }

    public Boolean login_Button_Text() {
        return loginButtonText.isDisplayed();
    }

    public void click_Login_Button() {
        clickOnWebElement(loginButtonText);
    }

    public void click_Signup_Button() {
        clickOnWebElement(signUpButton);
    }

    public void navigate_To_Back() {
        driver.navigate().back();
    }

    public Boolean signup_Button() {
        return signUpButton.isDisplayed();
    }

    public Boolean verify_Placeholder_Text() {
        return placeHolderText.isDisplayed();
    }

    public void verify_Asset_Listing() {
        scrollToHeightByJs();
        for (WebElement element : propertyName) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void verify_Asset_Picture() {
        waitForElement(2);
        for (WebElement element : assetPicture) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public Boolean asset_Name() {
        return assetName.isDisplayed();
    }

    public void verify_Asset_Class() {
        for (WebElement element : assetClassList) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public Boolean asset_Owner() {
        return assetOwner.isDisplayed();
    }

    public boolean asset_Location() {
        return location.isDisplayed();
    }

    public Boolean asset_Number_Of_Units() {
        return numberOfUnits.isDisplayed();
    }

    public Boolean asset_Share_Price() {
        return sharePrice.isDisplayed();
    }

    public void click_On_Buy_Button() {
        Assert.assertTrue(isElementVisible(buyButton, 5));
        clickOnWebElement(buyButton);
    }

    public void click_On_2_Others_link() {
        waitForElement(5);
        clickOnWebElement(owner2others);
        waitForElement(5);
    }

    public void verify_IRR_Text() {
        Assert.assertTrue(isElementVisible(IRRText, 5));
        Assert.assertFalse(getText(IRRTextValue).isEmpty());
    }

    public void verify_AAR_Text() {
        Assert.assertTrue(isElementVisible(ARRText, 5));
        Assert.assertFalse(getText(ARRTextValue).isEmpty());
    }

    public void verify_Equity_Multiple_Text() {
        Assert.assertTrue(isElementVisible(equityMultipleText, 5));
        Assert.assertFalse(getText(equityMultipleTextValue).isEmpty());
    }

    public void verify_PurchaseDate_Text() {
        Assert.assertTrue(isElementVisible(purchaseDate, 5));
        Assert.assertFalse(getText(purchaseDateValue).isEmpty());
    }

    public void verify_Dividends_Text() {
        Assert.assertTrue(isElementVisible(dividends, 5));
        Assert.assertFalse(getText(dividendsValue).isEmpty());
    }

    public void verify_Depreciation_Text() {
        Assert.assertTrue(isElementVisible(depreciation, 5));
        Assert.assertFalse(getText(depreciationValue).isEmpty());
    }

    public void scroll_Till_Last_Property() {
        scrollByVisibilityOfElement(driver, resourcesHeadingOnFooter);
    }

    public void verify_Signup_Page() {
        Assert.assertTrue(isElementVisible(verifySignupPage,10));
    }

    public String verify_Resources_Heading_Text() {
        return getText(resourcesHeadingOnFooter);
    }

    public String verify_About_Heading_Text(){
        return getText(aboutHeadingTextOnFooter);
    }

    public String verify_How_It_Works_SubHeading_Of_Resources(){
        return getText(howItWorkSubHeadingOnFooter);
    }

    public String verify_Resources_SubHeading_Of_Resources(){
        return getText(resourcesSubHeadingOnFooter);
    }

    public String verify_Support_SubHeading_Of_Resources(){
        return getText(supportSubHeadingOnFooter);
    }


    public String verify_About_Us_SubHeading_Of_About(){
        return getText(aboutUsSubHeadingOnFooter);
    }

    public String verify_Contact_Us_SubHeading_Of_About(){
        return getText(contactUsSubHeadingOnFooter);
    }

    public String verify_Careers_SubHeading_Of_About(){
        return getText(careersSubHeadingOnFooter);
    }


    public String verify_LinkedIn_Social_Platform() {
        return getText(linkedInOnFooter);
    }

    public String verify_Twitter_Social_Platform() {
        return getText(twitterOnFooter);
    }

    public String verify_Facebook_Social_Platform() {
        return getText(facebookOnFooter);
    }

    public void verify_Henry_Overview_Text() {
        Assert.assertTrue(isElementVisible(henryOverviewFooter));
    }

    public String verify_Full_Disclosure_On_Footer() {
        return getText(fullDisclosureOnFooter);
    }

    public String verify_Privacy_Policy_On_Footer(){
        return getText(privacyPolicyOnFooter);
    }

    public String verify_Data_Security_On_Footer(){
        return getText(dataSecurityOnFooter);
    }

    public String verify_Terms_Of_Use_On_Footer(){
        return getText(termsOfUseOnFooter);
    }

    public String verify_Website_Data_Collection_Process_On_Footer(){
        return getText(websiteDataCollectionProcess);
    }

}
