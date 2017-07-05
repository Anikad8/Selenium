package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 22.06.2017.
 */
public class GoogleLoginMailPage extends GoogleBasePage {

    private WebElement searchFieldLogin;
    private WebElement mailLoginSubmit;


    By linkLocatorLogin = By.xpath(".//*[@id='identifierId']");
    By linkLocatorButtonNext = By.xpath(".//*[@id='identifierNext']/content/span");


    public GoogleLoginMailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void fillAndSubmitFieldLogin(String enterText){
        searchFieldLogin = webDriver.findElement(linkLocatorLogin);
        searchFieldLogin.sendKeys(enterText);
        searchFieldLogin.submit();
    }

    public void clickButtonNext(){
        mailLoginSubmit = webDriver.findElement(linkLocatorButtonNext);
        mailLoginSubmit.click();
    }
}
