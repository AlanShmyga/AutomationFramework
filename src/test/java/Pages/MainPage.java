package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alan on 25.08.17.
 */
public class MainPage extends AbstractPage {

    private String appLink = "https://rozetka.com.ua/";
    private By menuSectionNotebooks = By.xpath("//a[contains(text(), 'Ноутбуки и компьютеры')]");

    public MainPage openMainPage() {
        driver.get(appLink);
        return this;
    }

    public LaptopsPage openLaptopsPage() {

        driver.findElement(menuSectionNotebooks).click();

        return new LaptopsPage();
    }
}
