package pl.coderslab.pageobjectpatternonlteaw01.gloapps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.pageobjectpatternonlteaw01.FormData;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsAuthenticationPage;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsCreateAccountPage;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsHomePage;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsMyAccountPage;

import java.time.Month;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GloappsRegisterAccountPageObjSteps {
    private WebDriver driver;
    private GloappsHomePage homePage;
    private GloappsAuthenticationPage authenticationPage;
    private GloappsCreateAccountPage createAccountPage;
    private GloappsMyAccountPage myAccountPage;
    public FormData formData;

    @Given("^Page (.*) opened in browser$")
    public void openPageInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.driver.get(url);
        this.homePage = new GloappsHomePage(this.driver);
        this.authenticationPage = new GloappsAuthenticationPage(this.driver);
        this.createAccountPage = new GloappsCreateAccountPage(this.driver);
        this.myAccountPage = new GloappsMyAccountPage(this.driver);
        this.formData = new FormData();
    }

//    @Before
//    public void beforeEach() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        this.driver = new ChromeDriver();
//        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//        this.driver.get("https://qloapps.coderslab.pl/en/");
//        this.homePage = new GloappsHomePage(this.driver);
//        this.authenticationPage = new GloappsAuthenticationPage(this.driver);
//        this.createAccountPage = new GloappsCreateAccountPage(this.driver);
//        this.myAccountPage = new GloappsMyAccountPage(this.driver);
//    }

    @When("^Click 'Sign in' button$")
    public void signInTheUser() {
        homePage.clickSignInButton();
    }

    @And("^Create and account$")
    public void createAccount() {
        Random rand = new Random(System.currentTimeMillis());
        String randomEmail = UUID.randomUUID().toString()+"@makota.pl";
        authenticationPage.enterCreateAccountEmail(randomEmail);
        authenticationPage.clickCreateAccount();
    }

    @And("^Choose title (.*)$")
    public void chooseTitle(boolean isTrue) {
        formData.setMr(isTrue);
    }

    @And("^Enter name '(.*)'$")
    public void enterName(String name) {
        formData.setFirstName(name);
    }

    @And("^Enter surname '(.*)'$")
    public void enterSurname(String surname) {
        formData.setLastName(surname);
    }

    @And("^Enter password '(.*)'$")
    public void enterPassword(String password) {
        formData.setPassword(password);
    }

    @And("^Enter day of birth '(.*)'$")
    public void enterDay(int day) {
        formData.setDays(day);
    }

    @And("^Enter month of birth$")
    public void enterMonth() {
        formData.setMonths(Month.APRIL);
    }

    @And("^Enter year of birth '(.*)'$")
    public void enterYear(int year) {
        formData.setYears(year);
    }

    @And("^Set newsletter (.*)$")
    public void setNewsletter(boolean isTrue) {
        formData.setNewsletter(isTrue);
    }

    @And("^Set SpecialOffers (.*)$")
    public void setSpecialOffers(boolean isTrue) {
        formData.setSpecialOffers(isTrue);
    }

    @And("^Fill the form$")
    public void fillTheForm() {
        System.out.println(formData.getLastName() + formData.getFirstName() + formData.getPassword());

        createAccountPage.fillFormWithData(this.formData);
    }

    @And("^Click 'Register' button$")
    public void registerUser() {
        createAccountPage.clickRegister();
    }

    @Then("^User name displayed in a browser$")
    public void userNameDisplayed() {
        assertTrue(myAccountPage.isAccountRegistered());
        assertEquals(formData.getFirstName(), myAccountPage.getSignedInUserName());
    }

//    @Test
//    public void shouldRegisterAccount() {
//
//        FormData formData = new FormData()
//                .setMr(true)
//                .setFirstName("Robert")
//                .setLastName("Romanowicz")
//                .setPassword("romanow123")
//                .setDays(22)
//                .setMonths(Month.APRIL)
//                .setYears(1995)
//                .setNewsletter(true)
//                .setSpecialOffers(false);
//        createAccountPage.fillFormWithData(formData);
//        createAccountPage.clickRegister();
//        assertTrue(myAccountPage.isAccountRegistered());
//        assertEquals(formData.getFirstName(), myAccountPage.getSignedInUserName());
//    }

    @After
    public void afterEach() {
        driver.close();
    }
}
