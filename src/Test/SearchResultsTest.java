package Test;

import PageObject.SearchResultsPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchResultsTest extends BaseTest {

  @Test
  public void searchResults (){
      searchResultsPage.categorySelectedButton();

      Assert.assertFalse(giftVouchersToChooseFromPage.selectedGiftVoucherIsDisplay());
      System.out.println("Test passed");

  }

    }
