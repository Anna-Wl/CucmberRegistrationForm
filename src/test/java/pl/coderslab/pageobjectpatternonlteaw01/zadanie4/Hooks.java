package pl.coderslab.pageobjectpatternonlteaw01.zadanie4;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private WebDriver driver;

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");

    }

    @After
    public WebDriver afterEach() throws IOException {
        this.driver = initializeDriver();
        System.out.println("This will run after the Scenario");
        driver.close();
        return driver;
    }

}


