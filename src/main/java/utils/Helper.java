package utils;

import static org.apache.logging.log4j.LogManager.getLogger;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;

import driver.DriverFactory;
import logger.LogReporter;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    private static final Logger LOGGER = getLogger();
    public static final int shortTimeOut = 30;
    public static WebDriver driver;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public Helper() {
        driver = DriverFactory.getInstance()
                .getDriver();
    }

    public void pause(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            LOGGER.warn(e.getMessage());
        }
    }

    public WebElement findElement(By locator) {
        LOGGER.traceEntry();
        waitForElementVisibility(locator);
        LOGGER.info("Trying to access all the list of web elements with locator: " + locator);
        WebElement element = driver.findElement(locator);
        return LOGGER.traceExit(element);
    }

    public List<WebElement> findElements(By locator) {
        LOGGER.traceEntry();
        LOGGER.info("Trying to access all the list of web elements with locator: " + locator);
        List<WebElement> element = driver.findElements(locator);
        return LOGGER.traceExit(element);
    }

    public boolean isElementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                            ExpectedConditions.visibilityOf(element))
                    .isDisplayed();
        } catch (Exception ex) {
            LOGGER.warn(ex);
            return false;
        }
    }

    public static void waitForElement(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception ex) {
            LOGGER.warn(ex);
        }
    }

    public static void waitForElementInMinutes(final int minute) {
        try {
            Thread.sleep(minute * 60000);
        } catch (Exception ex) {
            LOGGER.warn(ex);
        }
    }

    public boolean isElementVisible(WebElement element) {
        return isElementVisible(element, shortTimeOut);
    }

    public boolean isDisplayed(List<WebElement> element) {
        return isElementVisible((WebElement) element, shortTimeOut);
    }

    public boolean isDisplayed(WebElement element) {
        LOGGER.traceEntry();
        try {
            new WebDriverWait(driver, Duration.ofSeconds(shortTimeOut))
                    .until(ExpectedConditions.visibilityOf(element));
            boolean isDisplayed = element.isDisplayed();
            LOGGER.traceExit();
            return isDisplayed;
        } catch (Exception e) {
            LOGGER.warn(e);
            LOGGER.traceExit();
            return false;
        }
    }

    public boolean alert(WebDriver driver) {
        boolean presentFlag = false;
        Alert alert = null;
        try {
            alert = driver.switchTo()
                    .alert();
            alert.accept();
            presentFlag = true;
        } catch (NoAlertPresentException ex) {
            LOGGER.warn(ex);
        } finally {
            if (!presentFlag) {
                System.out.println("The Alert is handled successfully");
            } else {
                System.out.println("There was no alert to handle");
            }
        }
        return presentFlag;
    }

    public void clickByAction(WebElement element) {
        Actions action = new Actions(driver);
        Assert.assertTrue(isElementVisible(element, 20));
        action.moveToElement(element)
                .click()
                .build()
                .perform();
    }

    public boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email)
                .matches();
    }

    public void validateEmail(String email) {
        Assert.assertTrue("Email format is not valid", isValidEmail(email));
    }

    public void waitForElementVisibility(By locator) {
        LOGGER.traceEntry();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        LOGGER.traceExit();
    }

    public void waitForVisibility(WebElement e) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofSeconds(50))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public WebElement waitforElementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                    ExpectedConditions.visibilityOf(element));
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to find element" + ex.getMessage());
        }
    }

    public static String getBase64SnapShot() {
        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to capture screenshot");
        }
    }

    public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
        Assert.assertTrue(isElementVisible(ele, 5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ele);
    }

    public void scrollToHeightByJs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public boolean switchToTab(String tabName) {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        ArrayList<String> tabList = new ArrayList<>();
        for (int i = 0; i < tab.size(); i++) {
            tabList.add(i, driver.switchTo()
                    .window(tab.get(i))
                    .getTitle());
            driver.switchTo()
                    .window(tab.get(0));
            if (tabList.get(i)
                    .equals(tabName)) {
                driver.switchTo()
                        .window(tab.get(i));
                return true;
            }
        }
        return false;
    }

    public void switchTab() {
        String parent = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String childWindow : windowHandles) {
            if (!childWindow.equals(parent)) {
                driver.switchTo()
                        .window(childWindow);
                Assert.assertNotEquals(parent, childWindow);
                LogReporter.INFO(driver.getTitle());
            }
        }
    }

    public void date_Picker(String month, WebElement element, WebElement arrow) {
        while (true) {
            try {
                waitForElement(2);
                if (month.equals(element.getText())) {
                    Assert.assertTrue(isElementVisible(element));
                    break;
                }
            } catch (Exception e) {
                arrow.click();
            }
        }
    }

    public void select_Date(String date, List<WebElement> day) {
        waitForElement(2);
        for (WebElement webElement : day) {
            if (webElement.getText()
                    .equals(date)) {
                Assert.assertTrue(isElementVisible(webElement));
                webElement.click();
                break;
            }
        }
    }

    public void clickOnWebElement(WebElement element) {
        LOGGER.traceEntry();
        LOGGER.info("Clicking on element: {}", element.getTagName());
        waitForElementToClickable(element);
        element.click();
        LOGGER.traceExit();
    }

    public void waitforElementClickable(WebElement element, int timeout) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                    ExpectedConditions.elementToBeClickable(element));
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to click element" + ex.getMessage());
        }
    }

    public void waitForElementToClickable(WebElement element) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(shortTimeOut)).until(
                    ExpectedConditions.elementToBeClickable(element));
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to click element" + ex.getMessage());
        }
    }

    public boolean isElementClickable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                            ExpectedConditions.elementToBeClickable(element))
                    .isEnabled();
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to click element" + ex.getMessage());
        }
    }

    public void validateDownloadedFile() {
        String currentDir = System.getProperty("user.dir") + "//downloads";
        boolean isDownloaded = isFileDownloaded(currentDir);
        Assert.assertTrue(isDownloaded);
        removeDownloadFolder(currentDir);
    }

    private void removeDownloadFolder(String folderPath) {
        File folder = new File(folderPath);
        Assert.assertTrue(folder.exists());
        deleteFolder(folder);
    }

    private void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }

    public boolean isFileDownloaded(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public boolean isEnabled(WebElement element) {
        Assert.assertTrue(isElementVisible(element));
        return element.isEnabled();
    }

    public void sendKeys(WebElement elementLocator, String element) {
        Assert.assertTrue(isElementVisible(elementLocator, 20));
        elementLocator.sendKeys(element);
    }

    public String getText(WebElement elementLocator) {
        Assert.assertTrue(isElementVisible(elementLocator, 40));
        return elementLocator.getText().trim();
    }

    public WebElement waitForElementVisible(WebElement element) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(shortTimeOut)).until(
                    ExpectedConditions.visibilityOf(element));
        } catch (Exception ex) {
            LOGGER.warn(ex.getMessage());
            throw new RuntimeException("Unable to find element" + ex.getMessage());
        }
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public String getAttributeValue(WebElement element) {
        Assert.assertTrue(isElementVisible(element));
        return element.getAttribute("value");
    }

    public String getAttribute(WebElement element, String attribute) {
        LOGGER.traceEntry();
        try {
            waitForVisibility(element);
        } catch (NoSuchElementException e) {
            LOGGER.warn(e.getMessage());
        }
        String value = element.getAttribute(attribute);
        return LOGGER.traceExit(value);
    }

    public void clearText(WebElement ele) {
        ele.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    }

    public void clearOneByOne(WebElement element, String text) {
        char[] chars = text.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            String a = String.valueOf(chars[i]);
            element.sendKeys(Keys.BACK_SPACE);
        }
    }

    public void sendkeysOneByOne(WebElement element, String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String a = String.valueOf(chars[i]);
            waitForElement(1);
            element.sendKeys(a);
        }
    }

    public void hoverAndClickByAction(WebElement ele) {
        Actions action = new Actions(driver);
        action.moveToElement(ele)
                .click()
                .build()
                .perform();

    }

    public void mouseHover(WebElement ele) {
        LOGGER.traceEntry();
        waitForVisibility(ele);
        Actions action = new Actions(driver);
        action.moveToElement(ele)
                .build()
                .perform();
        LOGGER.traceExit();
    }

    public void sendkeysForOtp(List<WebElement> element, String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String a = String.valueOf(chars[i]);
            element.get(i)
                    .sendKeys(a);
        }
    }

    public void scrollPopUpByJs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.text').scrollTop=1500");
    }

    public void hoverByAction(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element)
                .build()
                .perform();
    }

    public void generateRandomCharacter(WebElement element) {
        String randomAlphabet = generateRandomAlphabet(4);
        sendKeys(element, randomAlphabet);
    }

    public String generateRandomNumbers(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(10); // Generates a random digit between 0 and 9
            sb.append(randomNumber);
        }
        return sb.toString();
    }

    public String generateRandomAlphabet(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomAlphabet = (char) (random.nextInt(26) + 'a');
            sb.append(randomAlphabet);
        }
        return sb.toString();
    }

    public void remove_Text_Field_Data(String value) {
        waitForElement(2);
        WebElement locatorOf = driver.findElement(By.id(value));
        String value1 = getAttributeValue(locatorOf);
        clearOneByOne(locatorOf, value1);
    }

    public void remove_Text_Field_Data_By_Name(String value) {
        waitForElement(2);
        WebElement locatorOf = driver.findElement(By.name(value));
        String value1 = getAttributeValue(locatorOf);
        clearOneByOne(locatorOf, value1);
    }

    public static boolean isSorted(String prevValue, String nextValue) {
        int diff = prevValue.compareTo(nextValue);
        return diff <= 0;
    }

    public static boolean isReverseSorted(String prevValue, String nextValue) {
        int diff = prevValue.compareTo(nextValue);
        return diff >= 0;
    }

    public void clickOutsideThePopup() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0)
                .click()
                .build()
                .perform();
    }

    public void createDownloadFolder() {
        File download = new File("downloads");
        download.mkdir();
    }

    public String fileUploadPath(String fileName) {
        String filePath = Paths.get(System.getProperty("user.dir"), "src", "main",
                        "resources", "media_files" + File.separator + fileName)
                .toString();
        return FileUploading(filePath);
    }

    public String uploadMultipleFiles(String fileName1, String fileName2, String fileName3) {
        String folderPath = Paths.get(System.getProperty("user.dir"), "src", "main", "media_files")
                .toString();
        String filePath = folderPath + File.separator + "\"" + fileName1 + "\"" + " " + "\"" + fileName2 + "\"" + " " + "\"" + fileName3 + "\"";
        return FileUploading(filePath);
    }

    public String FileUploading(String filePaths) {
        try {
            Robot rb = new Robot();
            // copying File path to Clipboard
            StringSelection str = new StringSelection(filePaths);
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(str, null);

            // press Contol+V for pasting
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);

            // release Contol+V for pasting
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);

            // for pressing and releasing Enter
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            waitForElement(5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return filePaths;
    }

    public void clickOnWebElementByJs(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void clickOutsideTheField() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0)
                .click()
                .build()
                .perform();
    }

    public boolean isPDFOpened(WebDriver driver) {
        // Use JavaScriptExecutor to check if the PDF content is present
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "return typeof window.PDFViewerApplication !== 'undefined';";
        LogReporter.INFO("te" +script);
        return (boolean) jsExecutor.executeScript(script);
    }

}
