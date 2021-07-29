package pl.coderslab.pageobjectpatternonlteaw01.zadanie4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    private WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/java/pl/coderslab/pageobjectpatternonlteaw01/zadanie4/data.properties");
        prop.load(fis);

        String browserName = prop.getProperty("browser");

        //When you extracting value from property you must use equals method not ==
        if(browserName.equals("chrome")) {
            //
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    "src/test/resources/drivers/geckodriver.exe");
           driver = new org.openqa.selenium.firefox.FirefoxDriver();
        } else if (browserName.equals("opera")) {
            System.setProperty("webdriver.opera.driver",
                    "src/test/resources/drivers/operadriver.exe");
            driver = new org.openqa.selenium.opera.OperaDriver();
        }

        this.driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        return driver;
    }


}
