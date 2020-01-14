import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {

    @Test
    public void registration(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getBtnMap().get("RegistrationBTN"));
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("LoginField"), UserData.UserNameEpancha_Vitaliy.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("EmailField"), UserData.VitalikEmail.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("NameOfBranchField"), UserData.KitaBranch.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("KenshiNumberField"), UserData.VitalikNumber.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserLoginField"), UserData.VitalikLogin.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserPassField"), UserData.VitalikPass.getValue());
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserVerifyPassField"), UserData.VitalikPass.getValue());
        registrationPage.clickElement(registrationPage.getBTNsRegistration().get("AccessRegBTN"));
        registrationPage.goToAdmin();
        registrationPage.findUserInUserAdminPage(UserData.VitalikEmail.getValue());
        registrationPage.acceptReg(registrationPage.getAdminSelectors().get("NameBTN"));
        goToSK();
        homePage.autorization(UserData.VitalikLogin.getValue(), UserData.VitalikPass.getValue());
        homePage.assertAutoriz(UserData.VitalikLogin.getValue());
        registrationPage.goToAdmin();
//        registrationPage.findUserInUserAdminPage(UserData.VitalikEmail.getValue());
//        registrationPage.deleteUser(UserData.VitalikEmail.getValue());



    }
}
