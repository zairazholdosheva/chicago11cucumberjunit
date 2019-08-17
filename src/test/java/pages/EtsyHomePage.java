package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {
    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='search_query']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='wt-input-btn-group__btn']")
    public WebElement searchButton;


}
