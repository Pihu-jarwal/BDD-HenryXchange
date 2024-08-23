package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;

public class PropertyDetailPage extends Helper {

    public PropertyDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(@class,'property-name')]")
    private WebElement propertyName;

    @FindBy(xpath = "//div[@class='location-class']/div/p")
    private List<WebElement> assetData;

    @FindBy(css = "p[class='owner']")
    private WebElement ownerName;

    @FindBy(css = "span[class='close-icon']")
    private WebElement crossButton;

    @FindBy(css = "div[class='modal-inner']")
    private WebElement modal;

    @FindBy(xpath = "//span[@class='text-blue']")
    private WebElement otherOwner;

    @FindBy(xpath = "//h2[text()='Financials']")
    private WebElement financials;

    @FindBy(xpath = "(//p[@class='complete-setup'])[1]")
    private WebElement completeAccountSetupFinancials;

    @FindBy(xpath = "//h2[text()='Documents']")
    private WebElement documents;

    @FindBy(xpath = "(//p[@class='complete-setup'])[2]")
    private WebElement completeAccountSetupDocuments;

    @FindBy(xpath = "//h2[text()='Similar Properties']")
    private WebElement similarProperties;

    @FindBy(xpath = "(//p[@class='complete-setup'])[3]")
    private WebElement completeAccountSetupSimilarProperty;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginBtn;


    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmail;


    @FindBy(xpath = "//input[@id='password']")
    private WebElement userPassword;


    @FindBy(xpath = "//p[contains(text(),'Sign')]")
    private WebElement signTheConfidentiality;

    @FindBy(xpath = "(//i[@class='download-doc-icon'])[1]")
    private WebElement downloadIcon;

    @FindBy(xpath = "(//button[text()='Follow'])[2]")
    private WebElement follow;

    @FindBy(xpath = "//i[@class=\"following-icon\"]")
    private WebElement following;


    @FindBy(xpath = "//label[@class='sigincheckbox']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[text()='Decline']")
    private WebElement decline;

    @FindBy(xpath = "//div[contains(@class,'modalInrContainer')]")
    private WebElement modalContainer;

    @FindBy(xpath = "//div[@class='doc']")
    private List<WebElement> documentName;

    @FindBy(xpath = "//a[text()='Market']")
    private WebElement market;

    @FindBy(xpath = "//h1[text()='Market']")
    private WebElement marketPage;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private WebElement propertyBreadcrumbs;

    @FindBy(xpath = "//p[text()='Target Returns']/following-sibling::p")
    private List<WebElement> targetReturns;

    @FindBy(xpath = "//p[text()='Terms']/following-sibling::p")
    private List<WebElement> terms;

    @FindBy(xpath = "//div[@class='target-seclist']")
    private List<WebElement> financialData;


    @FindBy(xpath = "(//i[@class='lock-doc-icon'])[1]")
    private WebElement lockIcon;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]/div/following-sibling::div")
    private WebElement documentLockError;

    @FindBy(xpath = "//button[@aria-label='close']")
    private WebElement closeBtn;

    @FindBy(xpath = "//h2[text()='Owners']")
    private WebElement owner;

    @FindBy(xpath = "//a[@name=\"owners\"]")
    private WebElement ownerLink;

    @FindBy(css = "p[class='ownerNameHead']")
    private WebElement property;

    @FindBy(xpath = "//div[@class='upper']")
    private List<WebElement> aumAndProperties;

    @FindBy(xpath = "//button[text()='View All']")
    private WebElement viewAll;


    @FindBy(xpath = "//h2[text()='Owners']/following-sibling::div")
    private WebElement ownerOfProperty;

    @FindBy(css = "span[class='close-icon']")
    private WebElement crossBtn;

    @FindBy(css = "div[class='modal-inner']")
    private WebElement modalInner;

    @FindBy(xpath = "//h5[@class='property-name ']")
    private List<WebElement> assetName;

    @FindBy(xpath = "//h5[text()='Polanco']")
    private WebElement asset;
  
    @FindBy(xpath = "//h2[text()='Gallery']")
    private WebElement gallery;

    @FindBy(xpath = "//li[@class='slide selected previous']")
    private WebElement galleryImage;

    @FindBy(xpath = "(//div[@class='slider-wrapper axis-horizontal'])[2]")
    private WebElement imageViewer;

    @FindBy(xpath = "//button[@class='control-arrow control-prev']")
    private WebElement previousArrow;

    @FindBy(xpath = "(//button[@class='control-arrow control-next'])[2]")
    private WebElement nextArrow;

    @FindBy(xpath = "//img[@alt=\"thumbnail-7\"]")
    private List<WebElement> selectImage;

    @FindBy(xpath = "//button[text()='read less']")
    private WebElement readLess;

    @FindBy(xpath = "//button[text()='read more']")
    private WebElement readMore;

    @FindBy(xpath = "//div[@class='productSummaryDescp ']/p")
    private WebElement propertyDescription;

    @FindBy(xpath = "//button[text()='View on Map']")
    private WebElement viewMap;

    @FindBy(xpath = "//h2[text()='Location']")
    private WebElement location;

    @FindBy(xpath = "//h3[@class='proptyname ']")
    private List<WebElement> similarPropertyName;

    @FindBy(xpath = "//div[@class='proptyloc']")
    private List<WebElement> similarPropertyData;

    @FindBy(xpath = "//p[@class='colorblack']")
    private List<WebElement> similarPropertyOwnerName;

    @FindBy(xpath = "//div[@class='similar-prop-price']/p")
    private List<WebElement> shares;

    @FindBy(xpath = "//p[contains(@class,'modalTitle')]")
    private WebElement pdfTitle;

    @FindBy(css = "i[class='download-pdf-icon gray']")
    private WebElement downlaodPdfIcon;

    @FindBy(xpath = "//li[@class='side-link ']/a")
    private List<WebElement> leftMenuBar;

    @FindBy(xpath = "//a[contains(text(),'download')]")
    private WebElement downloadConfidentialAgreement;

    @FindBy(xpath = "//button[text()='Proceed']")
    private WebElement proceed;

    @FindBy(xpath = "//p[@class='price-ml']")
    private WebElement lowestSharePrice;

    @FindBy(xpath = "//i[@class='lock-doc-icon']")
    private WebElement lockedIcon;

    @FindBy(xpath = "//button[text()='MARKET']")
    private WebElement marketTab;

    @FindBy(xpath = "//button[text()='Sell']")
    private WebElement sellBtnPropertyDetailPage;

    @FindBy(xpath = "//div[contains(@class,'openOrders')]/h2")
    private WebElement openOrderHeader;

    @FindBy(xpath = "//h2[text()='Open Orders']/sup")
    private WebElement openOrderCount;

    @FindBy(xpath = " //tr[contains(@class,'MuiTableRow-head')]\n")
    private WebElement openOrderTableHeader;

    @FindBy(xpath = "//tr[contains(@class,'MuiTableRow-root')]/td")
    private List<WebElement> openOrderListingData;

    @FindBy(xpath = "(//div[contains(@class,'open-order-list')]/table/tbody/tr/td[6])[1]")
    private WebElement openOrderManageLink;

    @FindBy(xpath = "//div[contains(@class,'investment_holder')]/p")
    private WebElement yourInvestmentTextInYourInvestment;

    @FindBy(xpath = "//div[contains(@class,'investment_holder')]/span")
    private WebElement totalInvestmentInYourInvestment;

    @FindBy(xpath = "(//div[contains(@class,'investment_holder')]/div[1])/span")
    private WebElement totalSharesInYourInvestment;

    @FindBy(xpath = "(//div[contains(@class,'investment_holder')]/div)/div/a")
    private WebElement viewTransactionsInYourInvestment;

    @FindBy(xpath = "//div[contains(@class,'see_btn_holder')] ")
    private WebElement sellBtnPropertyDetail;

    @FindBy(xpath = " //li[@class=\"MuiBreadcrumbs-li\"]//a[text() = 'Property Details']")
    private WebElement propertyDetail;



    public boolean verify_Should_Be_Able_To_View_Owner() {
        return ownerName.isDisplayed();
    }

    public void verify_User_Should_Be_Able_To_View_Asset_Data() {
        for (WebElement element : assetData) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
        Assert.assertTrue(isElementVisible(lowestSharePrice, 10));
    }

    public void verify_Other_Owner_Functionality() {
        clickOnWebElement(otherOwner);
    }

    public void verify_Cross_Button() {
        clickOnWebElement(crossButton);
        Assert.assertFalse(isElementVisible(modal, 10));
    }

    public boolean verify_Functionality_Of_Financials_For_Level1_User() {
        scrollByVisibilityOfElement(driver, financials);
        return financials.isDisplayed();
    }

    public boolean verify_Functionality_OF_Documents_For_Level1_User() {
        Assert.assertTrue(isElementVisible(documents, 10));
        return completeAccountSetupDocuments.isDisplayed();
    }

    public boolean verify_Functionality_OF_Similar_Properties_For_Level1_User() {
        Assert.assertTrue(isElementVisible(similarProperties, 10));
        return completeAccountSetupSimilarProperty.isDisplayed();
    }

    public void set_Email(String email) {
        sendKeys(userEmail, email);
    }

    public void set_Password(String password) {
        sendKeys(userPassword, password);
    }

    public void click_On_Download_Icon() {
        scrollByVisibilityOfElement(driver, documents);
        clickOnWebElement(downloadIcon);
    }

    public boolean verify_Sign_The_Confidentiality_Agreement() {
        return isElementVisible(signTheConfidentiality);
    }

    public void verify_Click_On_Follow_Button() {
        clickOnWebElement(ownerLink);
        clickOnWebElement(follow);
        waitForElement(2);
    }

    public String user_Should_Be_Able_To_View_Following() {
        return getText(following);
    }

    public void verify_Check_Box_Is_Selected() {
        clickOnWebElement(checkBox);
        Assert.assertTrue(checkBox.isEnabled());
    }

    public void verify_Decline_Button() {
        clickOnWebElement(decline);
        Assert.assertFalse(isElementVisible(modalContainer));
    }

    public void verify_User_Should_be_Able_View_Documents() {
        scrollByVisibilityOfElement(driver, similarProperties);
        for (int i = 0; i < documentName.size(); i++) {
            Assert.assertTrue(isElementVisible(documentName.get(i), 10));
        }
        Assert.assertTrue("Locked icon is not visible over document", isElementVisible(lockedIcon));
    }

    public void verify_User_Should_be_Able_View_Documents_Without_Lock_Icon() {
        scrollByVisibilityOfElement(driver, similarProperties);
        for (int i = 0; i < documentName.size(); i++) {
            Assert.assertTrue(isElementVisible(documentName.get(i), 10));
            Assert.assertFalse("Locked icon is visible over document ", isElementVisible(lockedIcon, 10));
        }
    }


    public String verify_Breadcrumbs_Functionality() {
        return getText(propertyBreadcrumbs);
    }

    public void verify_Target_Returns_Data() {
        for (WebElement element : targetReturns) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Terms_Data() {
        for (WebElement element : terms) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Financials_Value() {
        for (WebElement element : financialData) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public void verify_Lock_Icon_Over_Document() {
        clickOnWebElement(lockIcon);
    }

    public String verify_User_Should_Be_Able_To_View_Error() {
        return getText(documentLockError);
    }

    public void verify_Count_Of_Owner() {
        scrollByVisibilityOfElement(driver, documents);
        Assert.assertTrue(isElementVisible(owner, 10));
    }

    public void verify_Aum_And_Properties() {
        for (WebElement element : aumAndProperties) {
            Assert.assertTrue(isElementVisible(element, 10));
        }
    }

    public boolean verify_Asset_Name() {
       return isElementVisible(property,10);
    }

    public void click_On_View_All_Btn() {
        clickOnWebElement(ownerLink);
        clickOnWebElement(viewAll);
    }

    public void verify_Multiple_Owner_Of_Property() {
        Assert.assertTrue(isElementVisible(ownerOfProperty, 10));
    }

    public void verify_Cross_Btn_Functionality() {
        clickOnWebElement(crossBtn);
        Assert.assertFalse(isElementVisible(modalInner));
    }

    public void verify_Property_Name() {
        scrollByVisibilityOfElement(driver, assetName.get(3));
        clickOnWebElement(asset);
    }

    public void click_On_Gallery_Image() {
        clickOnWebElement(galleryImage);
    }

    public boolean verify_User_Navigate_To_Image_Viewer() {
        return isElementVisible(imageViewer,10);
    }

    public void verify_User_Should_Be_ABle_View_Previous_Image() {
        clickOnWebElement(previousArrow);
    }

    public void verify_User_Should_Be_ABle_View_Next_Image() {
        clickOnWebElement(nextArrow);
    }

    public void verify_User_Should_Be_ABle_To_Selected_Image() {
        for (int i = 0; i < selectImage.size(); i++) {
            if (i == 17) {
                clickByAction(imageViewer);
                clickOnWebElement(selectImage.get(i));
            }
        }
    }

    public void click_On_Read_More() {
        clickOnWebElement(readMore);
    }

    public Boolean verify_Read_More_Functionality() {
        return readLess.isDisplayed();
    }

    public void click_On_Read_Less() {
        clickOnWebElement(readLess);
    }

    public Boolean verify_Read_Less_Functionality() {
        return readMore.isDisplayed();
    }

    public void verify_The_Functionality_Of_Map() {
        scrollByVisibilityOfElement(driver, gallery);
        switchTab();
    }

    public void click_On_View_Map() {
        clickOnWebElement(viewMap);
    }

    public void verify_Similar_Property() {
        scrollByVisibilityOfElement(driver, similarProperties);
        Assert.assertTrue(isElementVisible(similarProperties));
    }

    public void verify_User_Should_Be_Able_To_View_Similar_Property_Data() {
        int p = 0;
        for (int i = 0; i < similarPropertyName.size(); i++) {
            Assert.assertTrue(isElementVisible(similarPropertyName.get(i), 10));
            int l = 0;
            for (int j = p; j < similarPropertyData.size() && l < 1; j++) {
                Assert.assertTrue(isElementVisible(similarPropertyData.get(j), 10));
                l++;
            }
            p++;
        }
    }

    public void verify_User_Should_Be_Able_View_Similar_Property_Owner_Shares() {
        int p = 0;
        for (int i = 0; i < similarPropertyOwnerName.size(); i++) {
            Assert.assertTrue(isElementVisible(similarPropertyOwnerName.get(i), 10));
            int l = 0;
            for (int j = p; j < shares.size() && l < 1; j++) {
                Assert.assertTrue(isElementVisible(similarPropertyOwnerName.get(j), 10));
                l++;
            }
            p++;
        }
    }

    public Boolean verify_Pdf_Title() {
        return pdfTitle.isDisplayed();
    }

    public void verify_Menu_Tab_Should_Be_Clickable() {
        for (int i = 0; i < leftMenuBar.size(); i++) {
            clickOnWebElement(leftMenuBar.get(i));
        }
    }

    public void verify_Download_Confidential_Agreement() {
        clickOnWebElement(downloadConfidentialAgreement);
    }

    public Boolean verify_Proceed_Button() {
        return proceed.isEnabled();
    }

    public void click_On_Market_Tab() {
        clickOnWebElement(marketTab);
    }


    public void click_On_Sell_Button_Property_Detail_Page() {
        waitForVisibility(sellBtnPropertyDetailPage);
        clickOnWebElement(sellBtnPropertyDetailPage);
    }

    public void view_Open_Order_With_count() {
        waitForElement(2);
        scrollByVisibilityOfElement(driver,openOrderHeader);
        Assert.assertTrue(isElementVisible(openOrderHeader,10));
        String openOrderText = getText(openOrderHeader).replaceAll("[0-9]", "");
        String openOrderCountNumber = getText(openOrderCount);
        String completeText = openOrderText + openOrderCountNumber;
        Assert.assertEquals("The text with superscript is incorrect", completeText,getText(openOrderHeader));
    }

    public void view_Open_Order_Table_Content() {
        Assert.assertTrue(isElementVisible(openOrderTableHeader, 10));
        for (int i = 0; i < openOrderListingData.size(); i++) {
            Assert.assertTrue(isElementVisible(openOrderListingData.get(i), 10));
        }
    }

    public void click_On_Manage_Open_Order_Table() {
        clickOnWebElement(openOrderManageLink);
    }

    public String view_Your_Investment_Section() {
        return getText(yourInvestmentTextInYourInvestment);

    }

    public Boolean view_Total_Investment_In_Your_Investment_Section(){
        return isElementVisible(totalInvestmentInYourInvestment);
    }

    public Boolean view_Total_Shares_In_The_Property_In_Your_Investment_Section(){
        return isElementVisible(totalSharesInYourInvestment);
    }

    public String view_Transactions_In_Your_Investment_Section(){
        return getText(viewTransactionsInYourInvestment);
    }

    public boolean view_Sell_Button_In_Your_Investment_Section(){
        return isElementVisible(sellBtnPropertyDetail);
    }

    public void click_On_View_Transaction() {
        clickOnWebElement(viewTransactionsInYourInvestment);
    }

    public void click_On_Property_Detail_Over_Breadcrumbs() {
        clickOnWebElement(propertyDetail);
    }



}
