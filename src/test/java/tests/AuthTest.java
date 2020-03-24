package tests;

import io.qameta.allure.*;
import listeners.ScreenshotListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AuthPage;
import parametrs.UserData;

@Listeners({ScreenshotListener.class})
@Epic(("Regression Tests"))
@Feature("Menu Tests")
public class AuthTest extends BaseTest {

    //Pozitive cases
    @Test(priority = 0, description = "Verify Admin user login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User Admin")
    @Story("Successful login with valid phone number and password")
    public void authorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
        authPage.assertAutoriz(UserData.LOGIN_ADMIN.getValue());
    }

    //Negative cases
    @Test(priority = 0, description = "Verify that Admin can not authorize with empty login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty login")
    @Story("User can not authorize with empty login")
    public void emptyLoginAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization("", UserData.PASS_ADMIN.getValue());
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with empty password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty password")
    @Story("User can not authorize with empty password")
    public void emptyPassAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization(UserData.LOGIN_ADMIN.getValue(), "");
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that system correctly clarify Up register")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with Up register password")
    @Story("User can not authorize with Up register password")
    public void UpRegisterPassAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization(UserData. BRANCH_MASTER_TEST.getValue(), "TEST123456");
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that system correctly clarify down register")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with down register password")
    @Story("User can not authorize with down register password")
    public void DownRegisterPassAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization(UserData. BRANCH_MASTER_TEST.getValue(), "test123456");
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with empty login and password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty login and password")
    @Story("User can not authorize with empty password")
    public void emptyLoginAndPassAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization("", "");
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with wrong password")
    @Story("User can not authorize with wrong password")
    public void invalidPassAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization(UserData.LOGIN_ADMIN.getValue(), "0 0");
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with wrong login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with wrong login")
    @Story("User can not authorize with wrong login")
    public void invalidLoginAuthorization() {
        AuthPage authPage = new AuthPage(driver);
        authPage.autorization("Витали", UserData.PASS_ADMIN.getValue());
        authPage.AssertEqualURLs(driver.getCurrentUrl(), authPage.getURLsMap().get("LoginURL"));
    }
}
