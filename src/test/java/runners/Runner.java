package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"html:target\\cucumber-raporlar1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},
        features = "src\\test\\java\\features",
        glue = "stepDefinitions",
        tags = "@Smoke",
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {

}

