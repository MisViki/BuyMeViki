package Flows;

import PageObject.GiftVouchersToChooseFromPage;
import PageObject.SearchResultsPage;
import org.openqa.selenium.WebDriver;

public class GiftVouchersToChooseFromPageFlow {

    GiftVouchersToChooseFromPage giftVouchersToChooseFromPage;

    //Constructor
    public GiftVouchersToChooseFromPageFlow (WebDriver driver) {
        super();
        giftVouchersToChooseFromPage = new GiftVouchersToChooseFromPage(driver);
    }

    public void ChooseGiftVoucher (){
        giftVouchersToChooseFromPage.selectedGiftVoucher();
    }
}
