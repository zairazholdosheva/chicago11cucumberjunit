package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Mvn_Steps {

    @Given("User searches for {string}")
    public void user_searches_for(String string) {
        Driver.getDriver().get("https://mvnrepository.com/");
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@id='query']"));
        searchBox.sendKeys("cucumber java"+ Keys.ENTER);

    }



    @Then("User should see  {string} is in the first result")
    public void user_should_see_is_in_the_first_result(String string) {

    }


}
