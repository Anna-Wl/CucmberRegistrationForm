package pl.coderslab.pageobjectpatternonlteaw01.zadanie4;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private WebDriver driver;

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");

    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}


