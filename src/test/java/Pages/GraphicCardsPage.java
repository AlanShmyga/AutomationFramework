package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alan on 25.08.17.
 */
public class GraphicCardsPage extends AbstractPage {

    By desiredCard = By.xpath("//div[@id='catalog_goods_block']//a[contains(text(), 'GeForce GTX 1060 Turbo 6GB')]");

    public void checkThatDesiredCardIsPresent() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(desiredCard)));
    }
}
