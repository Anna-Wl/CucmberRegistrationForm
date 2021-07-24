package pl.coderslab.pageobjectpatternonlteaw01;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsAuthenticationPage;
import pl.coderslab.pageobjectpatternonlteaw01.pageobject.GloappsHomePage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class GloappsRegisterAccountTest {
    private WebDriver driver;
    private GloappsHomePage homePage;
    private GloappsAuthenticationPage authenticationPage;

    @Test
    public void shouldRegisterAccount() {
        homePage.clickSignInButton();
        String randomEmail = UUID.randomUUID().toString()+"@makota.pl";
        authenticationPage.enterCreateAccountEmail(randomEmail);
        authenticationPage.clickCreateAccount();
    }

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.driver.get("https://qloapps.coderslab.pl/en/");
        this.homePage = new GloappsHomePage(this.driver);
        this.authenticationPage = new GloappsAuthenticationPage(this.driver);
    }
}
