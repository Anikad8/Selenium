package com.kit.pages.homework.google;

import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Anika on 05.07.2017.
 */
public class GoogleSearchMainResultPage extends GoogleBasePage {

    By linkLocatorButton = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");//id='rso это ближайший айди другого элемента
    private WebElement linkButton;

    public GoogleSearchMainResultPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String getLinkButton (){
        linkButton = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(linkLocatorButton));
        linkButton = webDriver.findElement(linkLocatorButton);
        return linkButton.getText();

    }
}
