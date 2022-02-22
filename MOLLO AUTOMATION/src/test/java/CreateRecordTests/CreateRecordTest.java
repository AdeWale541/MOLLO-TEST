package CreateRecordTests;
import BasePage.BasePage;
import org.testng.annotations.Test;

public class CreateRecordTest extends BasePage {

    private void inputcompname() throws InterruptedException{
        Thread.sleep(2000);
        createRecord.clickaddbtn();
    }

    private void entercompname() throws InterruptedException{
        Thread.sleep(2000);
        createRecord.entercompname("TEST1");
    }


    private void inputintroddate() throws InterruptedException{
        Thread.sleep(2000);
        createRecord.enterIntrodate("2016-3-10");
    }

    private void inputdiscontdate() throws InterruptedException{
        Thread.sleep(2000);
        createRecord.enterDiscodate("2020-5-13");
    }
    private void clickcreatebtn() throws InterruptedException{
        Thread.sleep(2000);
        createRecord.clickcreatebtn();
    }

    @Test(priority = 1)
    public void TestVerifysuccessfulnewcomp() {
        createRecord.verifysuccessbar();
        System.out.println("The login Popup was displayed");
    }


}
