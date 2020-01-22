package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegPage;
import parametrs.UserData;
import tests.BaseTest;


public class RegTest extends BaseTest {

   // TODO write method which will check that user is already registered, and after this test will delete user and regitrated one more time again

    @Test
    public void registration() throws InterruptedException {
        RegPage regPage = new RegPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getBtnMap().get("RegistrationBTN"));
        regPage.fillRegForm(UserData.USER_NAME_VE.getValue(), UserData.EMAIL_VE.getValue(),UserData.BRANCH_NAME.getValue(),
                UserData.KENSHI_NUMBER_VE.getValue(), UserData.LOGIN_NAME_VE.getValue(),UserData.PASS_VE.getValue());
        regPage.AuthAdmin ();
        regPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        regPage.confirmReg(regPage.getAdminSelectors().get("NameBTN"));
        goToSK();
        homePage.autorization(UserData.LOGIN_NAME_VE.getValue(), UserData.PASS_VE.getValue());
        regPage.goToAdmin();
        regPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        regPage.deleteUser();
        Thread.sleep(1000);
    }
}