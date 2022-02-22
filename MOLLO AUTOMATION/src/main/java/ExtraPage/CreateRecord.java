package ExtraPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateRecord {
    public CreateRecord(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;


    String dat2 = "2021-2-26";

    private By Addbtn = By.id("add");
    private By Compname = By.id("name");
    private By Introdate = By.id("introduced");
    private By Discodate = By.id("discontinued");
    private By Companyname = By.id("company");
    private By Compacro = By.linkText("ASUS");
    private By Createbtn = By.id("btn primary");
    private By Successpopup = By.className("alert-message warning");

    public void clickaddbtn() {
        driver.findElement(Addbtn).click();
        //Find the login button and click it
    }

    public void entercompname(String comp) {
        driver.findElement(Compname).sendKeys (comp);
        //find the username field and assign a string to the username value
    }

    public void enterIntrodate(String dat1) {
        driver.findElement(Introdate).sendKeys (dat1);
        //find the password field and assign a string to the password value

    }

    public void enterDiscodate(String dat2) {
        driver.findElement(Discodate).sendKeys (dat2);
        //find the password field and assign a string to the password value
    }

    public void clickcreatebtn() {
        driver.findElement(Createbtn).click();
        //find the password field and assign a string to the password value

    }
    public void verifysuccessbar(){
        driver.findElement(Successpopup).isDisplayed();

    }

}

