package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyingGiftPage extends BasePage {

    //Constructor
    public BuyingGiftPage(WebDriver driver) {
        super(driver);
    }

    //  By forSomeoneElseButton = By.cssSelector("[gtm='למישהו אחר']");
    By nameForWhoThisGiftFild = By.cssSelector("[data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']");
    By whatAnEventDropDown = By.cssSelector("[title='לאיזה אירוע?']");
    By reasonToPartyButton = By.cssSelector("[style='width: auto'] [value='12']");
    By continuButton = By.cssSelector("[gtm='המשך']");

    By smsButton = By.cssSelector("[class='toggle-icon '] [gtm='method-sms']");
    By phoneNumberFild = By.cssSelector("[class='toggle-icon checked'] [placeholder='נייד מקבל/ת המתנה']");
    By nameGiftFromFild = By.cssSelector("[placeholder='שם שולח המתנה']");
    By phoneNumberOfTheSenderFild = By.cssSelector("[placeholder='מספר נייד']");
    By continuToPaymentButton = By.cssSelector("[gtm='המשך לתשלום']");

    By bitButton = By.cssSelector("[class='ember-view bm-payment-method bottom-xs bit']");
    By iReadAndAgreedRadioBox = By.cssSelector("[cy='10']");
    By paymentByBitButton = By.cssSelector("[gtm='תשלום באמצעות bit']");

    By returnToPayment= By.cssSelector("[class='continue-btn']");


    //bit page
   By bitPagePhoneFild = By.cssSelector("[name='phoneNumber']");
   public BuyingGiftPage bitPagePhoneFild (String number){
        writeText(bitPagePhoneFild, number);
        return this;
   }


    public BuyingGiftPage setnameForWhoThisGiftFild(String name) {
        writeText(nameForWhoThisGiftFild, name);
        return this;
    }

    public BuyingGiftPage whatAnEventDropDown() {
        click(whatAnEventDropDown);
        return this;
    }

    public BuyingGiftPage reasonToPartyButton() {
        click(reasonToPartyButton);
        return this;
    }

    public BuyingGiftPage continuButton() {
        click(continuButton);
        return this;
    }


    public BuyingGiftPage smsButton() {
        click(smsButton);
        return this;
    }

    public BuyingGiftPage setnameGiftFromFild(String name) {
        writeText(nameGiftFromFild, name);
        return this;
    }

    public BuyingGiftPage setphoneNumberFild(String number) {
        writeText(phoneNumberFild, number);
        return this;

    }

    public BuyingGiftPage setphoneNumberOfTheSenderFild(String number) {
        writeText(phoneNumberOfTheSenderFild, number);
        return this;
    }

    public BuyingGiftPage continuToPaymentButton() {
        click(continuToPaymentButton);
        return this;
    }


    public BuyingGiftPage bitButton() {
        click(bitButton);
        return this;
    }

    public BuyingGiftPage iReadAndAgreedRadioBox() {
        click(iReadAndAgreedRadioBox);
        return this;
    }

    public BuyingGiftPage paymentByBitButton() {
        click(paymentByBitButton);
        return this;
    }

    public boolean bitButtonIsDisplay() {
        return elementIsDisplayed(bitButton);
    }

    public boolean returnToPaymentIsDisplay(){
       return elementIsDisplayed(returnToPayment);
    }
}