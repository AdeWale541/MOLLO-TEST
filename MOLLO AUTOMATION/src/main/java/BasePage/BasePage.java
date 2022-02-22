package BasePage;

import ExtraPage.CreateRecord;
import ExtraPage.ReadRecord;
import ExtraPage.UpdateRecord;
import ExtraPage.DeleteRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static CreateRecord createRecord;
    public static ReadRecord readRecord;
    public static UpdateRecord updateRecord;
    public static DeleteRecord deleteRecord;
    //create different test sections

    protected WebDriver driver;

     @BeforeTest
    public void BasePage(){
         System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://computer-database.herokuapp.com/computers");
//Launch application URL
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


         createRecord = new CreateRecord(driver);
         readRecord = new ReadRecord(driver);
         updateRecord = new UpdateRecord(driver);
         deleteRecord = new DeleteRecord(driver);
     }


    @AfterTest

    public void closeBrowser(){
        driver.quit();
        //Close the window and quit the session
    }
}
