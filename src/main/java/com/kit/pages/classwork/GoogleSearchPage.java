package com.kit.pages.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by Мир on 09.06.2017.
 */
public class GoogleSearchPage extends GoogleBasePage {

    By searchLocator = By.name("q");
    // @FindBy(name = "q")
    private WebElement searchField;


    public GoogleSearchPage (WebDriver webDriver){
        super(webDriver); // конструктор child класса ставится на первое место
        // this.webDriver = webDriver; это не нужно когда есть base page


    }
    @Attachment(value = "{0}", type = "text/plain")//возвращает то,что в методе
    @Step("Fills a search text {0} and presses the enter")
    public void fillAndSubmitSearchData(String searchText){
        //searchField =  webDriverUtil.waitforExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
        searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();

    }
}
