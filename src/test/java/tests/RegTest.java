package tests;
import io.qameta.allure.*;
import listeners.ScreenshotListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AuthPage;
import pages.AuthRegModule;
import pages.RegPage;
import parametrs.UserData;

@Listeners({ScreenshotListener.class})
@Epic(("Regression Tests"))
@Feature("Menu Tests")
public class RegTest extends BaseTest {

   // TODO write method which will check that user is already registered, and after this test will delete user and regitrated one more time again

    @Test(priority = 0, description = "Verify user Sign Up")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Successful register with valid phone number and password")
    @Description("User can register with invalid data")
    public void registration() throws InterruptedException {
        RegPage regPage = new RegPage(driver);
//        HomePage homePage = new HomePage(driver);
        AuthPage authPage = new AuthPage(driver);
        AuthRegModule authRegModule = new AuthRegModule(driver);
        authRegModule.openRegPage();
        regPage.fillRegForm(UserData.USER_NAME_VE.getValue(), UserData.EMAIL_VE.getValue(),UserData.BRANCH_NAME.getValue(),
                UserData.KENSHI_NUMBER_VE.getValue(), UserData.LOGIN_NAME_VE.getValue(),UserData.PASS_VE.getValue());
        regPage.AuthAdmin ();
        regPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        regPage.confirmReg(regPage.getAdminSelectors().get("NameBTN"));
        goToSK();
        authPage.autorization(UserData.LOGIN_NAME_VE.getValue(), UserData.PASS_VE.getValue());
        regPage.goToAdmin();
        regPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        regPage.deleteUser();
        Thread.sleep(1000);
    }
}
