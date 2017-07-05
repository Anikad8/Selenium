package pages.homework;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.homework.google.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



/**
 * Created by Anika on 22.06.2017.
 */

//@Listeners({com.kit.core.TestListener.class})
public class GoogleSearchMailTest extends WebDriverTestBase {

    private String googleSearch  = "https://www.google.com.ua/";
    private String googleButtonEnter = ".//*[@id='gb_70']";
    private String googleMailLoginField = ".//*[@id='identifierId']";
    private String enterLoginMail = "anikad8@gmail.com";
    private String enterPasswordMail = "85shiroy8";

    @Test
    public void searchAndClickButtonEnterTest() {
        GoogleSearchMailPage googleSearchMailPage = new GoogleSearchMailPage(webDriver);
        googleSearchMailPage.open(googleSearch);
        googleSearchMailPage.buttonEnterMail();
        GoogleSearchMainResultPage googleSearchMainResultPage = new GoogleSearchMainResultPage(webDriver);
        googleSearchMainResultPage.getLinkButton().contains(googleButtonEnter);

    }

    @Test
        public  void enterLoginMailTest() {
        GoogleLoginMailPage googleLoginMailPage = new GoogleLoginMailPage(webDriver);
        googleLoginMailPage.fillAndSubmitFieldLogin(enterLoginMail);
        googleLoginMailPage.clickButtonNext();
        GoogleLoginMailResultPage googleLoginMailResultPage = new GoogleLoginMailResultPage(webDriver);
        googleLoginMailResultPage.getLinkMailLogin().contains(googleMailLoginField);

    }

    @Test
        public void enterPasswordMailTest() {
        GooglePasswordMailPage googlePasswordMailPage = new GooglePasswordMailPage(webDriver);
        googlePasswordMailPage.fillAndSubmitFieldPassword(enterPasswordMail);
        googlePasswordMailPage.clickButtonNextPass();

    }

    @Test
        public void clickLinkInMailTest() {
        GoogleOpenMailPage googleOpenMailPage = new GoogleOpenMailPage(webDriver);
        googleOpenMailPage.clickLinkMail();
    }

    @Test
    public void clickLinkLogOutMailTest(){
    GoogleLogOutMailPage googleLogOutMailPage = new GoogleLogOutMailPage(webDriver);
    googleLogOutMailPage.clickOpenLogOutMail();
    googleLogOutMailPage.clickLogOutMail();
    }
}
