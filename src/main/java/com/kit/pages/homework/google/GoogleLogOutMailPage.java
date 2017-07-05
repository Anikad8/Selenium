package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 22.06.2017.
 */
public class GoogleLogOutMailPage extends GoogleBasePage {

    private WebElement openLogOutMail;
    private WebElement logOutMail;

    By linkLokatorOpenLogOutMail = By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span");
    By linkLokatorLogOutMail = By.xpath(".//*[@id='gb_71']");

    public GoogleLogOutMailPage(WebDriver webDriver){

        super(webDriver);
    }

    public void clickOpenLogOutMail(){
        openLogOutMail = webDriver.findElement(linkLokatorOpenLogOutMail);
        openLogOutMail.click();
    }

    public void clickLogOutMail(){
        logOutMail = webDriver.findElement(linkLokatorLogOutMail);
        logOutMail.click();
    }




}
