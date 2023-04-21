package Flows;

import PageObject.HomePage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class HomePageFlow {

    HomePage homePage;

    //Constructor
    public HomePageFlow (WebDriver driver) {
        super();
        homePage = new HomePage(driver);
    }


    public void moveToLoginScreen(){
        homePage.loginSignUpButton();
    }


}
