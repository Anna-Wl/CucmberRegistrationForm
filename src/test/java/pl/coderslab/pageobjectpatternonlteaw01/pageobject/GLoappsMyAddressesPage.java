package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.pageobjectpatternonlteaw01.FormDataUserAddress;

public class GLoappsMyAddressesPage {
    @FindBy(xpath = "//*[@id='center_column']/div/a")
    private WebElement addNewAddressButton;

    public GLoappsMyAddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewAddress() {
        addNewAddressButton.click();
    }


}
