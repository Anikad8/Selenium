package pages.classwork;

import com.kit.core.WebDriverTestBase;
import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Anika on 30.06.2017.
 */
public class AlertBox extends WebDriverTestBase {
    @Test
    public void testWindowPopupUsingTitle() {
        webDriver.get("http://www.quackit.com/javascript/javascript_alert_box.cfm");
        webDriver.switchTo().frame("iframeResult");
        //Select make = new Select(webDriver.findElement(By.xpath("html/body/select")))
        WebElement alertBoxButton = webDriver.findElement(By.cssSelector(".result>input"));
        alertBoxButton.click();
        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        assertTrue(alertText.equals("Thanks... I feel much better now!"));

    }
}


