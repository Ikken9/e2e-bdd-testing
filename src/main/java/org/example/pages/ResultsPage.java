package org.example.pages;

import com.microsoft.playwright.Locator;
import org.openqa.selenium.By;

public class ResultsPage extends BasePage {
    private final By firstResultLocator = By.xpath("//section/div/div/div[2]/section/div[1]/div/div[1]/div/div[2]/div[1]/div/div/a");

    public void goToResultDetails() {
        click(firstResultLocator);
    }
}