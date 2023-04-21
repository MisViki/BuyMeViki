package Flows;

import PageObject.BuyingGiftPage;
import PageObject.GiftVouchersToChooseFromPage;
import org.openqa.selenium.WebDriver;

public class BuyingGiftPageFlow {

    BuyingGiftPage buyingGiftPage;

    //Constructor
    public BuyingGiftPageFlow (WebDriver driver) {
        super();
        buyingGiftPage = new BuyingGiftPage(driver);
    }
}
