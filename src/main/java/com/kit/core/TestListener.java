package com.kit.core;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by Anika on 23.06.2017.
 */
public class TestListener implements ITestListener {

    private WebDriverUtil webDriverUtils;
    private WebDriver driver;


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {//после запуска теста, если фейлится, то передается в ITestResult
    driver = ((WebDriverTestBase) iTestResult.getInstance()).webDriver;//grtInstance -получить объект
    webDriverUtils = new WebDriverUtil(driver);//если зафейлился передаем webDriverUtils
        webDriverUtils.saveScreenshot(iTestResult.getMethod().getMethodName());
        //чтобы не затирался скриншот, делаем динамически(в ITestResult передаем все)
        //если каждый тестовый метод, то getMethodName(по имени метода такойже скрин), а если getTestName, то возвращает имя класса


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
