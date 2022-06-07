package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    public static final String BROWSER = "browser";
    public static final String FIREFOX = "firefox";
    public static final String OPERA = "opera";


    public WebDriverFactory() {
    }

    public static WebDriver getWebDriver() {
        WebDriver driver;
        switch (System.getProperty(BROWSER)) {
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case OPERA: {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            }
            default: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        return driver;
    }
}
