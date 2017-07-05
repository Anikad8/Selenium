package com.kit.pages.classwork;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * Created by Мир on 16.06.2017.
 */
public class GoogleBasePage {
    protected WebDriver webDriver;
    protected WebDriverUtil webDriverUtil;

    public GoogleBasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);

    }
//    public void takeScreenShot(String attachName){//метод котоорый ранится в GoogleSearchTest(принудительный скрин)
//
//        webDriverUtil.saveScreenshot(attachName);
//    }

    public void open (String url){

        webDriver.get (url);
    }
}