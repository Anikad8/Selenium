package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anika on 22.06.2017.
 */
public class GoogleSearchMailPage extends GoogleBasePage {

    private WebElement loginButtonMail;//выносим в класс, чтобы переиспользовать в любом другом методе

    By enterLocator = By.xpath(".//*[@id='gb_70']");// тест не должен знать о локаторах

    public GoogleSearchMailPage(WebDriver webDriver) {// webDriver  с помощью конструктора передали в Page
        super(webDriver);
    }


    public void buttonEnterMail(){
        loginButtonMail = webDriver.findElement(enterLocator);
        loginButtonMail.click();
    }
}
