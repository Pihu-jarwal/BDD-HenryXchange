package org.xchange.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.util.Set;

public class Footer extends Helper {

    public Footer() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Contact Us']")
    private WebElement contactUs;

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

    @FindBy(xpath = "//a[text()='Contact Us']")
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

    static String parent = null;

    public void scroll_Till_Last_Property() {
        scrollByVisibilityOfElement(driver, contactUs);
    }


    public String verify_Resources_Heading_Text() {
        return getText(contactUs);
    }

    public String verify_About_Heading_Text() {
        return getText(aboutHeadingTextOnFooter);
    }

    public String verify_How_It_Works_SubHeading_Of_Resources() {
        return getText(howItWorkSubHeadingOnFooter);
    }

    public String verify_Resources_SubHeading_Of_Resources() {
        return getText(resourcesSubHeadingOnFooter);
    }

    public String verify_Support_SubHeading_Of_Resources() {
        return getText(supportSubHeadingOnFooter);
    }


    public String verify_About_Us_SubHeading_Of_About() {
        return getText(aboutUsSubHeadingOnFooter);
    }

    public String verify_Contact_Us_SubHeading_Of_About() {
        return getText(contactUsSubHeadingOnFooter);
    }

    public String verify_Careers_SubHeading_Of_About() {
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

    public String verify_Privacy_Policy_On_Footer() {
        return getText(privacyPolicyOnFooter);
    }

    public String verify_Data_Security_On_Footer() {
        return getText(dataSecurityOnFooter);
    }

    public String verify_Terms_Of_Use_On_Footer() {
        return getText(termsOfUseOnFooter);
    }

    public String verify_Website_Data_Collection_Process_On_Footer() {
        return getText(websiteDataCollectionProcess);
    }

    public void click_On_Full_Disclosure_link() {
        clickOnWebElement(fullDisclosureOnFooter);
        waitForElement(3);
    }

    public String verify_Redirection_Of_Bottom_Links(String page, String expectedEndPoint) {
        parent = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        String actualPdfTab = null;
        for (String handle : windowHandles) {
            if (!handle.equals(parent)) {
                actualPdfTab = handle;
                break;
            }
        }

        Assert.assertNotNull(page + " page not opened.", actualPdfTab);
        driver.switchTo().window(actualPdfTab);
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue("The " + page + " is not opened in the new tab.", actualURL.endsWith(expectedEndPoint));
        return parent;
    }

    public void verify_Full_Disclosure_Page() {
        String actualURL = driver.getCurrentUrl();
        String expectedPageUrl = "https://exchange-qa-public.s3.ap-south-1.amazonaws.com/assets/documents/terms/HENRY%20Full%20Disclosure.pdf";
        Assert.assertEquals("Full Disclosure page is not viewed successfully in the separate tab ", expectedPageUrl, actualURL);
        driver.close();
        driver.switchTo().window(parent);
    }

    public void click_On_Privacy_Policy_link() {
        clickOnWebElement(privacyPolicyOnFooter);
        waitForElement(3);
    }


    public void verify_Privacy_Policy_Page() {
        String actualURL = driver.getCurrentUrl();
        String expectedPageUrl = "https://exchange-qa-public.s3.ap-south-1.amazonaws.com/assets/documents/terms/HENRY%20Privacy%20Policy.pdf";
        Assert.assertEquals(" Privacy policy page is not viewed successfully in the separate tab ", expectedPageUrl, actualURL);
        driver.close();
        driver.switchTo().window(parent);
    }

    public void click_On_Data_Security_Link() {
        clickOnWebElement(dataSecurityOnFooter);
        waitForElement(3);
    }


    public void verify_Data_Security_Page() {
        String actualURL = driver.getCurrentUrl();
        String expectedPageUrl = "https://exchange-qa-public.s3.ap-south-1.amazonaws.com/assets/documents/terms/HENRY%20Data%20Security.pdf";
        Assert.assertEquals("Data security page is not viewed successfully in the separate tab ", expectedPageUrl, actualURL);
        driver.close();
        driver.switchTo().window(parent);
    }


    public void click_On_Terms_Of_Use_Link() {
        clickOnWebElement(termsOfUseOnFooter);
        waitForElement(3);
    }


    public void verify_Terms_Of_Use_Page() {
        String actualURL = driver.getCurrentUrl();
        String expectedPageUrl = "https://exchange-qa-public.s3.ap-south-1.amazonaws.com/assets/documents/terms/HENRY%20Terms%20of%20Use.pdf";
        Assert.assertEquals("Terms of use page is not viewed successfully in the separate tab ", expectedPageUrl, actualURL);
        driver.close();
        driver.switchTo().window(parent);
    }

    public void click_On_Website_Data_Collection_Process_Link() {
        clickOnWebElement(websiteDataCollectionProcess);
        waitForElement(3);
    }


    public void verify__Website_Data_Collection_Process_Page() {
        String actualURL = driver.getCurrentUrl();
        String expectedPageUrl = "https://exchange-qa-public.s3.ap-south-1.amazonaws.com/assets/documents/terms/HENRY%20Data%20Collection%20Process.pdf";
        Assert.assertEquals("Website data collection process page is not viewed successfully in the separate tab ", expectedPageUrl, actualURL);
        driver.close();
        driver.switchTo().window(parent);
    }

    public void click_On_ContactUs() {
        waitForElement(10);
        clickOnWebElement(contactUsSubHeadingOnFooter);
        waitForElement(3);
    }


}
