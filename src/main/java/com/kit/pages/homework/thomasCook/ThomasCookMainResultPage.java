package com.kit.pages.homework.thomasCook;


import com.kit.pages.classwork.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Anika on 04.07.2017.
 */
public class ThomasCookMainResultPage extends GoogleBasePage {
    private WebElement fieldHowLong;
    By clickFieldHow = By.xpath(".//*[@id='SearchbarForm-duration']");



    public ThomasCookMainResultPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String getLinkText (){
        fieldHowLong = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(clickFieldHow));
        fieldHowLong = webDriver.findElement(clickFieldHow);
        return fieldHowLong.getText();
    }
    public void clickField(){
        fieldHowLong.click();
   }
}
