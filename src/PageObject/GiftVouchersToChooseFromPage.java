package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftVouchersToChooseFromPage extends BasePage {

    //Constructor
    public GiftVouchersToChooseFromPage (WebDriver driver) {
        super(driver);
    }
 By selectedGiftVoucher = By.cssSelector("[src='https://buyme.co.il/files/packages/private/packageImage11618010.jpg?v=1646576642?']") ;

    public GiftVouchersToChooseFromPage selectedGiftVoucher() {
        click(selectedGiftVoucher);
        return this;


    }
    public boolean selectedGiftVoucherIsDisplay(){
        return elementIsDisplayed(selectedGiftVoucher);
    }

}

