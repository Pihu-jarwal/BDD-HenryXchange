package driver;

import static org.apache.logging.log4j.LogManager.getLogger;

import java.time.Duration;
import java.util.HashMap;

import enums.PlatformType;
import lombok.Getter;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static final Logger        LOGGER   = getLogger ();
    @Getter
    private static final DriverFactory instance = new DriverFactory ();
    @Getter
    private              WebDriver     driver;
    private final        PlatformType  platformType;

    public DriverFactory () {
        LOGGER.traceEntry ();
        this.platformType = PlatformType.WEB;
        LOGGER.traceExit ();
    }

    public WebDriver instantiateWebDriver (String browserType) {
        if (browserType.equalsIgnoreCase ("chrome")) {
            LOGGER.info ("Initializing the chrome driver.");
            driver = instantiateChromeDriver ();
        } else if (browserType.equalsIgnoreCase ("firefox")) {
            LOGGER.info ("Initializing the firefox driver.");
            driver = instantiateFirefoxDriver ();
        } else {
            try {
                throw new Exception ("Invalid browser type provided please try again with the valid browser type.");
            } catch (Exception e) {
                LOGGER.warn (e);
            }
        }
        LOGGER.info ("Attaching implicit time out of seconds " + 5);
        driver.manage ()
            .timeouts ()
            .implicitlyWait (Duration.ofSeconds (5));
        LOGGER.info ("Attaching page load time out of seconds " + 30);
        driver.manage ()
            .timeouts ()
            .pageLoadTimeout (Duration.ofSeconds (30));
        LOGGER.info ("Maximizing the browser `window to the viewport size.");
        driver.manage ()
            .window ()
            .maximize ();
        return driver;
    }

    public WebDriver instantiateChromeDriver () {
        ChromeOptions options = new ChromeOptions ();
        String currentDir = System.getProperty ("user.dir") + "//downloads";
        options.addArguments ("disable-infobars");
        options.addArguments ("--remote-allow-origins=*");
        options.addArguments ("--disable-web-security");
        options.setExperimentalOption ("excludeSwitches", new String[] { "enable-automation" });
        options.setExperimentalOption ("prefs", new HashMap<String, Object> () {{
            put ("download.default_directory", currentDir);
        }});
        HashMap<String, Object> chromePref = new HashMap<> ();
        chromePref.put ("profile.default_content_settings.popups", 0);
        chromePref.put ("credentials_enable_service", false);
        chromePref.put ("profile.password_manager_enabled", false);
        options.setExperimentalOption ("prefs", chromePref);
        return new ChromeDriver (options);
    }

    public WebDriver instantiateFirefoxDriver () {
        FirefoxOptions options = new FirefoxOptions ();
        options.setAcceptInsecureCerts (true);
        return new FirefoxDriver (options);
    }

    public void getOpenUrl (String url) {
        driver.get (url);
    }

    public void tearDown () {
        driver.close ();
    }
}