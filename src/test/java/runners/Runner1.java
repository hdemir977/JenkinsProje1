package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "stepDefinitions",
        tags = "@Smoke",
        dryRun = false,
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)

public class Runner1 extends AbstractTestNGCucumberTests {

}


