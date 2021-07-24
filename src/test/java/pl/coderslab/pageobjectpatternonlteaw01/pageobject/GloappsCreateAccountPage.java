package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.pageobjectpatternonlteaw01.FormData;

public class GloappsCreateAccountPage {
    @FindBy(id = "submitAccount")
    private WebElement registerButton;


    public GloappsCreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickRegister() {
        registerButton.click();
    }

    public void fillFormWithData(FormData data) {

    }
}
