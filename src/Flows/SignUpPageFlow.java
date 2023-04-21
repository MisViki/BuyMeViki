package Flows;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignUpPageFlow {

    SignUpPage signUpPage;
    HomePage homePage;

    //Constructor
    public SignUpPageFlow(WebDriver driver) {
        super();
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
    }

    public void siteRegisteration() {
        homePage.loginSignUpButton();
        signUpPage.signUpButton();
        //loginPage.signUpButton();
        signUpPage.setfirstNameFiled("Viki");
        signUpPage.setemailFiled("vikvk@walla.co.il");
        signUpPage.setPasswordFiled("Viki0205");
        signUpPage.setValidationPasswordFiled("Viki0205");
        signUpPage.agreementCheckBox();
        signUpPage.interToBuyMe();

    }
}