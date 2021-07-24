package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GloappsAuthenticationPage {
    @FindBy(id = "email_create")
    private WebElement emailCreateAccountInput;
    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    public GloappsAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterCreateAccountEmail(String value) {
        emailCreateAccountInput.clear();
        emailCreateAccountInput.sendKeys(value);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}
