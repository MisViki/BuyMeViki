package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    // Web Elements

    By EmailFild= By.cssSelector("[placeholder='מייל']");
    By PasswordFild= By.cssSelector("[placeholder='סיסמה']");
    By ForgotPasswordButton= By.cssSelector("['class=bm-body-2 text-link theme db']");
    By LoginBuyMeButton= By.cssSelector("[class='bm-body-2 text-link theme db']");
    By LoginFacebooButton= By.cssSelector("[class='social-btn facebook']");
    By LoginGoogleButton= By.cssSelector("[class='social-btn google']");
    By RememberMeButton= By.cssSelector("[class='ember-view bm-checkbox checked'] [class='check']");
    By SignUpButton= By.cssSelector("[class='text-link theme']");

    //By loginErrorMassage= By.cssSelector();


    //page methods
    public LoginPage setEmailFild (String email) {
        writeText(EmailFild, email);
        return this;
    }

    public LoginPage setPasswordFild(String password) {
        writeText(EmailFild, password);
        return this;
    }

    public LoginPage ForgotPasswordButton(String forgotPassword) {
        click(ForgotPasswordButton);
        return this;
    }
    public LoginPage LoginBuyMeButton(String loginBuyMe) {
        click(LoginBuyMeButton);
        return this;
    }

        public LoginPage LoginFacebooButton(String loginFacebook){
            click(LoginFacebooButton);
            return this;
        }

    public LoginPage LoginGoogleButtonutton(String logingoogle) {
        click(LoginGoogleButton);
        return this;
    }

    public LoginPage RememberMeButton(String rememberMe) {
        click(RememberMeButton);
        return this;
    }

    public LoginPage SignUpButton(String signUp) {
        click(SignUpButton);
        return this;
    }

}










  //  By loginErrorMassage = By.cssSelector();


    private void click() {
    }

    private void click() {
    }