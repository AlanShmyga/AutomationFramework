import Pages.MainPage;
import org.junit.Test;


public class RozetkaTest {

    @Test
    public void graphicCardTest() {
        new MainPage()
                .openMainPage()
                .openLaptopsPage()
                .openGraphicCardsPage()
                .checkThatDesiredCardIsPresent();
    }
}
