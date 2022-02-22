package ReadRecordTests;

import BasePage.BasePage;
import org.testng.annotations.Test;

public class ReadRecordTest extends BasePage{

    private void inputsearchterm() throws InterruptedException{
        Thread.sleep(2000);
        readRecord.clicksearchfield("TEST1");
    }

    private void clicksearchbtn() throws InterruptedException{
        Thread.sleep(2000);
        readRecord.clicksearchbtn();
    }


    @Test(priority = 1)
    public void Testsearchpage() throws InterruptedException {
        String pageURL1 = "https://computer-database.herokuapp.com/computers?f=test";

        Thread.sleep(4000);

        if (driver.getCurrentUrl().contains(pageURL1)) {
            System.out.println("The webpage URL is correct. Webpage URL is " + pageURL1);
        } else {
            System.out.println("Invalid URL, Actual webpage URL is " + driver.getCurrentUrl());
        }
    }



}
