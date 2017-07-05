package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Anika on 05.07.2017.
 */
public class GoogleLoginMailResultPage extends GoogleBasePage {

    By locatorFieldLogin = By.id("id=\"identifierId\"");
    private WebElement locatorMailLogin;
    By locatorButtonNextLogin = By.xpath(".//*[@id='identifierNext']/div[2]");
    private WebElement locatorButtonNext;

    public GoogleLoginMailResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getLinkMailLogin() {
        locatorMailLogin = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(locatorFieldLogin));
        locatorMailLogin = webDriver.findElement(locatorFieldLogin);
        return locatorMailLogin.getText();

    }

    public String getLinkMailButtonNextLog() {
        locatorButtonNext = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(locatorButtonNextLogin));
        locatorButtonNext = webDriver.findElement(locatorButtonNextLogin);
        return locatorButtonNext.getText();
    }
}
