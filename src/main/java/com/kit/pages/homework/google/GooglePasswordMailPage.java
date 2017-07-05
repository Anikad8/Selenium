package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 22.06.2017.
 */
public class GooglePasswordMailPage extends GoogleBasePage {

    private WebElement searchFieldPassword;
    private WebElement mailPasswordSubmit;


    By linkLocatorPassword = By.xpath(".//*[@id='password']/div[1]/div/div[1]/input");
    By linkLocatorButtonNext = By.xpath(".//*[@id='passwordNext']/content/span");

    public GooglePasswordMailPage(WebDriver webDriver) {

        super(webDriver);
    }


    public void fillAndSubmitFieldPassword(String searchText){
        searchFieldPassword = webDriver.findElement(linkLocatorPassword);
        searchFieldPassword.sendKeys(searchText);
        searchFieldPassword.submit();
    }
    public void clickButtonNextPass(){
        mailPasswordSubmit = webDriver.findElement(linkLocatorButtonNext);
        mailPasswordSubmit.click();
    }
}
