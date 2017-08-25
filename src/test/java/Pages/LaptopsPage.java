package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alan on 25.08.17.
 */
public class LaptopsPage extends AbstractPage {

    By graphicCards = By.xpath("//a[contains(text(), 'Видеокарты')]");

    public GraphicCardsPage openGraphicCardsPage() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(graphicCards))).click();
        return new GraphicCardsPage();
    }
}
