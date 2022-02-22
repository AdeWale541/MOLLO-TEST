package ExtraPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReadRecord {
    public ReadRecord (WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver driver;

    private By Searchbox = By.id("searchbox");
    private By Searchbtn = By.id("searchsubmit");

    public void clicksearchfield(String nam) {
        driver.findElement(Searchbox).sendKeys(nam);

    }

    public void clicksearchbtn() {
        driver.findElement(Searchbtn).click();
   }

}
