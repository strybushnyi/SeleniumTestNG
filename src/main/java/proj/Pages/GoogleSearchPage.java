package proj.Pages;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class GoogleSearchPage extends BasePage {

    private static final By FIELD_SEARCH = xpath("//input[@id='lst-ib']");
    private static final By BUTTON_SEARCH = xpath("//*[@name='btnK']");


    public static void searchSelenium(String text) {
        enter(FIELD_SEARCH, text);
        click(BUTTON_SEARCH);
    }
}
