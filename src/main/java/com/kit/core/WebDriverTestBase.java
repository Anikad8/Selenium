package com.kit.core;

import com.kit.util.PropertiesCache;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Мир on 09.06.2017.
 */
public class WebDriverTestBase {
    protected WebDriver webDriver;
    //How to pass System variable to Selenium Framework
    //mvn -D browser=CHROME or -D browser FF clean test - to run tests on diff browses
    private String browser = System.getProperty("browser");
    //Loads settings from test.properties file
    private long implicitWait = Long.parseLong(PropertiesCache.getProperty("wait.implicit"));
    private long loadPageTime = Long.parseLong(PropertiesCache.getProperty("load.page.time"));
    private long scriptTime = Long.parseLong(PropertiesCache.getProperty("script.time"));



    @BeforeClass
    public void setUp() {
        //System.setProperty("webDriver.chrome.driver", "D:\\selenium\\src\\main\\resources\\chromeDriver.exe"); //название системной переменной
        //Automatically downloads and sets up the latest driver
        setBrowser();//метод, который устанавливает браузер
        setWebDriverSettings();
    }
    private void setWebDriverSettings(){
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);//каждый 0,5 сек
        webDriver.manage().timeouts().pageLoadTimeout(loadPageTime, TimeUnit.SECONDS);//для загрузки страницы
        webDriver.manage().timeouts().setScriptTimeout(scriptTime, TimeUnit.SECONDS);//для JS
    }

    public void setBrowser (){
        Browser runBrowser = EnumUtils.isValidEnum(Browser.class, browser) ?
                Browser.valueOf(browser.toUpperCase()) : Browser.CHROME;//проверяет на ноль, дефолтный или что-то неправильно написано
        switch (runBrowser){
            case CHROME:
                ChromeDriverManager.getInstance().setup(); // .version("2.26").setup() автоматически загружает и устанавливает последнюю версию браузера
                webDriver = new ChromeDriver();
                break;
            case FF:
                FirefoxDriverManager.getInstance().setup();
                webDriver = new FirefoxDriver();
                break;

        }
    }
    @AfterClass
    public void tearDown(){
        //closes a browser
        webDriver.close();
        // closes a tab(закрывает текущую вкладку, на которой находимся)
        // webDriver.quit();
    }
}