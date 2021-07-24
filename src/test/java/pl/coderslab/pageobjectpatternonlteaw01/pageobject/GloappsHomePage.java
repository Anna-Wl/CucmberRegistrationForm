package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this is our first Page Object
public class GloappsHomePage {
    @FindBy(css = ".user_login")
    private WebElement signInButton;
    @FindBy(css = "div.shopping_cart a")
    private WebElement shoppingCartLink;

    public GloappsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickShoppingCart() {
        shoppingCartLink.click();
    }
}
