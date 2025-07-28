package org.example.pages;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Playwright;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private final By searchBarLocator = By.xpath("/html/body/div[1]/main/section[1]/div/div/div/div[2]/form/label/span/input");

    public void openMainPage() {
        driver.get(url);
    }

    public void search(String query) {
        type(searchBarLocator, query);
    }
}
