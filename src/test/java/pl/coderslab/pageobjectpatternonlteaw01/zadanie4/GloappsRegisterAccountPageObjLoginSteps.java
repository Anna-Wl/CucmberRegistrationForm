package pl.coderslab.pageobjectpatternonlteaw01.zadanie4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pl.coderslab.pageobjectpatternonlteaw01.FormDataUserAddress;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GloappsRegisterAccountPageObjLoginSteps {
    private WebDriver driver;
    private GloappsHomePage homePage;
    private GloappsAuthenticationPage authenticationPage;
    private GloappsMyAccountPage myAccountPage;
    private GLoappsMyAddressesPage myAddressesPage;
    private FormDataUserAddress formDataUserAddress;
    private GloappsYourAddressPage yourAddressPage;
    private GloappsYourAddressResultPage yourAddressResultPage;

    @Given("^Page (.*) opened in browser$")
    public void openPageInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.driver.get(url);
        this.homePage = new GloappsHomePage(this.driver);
        this.authenticationPage = new GloappsAuthenticationPage(this.driver);
        this.myAccountPage = new GloappsMyAccountPage(this.driver);
        this.myAddressesPage = new GLoappsMyAddressesPage(this.driver);
        this.formDataUserAddress = new FormDataUserAddress();
        this.yourAddressPage = new GloappsYourAddressPage(this.driver);
        this.yourAddressResultPage = new GloappsYourAddressResultPage(this.driver);
    }

    @When("^Click 'Sign in' link$")
    public void signInTheUser() {
        homePage.clickSignInButton();
    }

    @And("^Enter user credentials '(.*)' and '(.*)'$")
    public void loginToWebsite(String email, String password) {
        authenticationPage.loginWithEmailAndPassword(email, password);
    }

    @And("^Click 'Sign in' button$")
    public void loginInTheUser() {
        authenticationPage.clickLoginButton();
    }

    @And("^Click 'My addresses'$")
    public void clickMyAddressesLink() {
        myAccountPage.clickMyAddresses();
    }

    @And("^Click 'Add new address'$")
    public void clickAddNewAddresButton() {
        myAddressesPage.clickAddNewAddress();
    }

    @And("^Enter company '(.*)'$")
    public void enterCompanyName(String companyName) {
        formDataUserAddress.setCompany(companyName);
    }

    @And("^Enter address '(.*)'$")
    public void enterAddress(String address) {
        formDataUserAddress.setAddress(address);
    }

    @And("^Enter zip '(.*)'$")
    public void enterZip(String zip) {
        formDataUserAddress.setZip(zip);
    }

    @And("^Enter city '(.*)'$")
    public void enterCity(String city) {
        formDataUserAddress.setCity(city);
    }

    @And("^Enter phone '(.*)'$")
    public void enterPhone(String phone) {
        formDataUserAddress.setPhone(phone);
    }

    @And("^Enter additional information '(.*)'$")
    public void enteradditionalInformation(String info) {
        formDataUserAddress.setAdditionaInformation(info);
    }

    @And("^Fill the form$")
    public void fillTheForm() {
       // System.out.println(formDataUserAddress.getAddress() + formDataUserAddress.getCompany() + formDataUserAddress.getZip() + formDataUserAddress.getCity() + formDataUserAddress.getPhone() + formDataUserAddress.getAdditionaInformation());
        yourAddressPage.fillFormWithData1(this.formDataUserAddress);
    }

    @And("^Click 'Save'$")
    public void clickSaveButton() {
        yourAddressPage.clickSubmit();
    }

    @And("^User data are displayed in a browser$")
    public void userNameDisplayed() {
        assertEquals(formDataUserAddress.getCompany(), yourAddressResultPage.getLoggedInCompany());
        assertEquals(formDataUserAddress.getAddress(), yourAddressResultPage.getLoggedInAddress());
        assertEquals(formDataUserAddress.getZip(), yourAddressResultPage.getLoggedInPostcode());
        assertEquals(formDataUserAddress.getCity(), yourAddressResultPage.getLoggedInCity());
        assertEquals(formDataUserAddress.getPhone(), yourAddressResultPage.getLoggedInMobilePhoneNumber());
    }

    @Then("^Delete user$")
    public void deleteUser() {
        yourAddressResultPage.setDeleteUserButtonUser();
        driver.switchTo().alert().accept();
    }

    //Cucumber Hook
    @After
    public void afterEach() {
        driver.close();
    }
}


