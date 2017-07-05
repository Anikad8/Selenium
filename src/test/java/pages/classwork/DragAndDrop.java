package pages.classwork;

import com.kit.core.WebDriverTestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Anika on 30.06.2017.
 */
public class DragAndDrop extends WebDriverTestBase {
    @Test
    public void testDragDrop() throws InterruptedException {
        webDriver.get("https://gojs.net/latest/samples/htmlDragDrop.html?gclid=CLjWnLeG5tQCFUeVGwodCowEcA");
        WebElement from = webDriver.findElement(By.xpath(".//*[@id='sample']/div[1]/span[1]/div/div[1]\""));
        WebElement to = webDriver.findElement(By.xpath(".//*[@id='myDiagramDiv']/canvas\""));
        Actions builder = new Actions(webDriver);
        builder.clickAndHold(from).moveToElement(to).release(to).build().perform();
        from.getAttribute("src").equals("img_logo.gif");


    }
}
