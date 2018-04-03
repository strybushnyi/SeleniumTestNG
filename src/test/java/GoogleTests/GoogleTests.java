package GoogleTests;

import org.testng.annotations.Test;
import proj.Launcher;
import proj.Pages.GoogleSearchPage;

import static proj.Pages.BasePage.open;

public class GoogleTests extends Launcher {

    String google = "http://google.com";

    @Test
    public void googleSearchTest() {
        open(google);
        GoogleSearchPage.searchSelenium("Selenium");
    }
}
