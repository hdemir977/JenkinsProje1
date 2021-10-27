package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "stepDefinitions",
        tags = "@Smoke",
        dryRun = false,

        plugin = { // basit rapor olusturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"}
)

public class Runner extends AbstractTestNGCucumberTests {

}


