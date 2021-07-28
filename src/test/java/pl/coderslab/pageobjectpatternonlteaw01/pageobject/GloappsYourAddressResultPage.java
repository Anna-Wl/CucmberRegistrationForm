package pl.coderslab.pageobjectpatternonlteaw01.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.pageobjectpatternonlteaw01.FormDataUserAddress;

public class GloappsYourAddressResultPage {
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[1]")
    private WebElement name;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[2]")
    private WebElement surname;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[3]/span")
    private WebElement company;
    @FindBy(xpath= "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span")
    private WebElement address;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[7]/span[1]")
    private WebElement postcode;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[7]/span[2]")
    private WebElement city;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[10]/span")
    private WebElement phoneMobile;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[11]/a[2]")
    private WebElement deleteUserButton;

    public GloappsYourAddressResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setDeleteUserButtonUser() {
        deleteUserButton.click();
    }

    public String getLoggedInUserName() {
        return name.getText();
    }

    public String getLoggedInSurname() {
        return surname.getText();
    }

    public String getLoggedInCompany() {
        return company.getText();
    }

    public String getLoggedInAddress() {
        return address.getText();
    }

    public String getLoggedInPostcode() {
        return postcode.getText();
    }

    public String getLoggedInCity() {
        return city.getText();
    }

    public String getLoggedInMobilePhoneNumber() {
        return phoneMobile.getText();
    }

}
