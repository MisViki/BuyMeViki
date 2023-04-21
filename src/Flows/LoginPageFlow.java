package Flows;

import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageFlow {

    LoginPage loginPage;

    //Constructor
    public LoginPageFlow(WebDriver driver) {
        super();
        loginPage = new LoginPage(driver);
    }

    public void siteLogin(){
        //פרטי כניסה
        loginPage.setemailFild("vik155@walla.co.il");
        loginPage.setpasswordFild("Viki0205");
        loginPage.loginBuyMeButton();
    }

}
