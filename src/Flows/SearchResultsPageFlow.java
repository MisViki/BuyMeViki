package Flows;

import PageObject.LoginPage;
import PageObject.SearchResultsPage;
import org.openqa.selenium.WebDriver;

public class SearchResultsPageFlow {

    SearchResultsPage searchResultsPage;

    //Constructor
    public SearchResultsPageFlow (WebDriver driver) {
        super();
        searchResultsPage = new SearchResultsPage(driver);

    }

    public void searchResults (){
        searchResultsPage.categorySelectedButton();

    }
}

