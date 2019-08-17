package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class Amazon_Steps {

    @When("User is on Amazon application")
    public void user_is_on_Amazon_application() {
        Driver.getDriver().get("https://www.amazon.com/");
    }
    @Then("User should see Amazon in title")
    public void user_should_see_Amazon_in_title() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitleContains="Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitleContains));


    }
    @Then("User searches for something")
    public void user_searches_for_something() {

    }
}
