package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    // Web Elements
    By emailFild= By.cssSelector("[placeholder='מייל']");
    By passwordFild= By.cssSelector("[placeholder='סיסמה']");
    By forgotPasswordButton= By.cssSelector("['class=bm-body-2 text-link theme db']");
    By loginBuyMeButton= By.cssSelector("[gtm='כניסה ל-BUYME']");
    By loginFacebooButton= By.cssSelector("[class='social-btn facebook']");
    By loginGoogleButton= By.cssSelector("[class='social-btn google']");
    By rememberMeButton= By.cssSelector("[class='ember-view bm-checkbox checked'] [class='check']");



    //By loginErrorMassage= By.cssSelector();


    //page methods
    public LoginPage setemailFild (String email) {
        writeText(emailFild, email);
        return this;
    }

    public LoginPage setpasswordFild(String password) {
        writeText(passwordFild, password);
        return this;
    }

    public LoginPage forgotPasswordButton() {
        click(forgotPasswordButton);
        return this;
    }
    public LoginPage loginBuyMeButton() {
        click(loginBuyMeButton);
        return this;
    }

        public LoginPage loginFacebooButton(){
            click(loginFacebooButton);
            return this;
        }

    public LoginPage loginGoogleButtonutton() {
        click(loginGoogleButton);
        return this;
    }

    public LoginPage rememberMeButton() {
        click(rememberMeButton);
        return this;
    }



}










  //  By loginErrorMassage = By.cssSelector();


    
