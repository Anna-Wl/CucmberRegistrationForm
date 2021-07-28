package pl.coderslab.pageobjectpatternonlteaw01.zadanie4;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features/gloapps-login.feature",
        plugin = {"pretty","html:out"})

public class GloappsRegisterAccountPageObjLoginTest {

}
