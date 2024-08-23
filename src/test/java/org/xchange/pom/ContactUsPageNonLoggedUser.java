package org.xchange.pom;


import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageNonLoggedUser extends ContactUs {
    public ContactUsPageNonLoggedUser() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'main-flex')]")
    private WebElement blackBackgroundColor;

    @FindBy(xpath = "//div[contains(@class,'main-flex')]//h1")
    private WebElement contactUs;

    @FindBy(xpath = "//div[contains(@class,'main-flex')]//h2")
    private WebElement howCanWeHelp;

    @FindBy(xpath = "(//div[contains(@class,'main-flex')]//p)[2]")
    private WebElement descriptionText;

    @FindBy(xpath = "//div[contains(@class,'main-flex')]//h3[1]")
    private WebElement henryPhoneNumber;

    @FindBy(xpath = "//div[contains(@class,'main-flex')]//h3[2]")
    private WebElement sendAMessage;



    public void verify_Background_Color(){
        String color  = blackBackgroundColor.getCssValue("background-color");
        LogReporter.INFO(color);
        String expectedBackgroundColor = "rgba(0, 0, 0, 0)";
        Assert.assertEquals("Black background color is not display ",expectedBackgroundColor,color);
    }
    public String verify_ContactUs_Page() {
        waitForElement(2);
        return driver.getCurrentUrl();
    }

    public String view_ContactUs_Text() {
        return getText(contactUs);
    }

    public String view_How_Can_We_Help_Text() {
        return getText(howCanWeHelp);
    }

    public Boolean view_Description_Below_How_Can_We_Help_Text() {
        return isElementVisible(descriptionText);
    }

    public String view_Henry_Phone_Number() {
        return getText(henryPhoneNumber);
    }

    public String view_Placeholder_Text_Send_A_Message() {
        return getText(sendAMessage);
    }


}
