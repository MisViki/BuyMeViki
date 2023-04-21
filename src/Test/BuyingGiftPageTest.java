package Test;

import org.junit.Assert;
import org.junit.Test;

public class BuyingGiftPageTest extends BasePageTest {
    @Test
    public void buyingGift(){
        buyingGiftPage.setnameForWhoThisGiftFild("Marsel");
        buyingGiftPage.whatAnEventDropDown();
        buyingGiftPage.reasonToPartyButton();
        buyingGiftPage.continuButton();

        buyingGiftPage.smsButton();
        buyingGiftPage.setphoneNumberFild("0546976907");
        buyingGiftPage.setnameGiftFromFild("Viki");
        buyingGiftPage.setphoneNumberOfTheSenderFild("0545281737");
        buyingGiftPage.continuToPaymentButton();

        //פרטי כניסה
        loginPage.setemailFild("vik155@walla.co.il");
        loginPage.setpasswordFild("Viki0205");
        loginPage.loginBuyMeButton();

        Assert.assertFalse(buyingGiftPage.bitButtonIsDisplay());
        System.out.println("Test passed");


        //רכישת מתנה
        buyingGiftPage.bitButton();
        buyingGiftPage.iReadAndAgreedRadioBox();
        buyingGiftPage.paymentByBitButton();

        Assert.assertFalse(buyingGiftPage.returnToPaymentIsDisplay());
        System.out.println("Test passed");


    }



}
