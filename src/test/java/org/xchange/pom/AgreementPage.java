package org.xchange.pom;

import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.List;


public class AgreementPage extends Helper {

    public AgreementPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'signed-docs')]")
    private WebElement myAgreementSection;

    @FindBy(xpath = "//div[contains(@class,'signed-docs')]/*[name()='svg']")
    private WebElement angleBracketIcon;

    @FindBy(xpath = "//ol[contains(@class,'MuiBreadcrumbs-ol')]")
    private List<WebElement> breadCrumbs;

    @FindBy(xpath = "//div[contains(@class,'signed-docs-modal')]/p")
    private WebElement myAgreementScreenText;

    @FindBy(xpath = "//table[contains(@class,'commonTable')]//tbody//tr")
    private List<WebElement> agreementListName;

    @FindBy(xpath = "//table[contains(@class,'commonTable')]")
    private WebElement agreementTable;


    @FindBy(xpath = "//td[text() = 'Lakewood Oaks']")
    private WebElement LakewoodOaks;

    @FindBy(xpath = "(//button[@class='view'])[1]")
    private WebElement viewButton;

    @FindBy(xpath = "//div[contains(@id,'alert-dialog-title')]//p")
    private WebElement verifyPdfView;

    @FindBy(xpath = "(//button[@class='download']//*[name()='svg'])[1]")
    private WebElement documentDownloadButton;

    @FindBy(xpath = "(//td[contains(@class,'propertyName')])[1]")
    private WebElement propertyNameAgreement;


    public void verify_My_Agreement_Section_Not_View() {
        scrollToHeightByJs();
        Assert.assertFalse(isElementVisible(myAgreementSection));
    }

    public Boolean verify_My_Agreement_Section_On_Account_Page() {
        scrollByVisibilityOfElement(driver, myAgreementSection);
        return myAgreementSection.isDisplayed();
    }

    public void click_On_Angle_Bracket_Icon() {
        clickOnWebElement(angleBracketIcon);
    }

    public void verify_Breadcrumbs() {
        for (WebElement element : breadCrumbs) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void verify_Table_Format_All_Listing_Of_Signed_Agreement() {
        WebElement table = agreementTable;

        for (WebElement headerValue : table.findElements(By.xpath("//table//thead"))) {
            for (WebElement headerCell : headerValue.findElements(By.xpath("//table//thead//th"))) {
                Assert.assertTrue(isElementVisible(headerCell));
            }
        }
        for (WebElement rowValues : table.findElements(By.xpath("//tr"))) {
            for (WebElement cell : rowValues.findElements(By.xpath("td"))) {
                Assert.assertTrue(isElementVisible(cell));
            }
        }
    }

    public String verify_My_Agreement_Page() {
        return getText(myAgreementScreenText);
    }

    public void verify_Agreement_List_On_Agreement_Page() {
        for (WebElement element : agreementListName) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void scroll_Vertical_And_View_Full_List_Document() {
        for (WebElement element : agreementListName) {
            Assert.assertTrue(isElementVisible(element));
        }
    }

    public void click_On_Document_View_Button() {
        clickOnWebElement(viewButton);
    }

    public String verify_Pdf_View() {
        return getText(verifyPdfView);
    }


    public void click_On_Download_Button() {
        createDownloadFolder();
        waitforElementVisible(documentDownloadButton, 5);
        clickOnWebElement(documentDownloadButton);
    }

    public void verify_Agreement_Download_File() {
        waitForElement(5);
        validateDownloadedFile();
    }

    public Boolean validate_Property_Name_On_Agreement_Page() {
        String expectedValue = SellSharePage.property;
        return expectedValue.equals(propertyNameAgreement.getText());
    }
}
