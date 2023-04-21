package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

  //Constructor
  public HomePage(WebDriver driver) {
    super(driver);
  }

  //כניסה/ הרשמה במסך ראשי
  By loginSignUpButton = By.cssSelector("[class='notSigned']");
  //קומבו החשבון שלי
  By myAccountDropDown = By.xpath("//*[@class='ember-view dropdown solid']/a/span");
  //sum combo
  By sumDropDown = By.cssSelector("[title='סכום']");
  //gift price range
  By giftPriceRangeButton = By.cssSelector("[aria-label='סכום'] [value='5']");
  //area
  By areaDropDown = By.cssSelector("[title='אזור']");
  //Eilat area
  By eilatAreaButton =By.cssSelector("[role='listbox'] [value='2836']");
  //category
  By categoryDropDown = By.cssSelector("[title='קטגוריה']");
  //vacation and hotels
  By categoryVacationAndHotelsButton = By.cssSelector("[class='dropdown'] [value='315']");
  //button find me a present
  By  findMePresentButton = By.cssSelector("[class='ember-view bm-btn no-reverse main md ember-view']");



  public HomePage loginSignUpButton() {
    click(loginSignUpButton);
    return this;
  }

  public HomePage myAccountDropDown(){
    click(myAccountDropDown);
    return this;
  }

  public HomePage sumDropDown(){
    click(sumDropDown);
    return this;
  }

  public HomePage giftPriceRangeButton() {
    click(giftPriceRangeButton);
    return this;
  }

  public HomePage areaDropDown(){
    click(areaDropDown);
    return this;
  }

  public HomePage eilatAreaButton(){
    click(eilatAreaButton);
    return this;
  }

  public HomePage categoryDropDown(){
    click(categoryDropDown);
    return this;
  }

  public HomePage categoryVacationAndHotelsButton(){
    click(categoryVacationAndHotelsButton);
    return this;
  }

  public HomePage findMePresentButton(){
    click(findMePresentButton);
    return this;
  }

  public boolean myAccountIsDisplayed(){
    return elementIsDisplayed(myAccountDropDown);
  }


  public boolean myAccountDropDownIsDisplayed() {
    return false;
  }

  public <retutn> boolean sumDropDownIsDisplayed() {return false;}
}

