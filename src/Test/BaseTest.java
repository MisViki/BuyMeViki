package Test;

import Flows.*;
import PageObject.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class BaseTest {

    static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest myTests;
    private static String reportFilePath = "C:\\Users\\USER\\Desktop\\אוטומציה\\פרוייקט\\BuyMe.html";
    private static String ImagesPath = "C:\\Users\\USER\\Desktop\\אוטומציה\\פרוייקט\\צילומי מסך";
//איתחול
    static LoginPage loginPage;
    static SignUpPage signUpPage;
    static HomePage homePage;
    static GiftVouchersToChooseFromPage giftVouchersToChooseFromPage;
    static SearchResultsPage searchResultsPage;
    static BuyingGiftPage buyingGiftPage;
    static LoginPageFlow loginFlow;
    static HomePageFlow homePageFlow;
    static SignUpPageFlow signUpPageFlow;
    static SearchResultsPageFlow searchResultsPageFlow;
    static BuyingGiftPageFlow buyingGiftPageFlow;
    static GiftVouchersToChooseFromPageFlow giftVouchersToChooseFromPageFlow;


    @BeforeClass
    public static void setUp () throws ParserConfigurationException, IOException, SAXException {
        extent = new ExtentReports(reportFilePath);
        myTests = extent.startTest("TestDemo");
        String website = readFromFile ("brwoser");

        if (website.equals("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--start-maximized");
            System.setProperty("WebDriver.chrome.driver" , "C://Users//USER//Desktop//אוטומציה//דרייברים של דפדפנים//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver(chromeOptions);
        }else if (website.equals("firefox")) {
            System.setProperty("WebDriver.firefox.driver" , "C:\\Users\\USER\\Desktop\\אוטומציה\\דרייברים של דפדפנים\\geckodriver-v0.32.2-win32");
            driver = new FirefoxDriver();
        }
        //השמה
        loginPage = new LoginPage(driver);
        signUpPage= new SignUpPage(driver);
        homePage = new HomePage(driver);
        giftVouchersToChooseFromPage = new GiftVouchersToChooseFromPage (driver);
        searchResultsPage = new SearchResultsPage (driver) ;
        buyingGiftPage = new BuyingGiftPage(driver);
        loginFlow = new LoginPageFlow(driver);
        homePageFlow = new HomePageFlow(driver);
        signUpPageFlow = new SignUpPageFlow(driver);
        searchResultsPageFlow= new SearchResultsPageFlow(driver);
        buyingGiftPageFlow= new BuyingGiftPageFlow(driver);
        giftVouchersToChooseFromPageFlow= new GiftVouchersToChooseFromPageFlow(driver);


    }

public static String readFromFile (String keyData) throws  ParserConfigurationException, IOException, SAXException {
    File xmlFile = new File("C:\\Users\\USER\\Desktop\\אוטומציה\\פרוייקט\\config.xml");
    DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
    Document doc=dBuilder.parse(xmlFile);
    doc.getDocumentElement().normalize();

    return doc.getElementsByTagName(keyData).item(0).getTextContent();
}

    private static String takeScreenShot (String ImagesPath){
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
        File screenShotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }

    @Before
    public void openBrowser(){
        driver.get("https://www.buyme.co.il/");
    }


    @AfterClass
    public static void end() throws InterruptedException{
//        // סגירת עמוד
//        driver.close();
//        //סגירת דפדפן
//        driver.quit();
//       //סוגר את הדוח
//        extent.flush();
    }



}

