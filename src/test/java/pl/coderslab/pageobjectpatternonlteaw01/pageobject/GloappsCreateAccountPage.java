package pl.coderslab.pageobjectpatternonlteaw01.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.pageobjectpatternonlteaw01.FormData;

public class GloappsCreateAccountPage {
    @FindBy(id = "submitAccount")
    private WebElement registerButton;
    @FindBy(id = "uniform-id_gender1")
    private WebElement mrRadioButton;
    @FindBy(id = "uniform-id_gender2")
    private WebElement mrsRadioButton;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "days")
    private WebElement daysDropDown;
    @FindBy(id = "months")
    private WebElement monthsDropDown;
    @FindBy(id = "years")
    private WebElement yearsDropDown;
    @FindBy(id = "uniform-newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;


    public GloappsCreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickRegister() {
        registerButton.click();
    }

    public void fillFormWithData(FormData data) {
        if(data.isMr()) {
            mrRadioButton.click();
        } else {
            mrsRadioButton.click();
        }
        setInput(firstNameInput, data.getFirstName());
        setInput(lastNameInput, data.getLastName());
        setInput(passwordInput, data.getPassword());
       // setDays(data.getDays());
        //Robie String bo setDays przyjmuje String jako parameter nie int
        daysDropDown.sendKeys(String.valueOf(data.getDays()));
        //Month to metoda wbudowana
        monthsDropDown.sendKeys(data.getMonths().name());
        yearsDropDown.sendKeys(String.valueOf(data.getYears()));
        setCheckbox(newsletterCheckbox, data.isNewsletter());
        setCheckbox(specialOffersCheckbox, data.isSpecialOffers());
    }

    //Metody prywatne void
    private void setInput(WebElement input, String value) {
        input.clear();
        input.sendKeys(value);
    }

    private void setDays(int days) {
        //Uzywamy Keys zeby wyczyscic dane
        daysDropDown.sendKeys(Keys.HOME+String.valueOf(days));
        //Aplikacja posiada blad, bo jak wpisjuje 11 to pojawia sie inna liczba
        if(days == 11) {
            daysDropDown.sendKeys(Keys.DOWN);
        }
    }

    private void setCheckbox(WebElement checkbox, boolean checked) {
        if(checkbox.isSelected() != checked) {
            checkbox.click();
        }
    }
}
