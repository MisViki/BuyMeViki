package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    //Constructor
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    // Web Elements

   // By loginButton= By.cssSelector("[class='text-link theme']");
    By firstNameFiled = By.cssSelector("[placeholder='שם פרטי']");
    By emailFiled = By.cssSelector("[placeholder='מייל']");
    By passwordFiled= By.cssSelector("[placeholder='סיסמה']");
    By validationPasswordFiled= By.cssSelector("[placeholder='אימות סיסמה']");
    By loginFacebooButton= By.cssSelector("[class='social-btn facebook']");
    By loginGoogleButton= By.cssSelector("[class='social-btn google']");
    By signUpButton= By.cssSelector("[class='text-link theme']");
    By agreementCheckBox= By.cssSelector("[action='register'] div:nth-of-type(5) .fill");
    By mailingConfirmationCheckBox= By.cssSelector("[action='register'] div:nth-of-type(6) .check");
    By interToBuyMe= By.cssSelector("[gtm='הרשמה ל-BUYME']");

    //page methods


    public SignUpPage setfirstNameFiled (String FirstName) {
        writeText(firstNameFiled, FirstName);
        return this;
    }

    public SignUpPage setemailFiled(String Email) {
        writeText(emailFiled, Email);
        return this;
    }

    public SignUpPage setPasswordFiled(String password) {
        writeText(passwordFiled, password);
        return this;
    }

    public SignUpPage setValidationPasswordFiled(String ValidationPassword) {
        writeText(validationPasswordFiled, ValidationPassword);
        return this;
    }

    public SignUpPage loginFacebooButton() {
        click(loginFacebooButton);
        return this;
    }

    public SignUpPage loginGoogleButton() {
        click(loginGoogleButton);
        return this;
    }

    public SignUpPage signUpButton() {
        click(signUpButton);
        return this;
    }

    public SignUpPage agreementCheckBox() {
        click(agreementCheckBox);
        return this;
    }

    public SignUpPage mailingConfirmationCheckBox() {
        click(mailingConfirmationCheckBox);
        return this;
    }

    public SignUpPage interToBuyMe() {
        click(interToBuyMe);
        return this;
    }

}
