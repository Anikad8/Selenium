package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 22.06.2017.
 */
public class GoogleOpenMailPage extends GoogleBasePage {

    private WebElement openMail;

    By linkLocatorOpenMail = By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a");

    public GoogleOpenMailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLinkMail(){
        openMail = webDriver.findElement(linkLocatorOpenMail);
        openMail.click();
    }



}
