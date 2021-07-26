package pl.coderslab.pageobjectpatternonlteaw01.searchingoole;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.DuckDuckGoPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SearchInDuckDuckGoSteps {
    private WebDriver driver;
    private DuckDuckGoPage ddgPage;
    //    Scenario: Search phrase in google.pl

    //Given Page http://duckduckgo.com/ opened in browser
    @Given("^Page (.*) opened in browser$")
    public void openPageInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get(url);
        ddgPage = new DuckDuckGoPage(driver);
    }

    @When("^Enter phrase '(.*)' in search input$")
    public void enterSearchPhrase(String phrase) {
        ddgPage.enterSearchPhrase(phrase);
    }

    @And("^Submit form$")
    public void submitForm() {
        ddgPage.submitSearch();
    }

    //Then First 5 results contain phrase 'Tokyo 2020' in the link text
    @Then("^First (.*) results contain phrase '(.*)' in the link text$")
    public void checkPharseInresults(int count, String pharse) {
        List<String> resultTexts = ddgPage.getSearchResultsLinksTexts();

        for (int i = 0; i < count; i++) {
            String textToCheck = resultTexts.get(i);
            assertTrue(String.format("Phrase '%s' NOT found in '%s'", pharse, textToCheck),
                    textToCheck.contains(pharse));
        }
    }

}