package pl.coderslab.pageobjectpatternonlteaw01.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.pageobjectpatternonlteaw01.FormDataUserAddress;
import pl.coderslab.pageobjectpatternonlteaw01.FormDataUserLogin;

public class GloappsYourAddressPage {
    @FindBy(xpath = "//*[@id=\"company\"]")
    private WebElement company;
    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "postcode")
    private WebElement postcode;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "phone_mobile")
    private WebElement phoneMobile;
    @FindBy(id = "other")
    private WebElement additionalInformation;
    @FindBy(id="submitAddress")
    private WebElement submitAddressButton;
    @FindBy(id="firstname")
    private WebElement firstName;
    @FindBy(id="lastname")
    private WebElement lastName;

    public GloappsYourAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSubmit() {
        submitAddressButton.click();
    }

    public void fillFormWithData1(FormDataUserAddress data) {
          setInput(company, data.getCompany());
          setInput(address, data.getAddress());
        setInput(postcode, data.getZip());
        setInput(city, data.getCity());
        setInput(phoneMobile, data.getPhone());
        setInput(additionalInformation, data.getAdditionaInformation());
    }

    private void setInput(WebElement input, String value) {
        input.clear();
        input.sendKeys(value);
    }

    public void saveUserNameAdnSurname(FormDataUserLogin data) {
        String nameOfUser = firstName.getAttribute("value");
        String surnameOfUser = lastName.getAttribute("value");
        data.setName(nameOfUser);
        data.setSurname(surnameOfUser);
    }

}
