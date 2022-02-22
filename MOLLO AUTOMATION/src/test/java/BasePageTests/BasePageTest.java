package BasePageTests;

import BasePage.BasePage;
import org.testng.annotations.Test;

public class BasePageTest extends BasePage {

    @Test(priority = 1)
    public void TestBasePage() throws InterruptedException {
        String pageURL = "https://computer-database.herokuapp.com/computers";

        Thread.sleep(4000);

        if (driver.getCurrentUrl().contains(pageURL)) {
            System.out.println("The webpage URL is correct. Webpage URL is " + pageURL);
        } else {
            System.out.println("Invalid URL, Actual webpage URL is " + driver.getCurrentUrl());
        }
    }


}
