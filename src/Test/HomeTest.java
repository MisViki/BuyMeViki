package Test;

import org.junit.Assert;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void loginToSite(){
        homePageFlow.moveToLoginScreen();
        loginFlow.siteLogin();
    }


    @Test
    public void findMeAPresent() {
        //כניסה/ הרשמה במסך ראשי
        //  homePage.loginSignUpButton();

        //שדות חיפוש מתנה
        homePage.sumDropDown();
        homePage.giftPriceRangeButton();
        homePage.areaDropDown();
        homePage.eilatAreaButton();
        homePage.categoryDropDown();
        homePage.categoryVacationAndHotelsButton();
        homePage.findMePresentButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://buyme.co.il/search?budget=5&category=315&region=2836");
        System.out.println("Test passed");

        searchResultsPage.categorySelectedButton();

        Assert.assertFalse(giftVouchersToChooseFromPage.selectedGiftVoucherIsDisplay());
        System.out.println("Test passed");


        giftVouchersToChooseFromPage.selectedGiftVoucher();

        Assert.assertEquals(driver.getCurrentUrl(), "https://buyme.co.il/package/1286825/11618010");
        System.out.println("Test passed");

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


       // Assert.assertFalse(homePage.myAccountDropDownIsDisplayed());
        //System.out.println("Test passed");

        //רכישת מתנה
        buyingGiftPage.bitButton();
        buyingGiftPage.iReadAndAgreedRadioBox();
        buyingGiftPage.paymentByBitButton();

       Assert.assertFalse(buyingGiftPage.returnToPaymentIsDisplay());
        System.out.println("Test passed");


    }
    
}













