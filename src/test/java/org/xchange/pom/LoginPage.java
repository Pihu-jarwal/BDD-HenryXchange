package org.xchange.pom;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

public class LoginPage extends Helper {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginBtn;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[text()='Enter']")
    private WebElement enterBtn;

    @FindBy(xpath = "//h1[text()='Market']")
    private WebElement marketScreen;

    @FindBy(xpath = "//p[text()='Log In']")
    private WebElement login;

    @FindBy(xpath = "//div[contains(text(),'Account details')]")
    private WebElement accountPopup;

    @FindBy(xpath = "//button[@aria-label='close']")
    private WebElement closeBtn;

    @FindBy(xpath = "//a[text()='Create one']")
    private WebElement createOne;

    @FindBy(xpath = "//p[text()='Get Started']")
    private WebElement getStarted;

    @FindBy(xpath = "//button[contains(@class,'eye-icon')]")
    private WebElement passwordEyeIcon;

    @FindBy(xpath = "//a[text()='Terms']/following-sibling::a")
    private WebElement legal;

    @FindBy(xpath = "(//div[@class='bottom-links']/a)[1]")
    private WebElement terms;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgotPassword;

    @FindBy(xpath = "//span[text()='Account Locked']")
    private WebElement accountLocked;

    @FindBy(xpath = "//span[text()='Account Locked']/following-sibling::p")
    private WebElement accountLockedText;

    @FindBy(css = "p[id='email-helper-text']")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[contains(@class,'eye-icon open')]")
    private WebElement eyeIcon;

  
    public String verify_Login_Screen() {
        return driver.getCurrentUrl();
    }

    public void clicks_On_Login() {
        clickOnWebElement(loginBtn);
    }

    public void set_Email(String email) {
        sendKeys(userEmail, email);
        validateEmail(email);
    }

    public void set_Password(String password) {
        sendKeys(userPassword, password);
    }

    public void check_Validation_In_Password_Field() {
        String passwordField = userPassword.getAttribute("value");
        Assert.assertFalse(passwordField.isEmpty());
        Assert.assertFalse(passwordField.length() > 12);
    }

    public boolean verify_Disabled_Enter_Button() {
        return enterBtn.isEnabled();
    }

    public void click_On_Enter_Btn() {
        clickOnWebElement(enterBtn);
    }

    public String user_Navigate_To_Market_Screen() {
        return getText(marketScreen);
    }

    public String verify_Popup_At_Login_With_Invalid_Credential() {
        return getText(accountPopup);
    }

    public void click_On_Create_One_Hyper_Link() {
        clickOnWebElement(createOne);
    }

    public void verify_Password_Icon() {
        clickByAction(passwordEyeIcon);
        Assert.assertTrue(isElementVisible(eyeIcon));
        clickByAction(passwordEyeIcon);
        Assert.assertFalse(isElementVisible(eyeIcon));
    }

    public void click_On_Legal_Page() {
        clickOnWebElement(legal);
    }

    public String verify_Redirection_Of_Hyper_Links() {
        return driver.getCurrentUrl();
    }

    public void click_On_terms_Page() {
        clickOnWebElement(terms);
    }

    public void click_On_Forgot_Password() {
        clickOnWebElement(forgotPassword);
    }

    public String verify_If_Blocked_User_Try_To_Login() {
        return accountLocked.getText();
    }

    public boolean is_Account_Popup_Visible(){
        return isElementVisible(accountLocked);
    }

    public void enter_Incorrect_Format_In_Email(String email) {
        sendKeys(userEmail, email);
        clickOnWebElement(userPassword);
    }

    public String verify_Error_Message_Of_Email_Field() {
        return getText(errorMessage);
    }

    public void remove_Email_From_Email_Field() {
        String value = userEmail.getAttribute("value");
        clearOneByOne(userEmail, value);
    }
}