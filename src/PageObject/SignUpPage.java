package PageObject;

import Test.SignUpTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    //Constructor
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    // Web Elements

    By LoginButton= By.cssSelector("[class='text-link theme']");
    By FirstNameFild= By.cssSelector("[placeholder='שם פרטי']");
    By EmailFild= By.cssSelector("[placeholder='מייל']");
    By PasswordFild= By.cssSelector("[placeholder='סיסמה']");
    By ValidationPasswordFild= By.cssSelector("[placeholder='אימות סיסמה']");
    By LoginFacebooButton= By.cssSelector("[class='social-btn facebook']");
    By LoginGoogleButton= By.cssSelector("[class='social-btn google']");
    By SignUpButton= By.cssSelector("[gtm='הרשמה ל-BUYME']");
    By AgreementCheckBox= By.cssSelector("[action='register'] div:nth-of-type(5) .check");
    By MailingConfirmationCheckBox= By.cssSelector("[action='register'] div:nth-of-type(6) .check");


    //page methods
    public SignUpPage LoginButton(String Login) {
        click(LoginButton);
        return this;
    }

    public SignUpPage setFirstNameFild(String FirstName) {
        writeText(FirstNameFild, FirstName);
        return this;
    }

    public SignUpPage setEmailFild(String Email) {
        writeText(EmailFild, Email);
        return this;
    }

    public SignUpPage setPasswordFild(String password) {
        writeText(EmailFild, password);
        return this;
    }

    public SignUpPage setValidationPasswordFild(String ValidationPassword) {
        writeText(ValidationPasswordFild, ValidationPassword);
        return this;
    }

    public SignUpPage LoginFacebooButton(String LoginFaceboo) {
        click(LoginFacebooButton);
        return this;
    }

    public SignUpPage LoginGoogleButton(String LoginGoogle) {
        click(LoginGoogleButton);
        return this;
    }

    public SignUpPage SignUpButton(String SignUp) {
        click(SignUpButton);
        return this;
    }

    public SignUpPage AgreementCheckBox(String Agreement) {
        click(AgreementCheckBox);
        return this;
    }

    public SignUpPage MailingConfirmationCheckBox(String MailingConfirmation) {
        click(MailingConfirmationCheckBox);
        return this;
    }



}
