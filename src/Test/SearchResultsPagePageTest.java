package Test;

import org.junit.Assert;
import org.junit.Test;

public class SearchResultsPagePageTest extends BasePageTest {

  @Test
  public void searchResults (){
      searchResultsPage.categorySelectedButton();

      Assert.assertFalse(giftVouchersToChooseFromPage.selectedGiftVoucherIsDisplay());
      System.out.println("Test passed");

  }

    }
