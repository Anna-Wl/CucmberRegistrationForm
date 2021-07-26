package pl.coderslab.pageobjectpatternonlteaw01.searchingoole;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features/search-in-duckduckgo.feature",
        plugin = {"pretty","html:out"})

public class SearchinDuckDuckGoTest {

}
