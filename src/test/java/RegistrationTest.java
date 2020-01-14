import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {

    @Test
    public void registration(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getBtnMap().get("RegistrationBTN"));
        registrationPage.fillRegForm(UserData.USER_NAME_VE.getValue(), UserData.EMAIL_VE.getValue(),UserData.BRANCH_NAME.getValue(),
                UserData.KENSHI_NUMBER_VE.getValue(), UserData.LOGIN_NAME_VE.getValue(),UserData.PASS_VE.getValue());
        registrationPage.AuthAdmin ();
        registrationPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        registrationPage.acceptReg(registrationPage.getAdminSelectors().get("NameBTN"));
        goToSK();
        homePage.autorization(UserData.LOGIN_NAME_VE.getValue(), UserData.PASS_VE.getValue());
        homePage.assertAutoriz(UserData.LOGIN_NAME_VE.getValue());
        registrationPage.goToAdmin();
        registrationPage.findUserInUserAdminPage(UserData.EMAIL_VE.getValue());
        registrationPage.deleteUser();
    }
}
