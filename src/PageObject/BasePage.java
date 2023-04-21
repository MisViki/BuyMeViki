package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(65));
    }

    // Click Mathod
    public  void click(By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);

    }


    //wait
    public void waitVisibility(By by) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    // select
    public void selectByIndex(By elementLoction, int index) {
        waitVisibility(elementLoction);
        WebElement combo = driver.findElement(elementLoction);
        Select selectIndex = new Select(combo);
        selectIndex.selectByIndex(index);

    }

    public void selectByText(By elementLoction, String text) {
        waitVisibility(elementLoction);
        WebElement combo = driver.findElement(elementLoction);
        Select selectIndex = new Select(combo);
        selectIndex.selectByValue(text);

    }

    //assert is display
    public boolean elementIsDisplayed(By element){
        boolean res = true;
        try {
            res = driver.findElement(element).isDisplayed();
        }
        catch (NoSuchElementException ex) {
            res =false;
        }
        return res;
    }

        //Element enabled
//public Boolean elementIsEnabled(By elementLocation) {return driver}

        //Element displayed
        // public Boolean elementIsDisplayed(By elementLocation) {return driver}



}
