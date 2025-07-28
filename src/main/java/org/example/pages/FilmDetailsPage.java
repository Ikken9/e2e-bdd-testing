package org.example.pages;

import com.microsoft.playwright.Page;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class FilmDetailsPage extends BasePage {
    private final By authorLocator = By.xpath("//section//ol/li[1]/p[1]/a");
    private final By seasonsLocator = By.xpath("//section[2]//h2/a");

    public String getAuthor() {
        WebElement authorElement = driver.findElement(authorLocator);
        return authorElement.getText();
    }

    public int getSeasons() {
        WebElement seasonsElement = driver.findElement(seasonsLocator);
        String seasons = seasonsElement.getText().split(" ")[1];
        return Integer.parseInt(seasons);
    }

    public void takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "screenshot.png";
        FileUtils.copyFile(screenshot, new File(screenshotPath));
    }
}
