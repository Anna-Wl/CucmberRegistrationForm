package pl.coderslab.pageobjectpatternonlteaw01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
    @Test
    public void shouldProjectBeConfigured() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
}
