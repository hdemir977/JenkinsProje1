package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.Driver;

public class LoginStepDefs {
    @Given("user go to main page")
    public void userGoToMainPage() {

        Driver.getDriver().get("https://www.amazon.de/");


    }

    @Then("verify main page")
    public void verifyMainPage() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Driver.closeDriver();

    }
}
