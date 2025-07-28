package org.example.pages;

import lombok.RequiredArgsConstructor;
import org.example.utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
// import org.example.utils.PlaywrightManager;

@RequiredArgsConstructor
public abstract class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public final String url = "https://www.themoviedb.org/";

    public BasePage() {
        this.driver = WebDriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get(url);
    }

    protected void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    protected void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text) {
        WebElement searchBar = driver.findElement(locator);
        searchBar.sendKeys(text + Keys.ENTER);
    }
}
