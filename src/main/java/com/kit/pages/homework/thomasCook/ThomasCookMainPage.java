package com.kit.pages.homework.thomasCook;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by Anika on 04.07.2017.
 */
public class ThomasCookMainPage extends GoogleBasePage {

    private WebElement searchFieldForHowLong;
    By linkLocatorHowLong = By.xpath(".//*[@id='SearchbarForm-duration']");

    public ThomasCookMainPage(WebDriver webDriver){
        super(webDriver);
    }

    public void clickFieldHowLong(String searchList){
        searchFieldForHowLong = webDriver.findElement(linkLocatorHowLong);
        searchFieldForHowLong.sendKeys(searchList);
        searchFieldForHowLong.click();
    }
}
