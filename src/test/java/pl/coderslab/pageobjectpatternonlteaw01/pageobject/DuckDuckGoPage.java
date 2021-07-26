package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DuckDuckGoPage {
    @FindBy(id = "search_form_input_homepage")
    private WebElement searchInput;
    @FindBy(css = "a.result__a.js-result-title-link")
    private List<WebElement> searchResults;

    public DuckDuckGoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchPhrase(String phrase) {
        searchInput.sendKeys(phrase);
    }

    public void submitSearch() {
        searchInput.submit();
    }

    public List<String> getSearchResultsLinksTexts() {
        List<String> result = new ArrayList<>();

        for(int i = 0; i<searchResults.size(); i++){
            String textFromLink = searchResults.get(i).getText();
            result.add(textFromLink);
        }

        return result;
    }
}