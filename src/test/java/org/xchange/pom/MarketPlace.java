package org.xchange.pom;

import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class MarketPlace extends Helper {

    public MarketPlace() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
    private WebElement userProfileIcon;

    @FindBy(xpath = "//span[text()='Account']")
    private WebElement account;

    @FindBy(xpath = "//p[text()='Account']")
    private WebElement accountScreen;

    @FindBy(xpath = "//span[text()='Logout']")
    private WebElement logout;

    @FindBy(xpath = "//li[@role='menuitem']")
    private List<WebElement> menuItem;

    @FindBy(xpath = "//div[text()='Newest']")
    private WebElement newestFilter;

    @FindBy(xpath = "(//div[text()='Newest'])[2]")
    private WebElement newest;

    @FindBy(xpath = "//div[contains(@id,'option')]")
    private List<WebElement> newestFilterOption;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logoutBtn;

    @FindBy(xpath = "//h5[@class=\"property-name \"]")
    private List<WebElement> propertyList;

    @FindBy(xpath = "(//h5[@class='property-name '])[4]")
    private WebElement property;

    @FindBy(xpath = "(//div[@class=\"tooltip \"])[1]")
    private WebElement propertyName;

    @FindBy(xpath = "//div[contains(@id,\"react-select-2-option\")]")
    private List<WebElement> featured;

    @FindBy(xpath = "//div[text()='Most Popular']")
    private WebElement mostPopular;

    @FindBy(xpath = "//li[@class='MuiBreadcrumbs-li']/p")
    private WebElement propertyDetailPage;

    @FindBy(css = "button[id='demo-customized-button']")
    private WebElement owner;

    @FindBy(css = "p[class='optionName']")
    private List<WebElement> ownerOptions;

    @FindBy(xpath = "//span[@class='uptext']")
    private List<WebElement> ownerOptionsCount;

    @FindBy(xpath = "//p[@class='total-owner']")
    private List<WebElement> totalOwner;

    @FindBy(xpath = "//span[text()='Reset Filters']")
    private WebElement resetFilter;

    @FindBy(xpath = "//h1[text()='Market']")
    private WebElement market;

    @FindBy(css = "input[placeholder='Search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'clear-icon')]")
    private WebElement clearIcon;

    @FindBy(xpath = "//p[@class='total-owner']")
    private List<WebElement> ownerName;

    @FindBy(xpath = "//p[@class='linkAddress']")
    private List<WebElement> address;

    @FindBy(xpath = "//span[@class='address']")
    private List<WebElement> addressOfProperty;

    @FindBy(xpath = "//p[@class='result-not-found']")
    private WebElement noResultFound;

    @FindBy(css = "button[class='shorAllResult']")
    private WebElement showAllResult;

    @FindBy(xpath = "//button[@role='tab' and (text()='Owner')]")
    private WebElement ownerTab;

    @FindBy(xpath = "//p[@class='dots']/span")
    private List<WebElement> assetData;

    @FindBy(xpath = "(//p[contains(@class,'MuiTypography-root')])[3]")
    private WebElement showingMatchingList;

    @FindBy(css = "h6[class='amount']")
    private List<WebElement> price;

    @FindBy(xpath = "//p[text()='Target Returns']/following-sibling::p")
    private List<WebElement> targetReturns;

    @FindBy(xpath = "//p[text()='Terms']/following-sibling::p")
    private List<WebElement> terms;

    @FindBy(xpath = "//div[contains(text(),'User')]")
    private WebElement logoutPopup;

    @FindBy(xpath = "//button[text()='Portfolio ']")
    private WebElement portfolio;

    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')])[6]")
    private WebElement accountSetUP;

    @FindBy(xpath = "//span[contains(@class,'MuiTypography-root')]")
    private List<WebElement> footerHyperLinks;

    @FindBy(xpath = "//div[@id='resources-list-subheader']")
    private List<WebElement> resourceAbout;

    @FindBy(xpath = "//a[contains(@class,'MuiLink-underlineHover')]")
    private List<WebElement> hyperLinks;

    @FindBy(xpath = "//span[text()='Support']")
    private WebElement support;

    @FindBy(xpath = "//span[@class='text-blue link']")
    private List<WebElement> otherOwner;

    @FindBy(xpath = "//h2[text()='Owners']/following-sibling::div/p")
    private List<WebElement> ownerNameOfOthers;

    @FindBy(xpath = "//span[text()='Careers']")
    private WebElement careers;

    @FindBy(xpath = "//button[text()='Buy']")
    private List<WebElement> buyBtn;

    @FindBy(xpath = "//p[@class=\"linkName\"]")
    private WebElement assetName;


    @FindBy(xpath = "  //li[@class=\"MuiBreadcrumbs-li\"]//a[text() = 'Market']")
    private WebElement marketBreadCrumb;

    public void click_On_User_Profile_Icon() {
        clickOnWebElement(userProfileIcon);
    }

    public void verify_User_Should_Be_Able_To_View_Two_Popup() {
        for (WebElement element : menuItem) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void click_On_Account() {
        waitForElement(2);
        clickOnWebElement(account);
    }

    public String verify_Account_Page() {
        return getText(accountScreen);
    }

    public void click_On_Logout_Button() {
        clickOnWebElement(userProfileIcon);
        clickOnWebElement(logout);
        clickOnWebElement(logoutBtn);
    }

    public void verify_Filters_Of_Newest() {
        clickOnWebElement(newestFilter);
    }

    public void verify_Filter_Options_Of_AllFilter() {
        for (WebElement element : newestFilterOption) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Property_Name_Of_AllFilters() {
        waitForElement(3);
        for (int i = 0; i < propertyList.size(); i++) {
            Assert.assertTrue(isElementVisible(propertyList.get(i), 10));
        }
    }

    public void verify_Featured_Option() {
        for (int i = 0; i < featured.size(); i++) {
            if (i == 1)
                clickOnWebElement(featured.get(i));
        }
    }

    public void verify_Most_Popular_Filter() {
        clickOnWebElement(mostPopular);
    }

    public void click_On_Property_Name(String assetName) {
        waitForElement(2);
        WebElement propertyName = driver.findElement(By.xpath("//mark[contains(text(),'"+assetName+"')]"));
        clickOnWebElement(propertyName);
    }

    public String verify_Property_Detail_Page() {
        return getText(propertyDetailPage);
    }

    public void verify_Owner_Filter() {
        clickOnWebElement(owner);
    }

    public void verify_Owner_Filter_Options() {
        int count = 0;
        for (int i = 0; i < ownerOptions.size(); i++) {
            Assert.assertTrue(isElementVisible(ownerOptions.get(i), 10));
            count = ownerOptions.size();
            for (int j = 0; j < ownerOptionsCount.size(); j++) {
                if (i == j) {
                    Assert.assertTrue(isElementVisible(ownerOptionsCount.get(j)));
                }
            }
        }
        Assert.assertTrue(count <= ownerOptions.size());
    }

    public void click_On_Owner_Option() {
        int i;
        for (i = 1; i < ownerOptions.size() - 1; i++) {
            if (i == 4) {
                clickOnWebElement(ownerOptions.get(i));
            }
        }
    }

    public String verify_Should_Be_Refresh_According_To_Selected_Owner() {
        for (int j = 0; j < propertyList.size(); j++) {
            Assert.assertTrue(isElementVisible(propertyList.get(j), 10));
            for (int i = 0; i < totalOwner.size(); i++) {
                if (i == j) {
                    Assert.assertTrue(isElementVisible(totalOwner.get(i), 10));
                }
            }
        }
        return null;
    }

    public void verify_Check_The_Checkbox_Of_Owner() {

        for (int i = 0; i < ownerOptions.size(); i++) {
            if (i <= 2) {
                clickOnWebElement(ownerOptions.get(i));
                clickByAction(owner);
                clickOnWebElement(owner);
            }

        }
        clickByAction(owner);
    }


    public void verify_Reset_Filter() {
        clickOnWebElement(resetFilter);
    }

    public void verify_Search_Field() {
        clickOnWebElement(searchField);
    }

    public void verify_Enter_Property_Name_On_Search_Field(String propertyName) {
        sendKeys(searchField, propertyName);
    }

    public void verify_Data_is_Coming_According_To_Search_Keyword() {
        clickOnWebElement(showAllResult);
        waitForElement(2);
        Assert.assertTrue(isElementVisible(showingMatchingList));
        String length = showingMatchingList.getText().replace("Showing", " ").replace("matching", " ").replace("results", " ");
        String d = length.trim();
        int x = 0;
        try {
            x = Integer.parseInt(d);
        } catch (Exception e) {
            LogReporter.INFO("error" + e);
        }
        int p = 0;
        for (int i = 1; i < x; i++) {
            Assert.assertTrue(isElementVisible(propertyList.get(i - 1), 10));
            int l = 0;
            for (int j = p; j <= x && l < 1; j++) {
                Assert.assertTrue(isElementVisible(ownerName.get(j)));
                l++;
            }
            p++;
            Assert.assertTrue(isElementVisible(addressOfProperty.get(i - 1)));
        }
        scrollToHeightByJs();
    }

    public void verify_Owner_Is_Coming_According_To_Search_keyword() {
        for (WebElement element : ownerName) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Address_Is_Coming_According_To_Search_keyword() {
        for (WebElement element : address) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Enter_Owner_Name_On_Search_Field(String ownerName) {
        scrollByVisibilityOfElement(driver, newestFilter);
        sendKeys(searchField, ownerName);
    }

    public void verify_Enter_Address_Name_On_Search_Field(String address) {
        sendKeys(searchField, address);
    }

    public void click_On_Cross_Icon(){
        clickOnWebElement(clearIcon);
    }

    public void verify_Enter_Random_Word_On_Search(String randomText) {
        sendKeys(searchField, randomText);
    }

    public String verify_Search_If_We_Enter_Random_Word() {
        return noResultFound.getText();
    }

    public void verify_Asset_Listing_Data() {
        int p = 0;
        for (int i = 0; i < propertyList.size(); i++) {
            Assert.assertTrue(isElementVisible(propertyList.get(i), 10));
            scrollToHeightByJs();
            int l = 0;
            for (int j = p; j < assetData.size() && l < 3; j++) {
                Assert.assertTrue(isElementVisible(assetData.get(j), 10));
                l++;
            }
            p += 3;
            for (int k = 0; k < price.size(); k++) {
                if (k == 0) {
                    Assert.assertTrue(isElementVisible(price.get(k), 10));
                }
            }
        }
    }

    public void verify_Target_Returns_Data() {
        int p = 0;
        for (int i = 0; i < propertyList.size(); i++) {
            Assert.assertTrue(isElementVisible(propertyList.get(i), 10));
            int l = 0;
            for (int j = p; j < targetReturns.size() && l < 3; j++) {
                Assert.assertTrue(isElementVisible(targetReturns.get(j), 10));
                l++;
            }
            p += 3;
        }
    }

    public void verify_Terms_Data() {
        int p = 0;
        for (int i = 0; i < propertyList.size(); i++) {
            Assert.assertTrue(isElementVisible(propertyList.get(i), 10));
            int l = 0;
            for (int j = p; j < terms.size() && l < 3; j++) {
                Assert.assertTrue(isElementVisible(terms.get(j), 10));
                l++;
            }
            p += 3;
        }
    }

    public void click_On_Newest_Option() {
        clickOnWebElement(newest);
    }

    public String verify_User_Should_Be_Able_To_View_Portfolio() {
        return getText(portfolio);
    }

    public String verify_User_Should_Be_Able_To_View_Owner() {
        return getText(ownerTab);
    }

    public boolean verify_Should_Be_Able_To_View_Account_Setup() {
        return accountSetUP.isDisplayed();
    }

    public void verify_Scroll_Page() {
        Assert.assertTrue(isElementVisible(support));
        scrollByVisibilityOfElement(driver, support);
    }

    public void verify_Should_Be_Able_To_View_Resource_And_About() {
        for (WebElement element : resourceAbout) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Should_Be_Able_To_View_footer_Hyper_Links() {
        for (WebElement element : footerHyperLinks) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Social_Platform_And_Bottom_Links() {
        for (WebElement element : hyperLinks) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_The_Other_Owner_Functionality() {
        waitForElement(2);
        for (int i = 0; i < otherOwner.size(); i++) {
            if (i == 0)
                clickOnWebElement(otherOwner.get(i));
        }
    }

    public void verify_User_Should_Be_Able_To_View_Other_Owner() {
        for (WebElement element : ownerNameOfOthers) {
            Assert.assertTrue("Other owner name is not displayed ", isElementVisible(element, 10));
        }
    }

    public String get_Current_URL(){
        waitForElement(2);
        return driver.getCurrentUrl();
    }

    public void Enter_Asset_Name_In_Search_Field(String propertyName) {
        sendKeys(searchField, propertyName);
    }

    public void clicks_On_Asset_Name() {
        waitForElement(2);
        clickOnWebElement(assetName);
    }

    public Boolean click_On_Owner_Tab(){
        try {
            waitForElement(3);
            clickOnWebElement(ownerTab);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void click_On_Market_Over_Breadcrumbs() {
        clickOnWebElement(marketBreadCrumb);
    }

}
