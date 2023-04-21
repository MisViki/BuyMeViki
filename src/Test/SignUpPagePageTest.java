package Test;

import org.junit.Assert;
import org.junit.Test;

public class SignUpPagePageTest extends BasePageTest {

    @Test
    public void siteRegisteration(){
        homePage.loginSignUpButton();
        signUpPage.signUpButton();
        //loginPage.signUpButton();
        signUpPage.setfirstNameFiled("Viki");
        signUpPage.setemailFiled("vikvk@walla.co.il");
        signUpPage.setPasswordFiled("Viki0205");
        signUpPage.setValidationPasswordFiled("Viki0205");
        signUpPage.agreementCheckBox();
        signUpPage.interToBuyMe();


        //asserttion
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertFalse(homePage.myAccountDropDownIsDisplayed());
        System.out.println("Test passed");

    }
    private void assertEquals() {
    }

}
