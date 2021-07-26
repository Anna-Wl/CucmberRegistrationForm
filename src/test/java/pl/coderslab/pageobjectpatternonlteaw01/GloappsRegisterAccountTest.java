package pl.coderslab.pageobjectpatternonlteaw01;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class GloappsRegisterAccountTest {
    private WebDriver driver;
    private GloappsHomePage homePage;
    private GloappsAuthenticationPage authenticationPage;
    private GloappsCreateAccountPage createAccountPage;
    private GloappsMyAccountPage myAccountPage;

    @Test
    public void shouldRegisterAccount() {
        Random rand = new Random(System.currentTimeMillis());
        homePage.clickSignInButton();
        String randomEmail = UUID.randomUUID().toString()+"@makota.pl";
        authenticationPage.enterCreateAccountEmail(randomEmail);
        authenticationPage.clickCreateAccount();
        FormData formData = new FormData()
                .setMr(true)
                .setFirstName("Robert")
                .setLastName("Romanowicz")
                .setPassword("romanow123")
                .setDays(22)
                .setMonths(Month.APRIL)
                //Uzyskuje losowy miesiac
                //.setMonths(Month.of(rand.nextInt(12)+1))
                .setYears(1995)
                .setNewsletter(true)
                //Uzyskuje losowe true albo false
                //.setNewsletter(rand.nextBoolean())
                .setSpecialOffers(false);
                //.setSpecialOffers(rand.nextBoolean());
        createAccountPage.fillFormWithData(formData);
        createAccountPage.clickRegister();
        assertTrue(myAccountPage.isAccountRegistered());
        assertEquals(formData.getFirstName(), myAccountPage.getSignedInUserName());
    }

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.driver.get("https://qloapps.coderslab.pl/en/");
        this.homePage = new GloappsHomePage(this.driver);
        this.authenticationPage = new GloappsAuthenticationPage(this.driver);
        this.createAccountPage = new GloappsCreateAccountPage(this.driver);
        this.myAccountPage = new GloappsMyAccountPage(this.driver);
    }

    @After
    public void afterEach() {
        driver.close();
    }
}
