package proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Launcher {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe"); // Can be in default folder
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
