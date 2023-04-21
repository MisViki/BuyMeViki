package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    //Constructor
    public SearchResultsPage (WebDriver driver){
        super(driver);
    }

    By categorySelectedButton = By.cssSelector ("[alt='רשת מלונות פתאל']");


    public  SearchResultsPage categorySelectedButton(){
        click (categorySelectedButton);
        return this;
    }






}
