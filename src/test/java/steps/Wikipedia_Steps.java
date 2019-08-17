package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {
    WikipediaHomePage wikipediaHomePage=new WikipediaHomePage();

    @Given("User is on Wikipedia Homepage")
    public void user_is_on_Wikipedia_Homepage() {
        Driver.getDriver().get(Config.getProperty("wikipediaUrl"));

    }

    @When("User types {string} in the  wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

      wikipediaHomePage.searchBoxWiki.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    wikipediaHomePage.wikiSearchButton.click();
    }

    @Then("User sees {string} is in the  wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=string +" - Wikipedia";
        Assert.assertTrue("Wikipedia Title verification is failed",actualTitle.equalsIgnoreCase(expectedTitle));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String mainHeader) {

        String expectedHeader=mainHeader;
        String actualHeader=wikipediaHomePage.mainHeader.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }

    @Then("User sees {string} is in the  image header")
    public void userSeesIsInTheImageHeader(String imageHeader) {
        String expectedImageHeader=imageHeader;
        String actualImageHeader=wikipediaHomePage.imageHeader.getText();
        Assert.assertEquals(expectedImageHeader,actualImageHeader);
    }
}
