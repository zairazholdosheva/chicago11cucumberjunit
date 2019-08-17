package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaHomePage {


    public WikipediaHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBoxWiki;


    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement wikiSearchButton;

   @FindBy(id = "firstHeading")
        public WebElement mainHeader;



    @FindBy(className = "fn")
        public WebElement imageHeader;

    }

