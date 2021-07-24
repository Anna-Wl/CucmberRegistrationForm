package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// this is our first Page Object
public class GloappsHomePage {
    private final WebDriver driver;

    public GloappsHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton() {
        WebElement signInButton = driver.findElement(By.cssSelector(".user_login"));
        signInButton.click();
    }
}
