package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthRegModule;
import pages.ForgetPassPage;
import parametrs.UserData;

public class ForgetPassTest extends BaseTest {

    @Test
    public void forgetName() throws InterruptedException {
        AuthRegModule authRegModule = new AuthRegModule(driver);
        ForgetPassPage forgetPassPage = new ForgetPassPage(driver);
        authRegModule.openPage("ForgetPasswordBTN");
        forgetPassPage.selectCheckbox("ForgetNameBTN");
        forgetPassPage.fillForgeForm(forgetPassPage.getSendField(), UserData.KENSHI_LOGIN.getValue());
        forgetPassPage.clickSendBTN();
    }
}
