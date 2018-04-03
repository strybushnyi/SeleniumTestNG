package proj.Pages;


import org.openqa.selenium.By;
import proj.Launcher;

public class BasePage extends Launcher{

    public static void open(String URL) {
        driver.get(URL);
    }

    public static void clear(By locator) {
        driver.findElement(locator).clear();
    }

    public static void enter(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }
}
