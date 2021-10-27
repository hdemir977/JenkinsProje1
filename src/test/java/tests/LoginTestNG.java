package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class LoginTestNG {


    @Test
    public void loginPage(){
        Driver.getDriver().get("https://www.amazon.de/");
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Driver.closeDriver();


    }
}
