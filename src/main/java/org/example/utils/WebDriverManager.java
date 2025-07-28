package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;
    private static final String CHROME_DRIVER_PATH = "/home/ikken/chromedriver";

    public static WebDriver getDriver() {
        if (driver == null) {
            initialize();
        }
        return driver;
    }

    public static void initialize() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless=new");
        // options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    public static void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
