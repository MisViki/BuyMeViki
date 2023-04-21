package Test;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void siteLogin(){

        //פרטי כניסה
        loginPage.setemailFild("vik155@walla.co.il");
        loginPage.setpasswordFild("Viki0205");
        loginPage.loginBuyMeButton();
        //אסרט לכניסה בתהליך רכישה
        Assert.assertFalse(buyingGiftPage.bitButtonIsDisplay());
        System.out.println("Test passed");

    }
}

//אסרט במידה ועושים טסטס לכניסה בלבד
// Assert.assertFalse(homePage.myAccountDropDownIsDisplayed());
//System.out.println("Test passed");
