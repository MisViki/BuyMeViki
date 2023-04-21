package Test;

import PageObject.GiftVouchersToChooseFromPage;
import org.junit.Assert;
import org.junit.Test;

public class GiftVouchersToChooseFromTest extends BaseTest {
    @Test
    public void ChooseGiftVoucher(){

        giftVouchersToChooseFromPage.selectedGiftVoucher();

        Assert.assertEquals(driver.getCurrentUrl(), "https://buyme.co.il/package/1286825/11618010");
        System.out.println("Test passed");

    }


//    @Test
//    public GiftVouchersToChooseFromTest selectedGift() {
//        giftVouchersToChooseFromPage.selectedGiftVoucher();
//    }
}