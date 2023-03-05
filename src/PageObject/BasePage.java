package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
   public WebElement driver ;
   public WebDriver wait ;

   // Constructor
    public BasePage(WebDriver driver){
        this.driver = driver ;
        wait = new WebDriverWait(driver, Duration.ofSeconds(65) );
    }

    // Click Mathod
    public void click ( By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);

    }
    //Element enabled
public Boolean elementIsEnabled(By elementLocation) {return driver}

    //Element displayed
    public Boolean elementIsDisplayed(By elementLocation) {return driver}


}
