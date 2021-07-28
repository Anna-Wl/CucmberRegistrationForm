package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GloappsMyAccountPage {
    @FindBy(css = "p.alert-success")
    private WebElement successMessage;
    @FindBy(css = "span.account_user_name")
    private WebElement accountButton;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/ul/li[4]")
    private WebElement myAddressesLink;


    public GloappsMyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isAccountRegistered() {
        return successMessage.getText().equals("Your account has been created.");
    }

    public String getSignedInUserName() {
        return accountButton.getText();
    }

    public void clickMyAddresses() {
        myAddressesLink.click();
    }

}
