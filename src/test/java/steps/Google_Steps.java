package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Google_Steps {
    @When("User is on Google search page")
    public void user_is_on_Google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        // Write code here that turns the phrase above into concrete actions
        WebElement searchBox= Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("apples"+ Keys.ENTER);
    }

    @Then("User should see apple inside of the title")
    public void user_should_see_apple_inside_of_the_title() {
        // Write code here that turns the phrase above into concrete actions
      String actualTitle=Driver.getDriver().getTitle();
      String expectedTitle="apples";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.getDriver().close();
    }

    @When("User searches for a word {string}")
    public void user_searches_for_a_word(String word) {
        WebElement searchBox= Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(word+Keys.ENTER);
    }

    @Then("User should see a word {string} inside of the title")
    public void user_should_see_a_word_inside_of_the_title(String word) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=word;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.getDriver().close();
    }
    @When("User is on google Search page")
    public void user_is_on_google_Search_page() {

    }

    @Then("User goes to amazon website")
    public void user_goes_to_amazon_website() {

    }

}
