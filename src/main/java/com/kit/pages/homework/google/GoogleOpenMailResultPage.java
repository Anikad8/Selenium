package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 05.07.2017.
 */
public class GoogleOpenMailResultPage extends GoogleBasePage {

    By linkLocatorOpen = By.id("id=\"gb_70\"");
    private WebElement linkOpen;

    public GoogleOpenMailResultPage(WebDriver webDriver) {
        super(webDriver);
    }

}
