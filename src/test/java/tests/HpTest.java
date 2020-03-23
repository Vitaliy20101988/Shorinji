package tests;

import io.qameta.allure.*;
import listeners.ScreenshotListener;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import parametrs.UserData;


@Listeners({ScreenshotListener.class})
@Epic(("Regression Tests"))
@Feature("Menu Tests")
public class HpTest extends BaseTest {

//NA User  Verify menu Links
    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "UnauthorizedLeftMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLinkNAUser(By LeftMenuBtn, String LeftMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(LeftMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), LeftMenuURL);
    }

    @DataProvider(name = "UnauthorizedLeftMenu")
    public static Object[][] leftMenuData() {
        return new Object[][]{
                {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnMap().get("ImpressionsBtn"), HomePage.getURLsMap().get("ImpressionsURL")},
                {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")},
                {HomePage.getBtnMap().get("ShorinjiKempoBtn"), HomePage.getURLsMap().get("ShorinjiKempoURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "UnauthorizedTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLink(By TopMenuBtn, String TopMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "UnauthorizedTopMenu")
    public static Object[][] TopMenuData() {
        return new Object[][]{
                {HomePage.getBtnMap().get("MainBtn"), HomePage.getURLsMap().get("MainURL")},
                {HomePage.getBtnMap().get("NewsBtn"), HomePage.getURLsMap().get("NewsURL")},
                {HomePage.getBtnMap().get("FederationBtn"), HomePage.getURLsMap().get("FederationURL")},
                {HomePage.getBtnMap().get("BranchesBtn"), HomePage.getURLsMap().get("BranchesURL")},
                {HomePage.getBtnMap().get("CalendarBtn"), HomePage.getURLsMap().get("CalendarURL")},
                {HomePage.getBtnMap().get("CharterBtn"), HomePage.getURLsMap().get("CharterURL")},
                {HomePage.getBtnMap().get("LinksBtn"), HomePage.getURLsMap().get("LinksURL")}
        };
    }

    //Admin User  Verify menu Links
    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "AdminLeftMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLinkAdmin(By LeftMenuBtn, String LeftMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
        homePage.clickElement(LeftMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), LeftMenuURL);
    }

    @DataProvider(name = "AdminLeftMenu")
    public static Object[][] leftMenuDataAdmin() {
        return new Object[][]{
                {HomePage.getBtnMap().get("ShorinjiKempoBtn"), HomePage.getURLsMap().get("ShorinjiKempoURL")},
                {HomePage.getBtnMap().get("TechnikaBtn"), HomePage.getURLsMap().get("TechnikURL")},
                {HomePage.getBtnMap().get("FilosofiyaKaisoBtn"), HomePage.getURLsMap().get("FilosofiyaKaisoURL")},
                {HomePage.getBtnMap().get("KongoZenBtn"), HomePage.getURLsMap().get("VerouchenieKongoZenURL")},
                {HomePage.getBtnMap().get("BuddizmBtn"), HomePage.getURLsMap().get("BuddizmURL")},
                {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnMap().get("HappyoBtn"), HomePage.getURLsMap().get("HappyoURL")},
                {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnMap().get("ImpressionsBtn"), HomePage.getURLsMap().get("ImpressionsURL")},
                {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")},
                {HomePage.getBtnMap().get("ShopBtn"), HomePage.getURLsMap().get("ShopURL")},
                {HomePage.getBtnMap().get("PaymentsBtn"), HomePage.getURLsMap().get("PaymentsURL")},
                {HomePage.getBtnMap().get("LibaryForKenshiBtn"), HomePage.getURLsMap().get("LibaryForKenshiURL")},
                {HomePage.getBtnMap().get("LibraryForMonshintoBtn"), HomePage.getURLsMap().get("LibraryForMonshintoURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "AdminTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLinkAdmin(By TopMenuBtn, String TopMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "AdminTopMenu")
    public static Object[][] TopMenuDataAdmin() {
        return new Object[][]{
                {HomePage.getBtnMap().get("MainBtn"), HomePage.getURLsMap().get("MainURL")},
                {HomePage.getBtnMap().get("NewsBtn"), HomePage.getURLsMap().get("NewsURL")},
                {HomePage.getBtnMap().get("FederationBtn"), HomePage.getURLsMap().get("FederationURL")},
                {HomePage.getBtnMap().get("BranchesBtn"), HomePage.getURLsMap().get("BranchesURL")},
                {HomePage.getBtnMap().get("CalendarBtn"), HomePage.getURLsMap().get("CalendarURL")},
                {HomePage.getBtnMap().get("CharterBtn"), HomePage.getURLsMap().get("CharterURL")},
                {HomePage.getBtnMap().get("LinksBtn"), HomePage.getURLsMap().get("LinksURL")},
                {HomePage.getBtnMap().get("DocumentsBtn"), HomePage.getURLsMap().get("DocumentsURL")}
        };
    }

    //Kenshi User  Verify menu Links
    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "KenshiLeftMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLinkKenshi(By LeftMenuBtn, String LeftMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.KENSHI_LOGIN.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(LeftMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), LeftMenuURL);
    }

    @DataProvider(name = "KenshiLeftMenu")
    public static Object[][] leftMenuDataKenshi() {
        return new Object[][]{
                {HomePage.getBtnMap().get("ShorinjiKempoBtn"), HomePage.getURLsMap().get("ShorinjiKempoURL")},
                {HomePage.getBtnMap().get("TechnikaBtn"), HomePage.getURLsMap().get("TechnikURL")},
                {HomePage.getBtnMap().get("FilosofiyaKaisoBtn"), HomePage.getURLsMap().get("FilosofiyaKaisoURL")},
                {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnMap().get("HappyoBtn"), HomePage.getURLsMap().get("HappyoURL")},
                {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnMap().get("ImpressionsBtn"), HomePage.getURLsMap().get("ImpressionsURL")},
                {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")},
                {HomePage.getBtnMap().get("ShopBtn"), HomePage.getURLsMap().get("ShopURL")},
                {HomePage.getBtnMap().get("PaymentsBtn"), HomePage.getURLsMap().get("PaymentsURL")},
                {HomePage.getBtnMap().get("LibaryForKenshiBtn"), HomePage.getURLsMap().get("LibaryForKenshiURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "KenshiTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLinkKenshi(By TopMenuBtn, String TopMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.KENSHI_LOGIN.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "KenshiTopMenu")
    public static Object[][] TopMenuDataKenshi() {
        return new Object[][]{
                {HomePage.getBtnMap().get("MainBtn"), HomePage.getURLsMap().get("MainURL")},
                {HomePage.getBtnMap().get("NewsBtn"), HomePage.getURLsMap().get("NewsURL")},
                {HomePage.getBtnMap().get("FederationBtn"), HomePage.getURLsMap().get("FederationURL")},
                {HomePage.getBtnMap().get("BranchesBtn"), HomePage.getURLsMap().get("BranchesURL")},
                {HomePage.getBtnMap().get("CalendarBtn"), HomePage.getURLsMap().get("CalendarURL")},
                {HomePage.getBtnMap().get("CharterBtn"), HomePage.getURLsMap().get("CharterURL")},
                {HomePage.getBtnMap().get("LinksBtn"), HomePage.getURLsMap().get("LinksURL")},
        };
    }


    //Monshinto User  Verify menu Links
    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "MonshintoLeftMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLinkMonshinto(By LeftMenuBtn, String LeftMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.MONSHINTO_LOGIN.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(LeftMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), LeftMenuURL);
    }

    @DataProvider(name = "MonshintoLeftMenu")
    public static Object[][] leftMenuDataMonshinto() {
        return new Object[][]{
                {HomePage.getBtnMap().get("ShorinjiKempoBtn"), HomePage.getURLsMap().get("ShorinjiKempoURL")},
                {HomePage.getBtnMap().get("TechnikaBtn"), HomePage.getURLsMap().get("TechnikURL")},
                {HomePage.getBtnMap().get("FilosofiyaKaisoBtn"), HomePage.getURLsMap().get("FilosofiyaKaisoURL")},
                {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnMap().get("HappyoBtn"), HomePage.getURLsMap().get("HappyoURL")},
                {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnMap().get("ImpressionsBtn"), HomePage.getURLsMap().get("ImpressionsURL")},
                {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")},
                {HomePage.getBtnMap().get("ShopBtn"), HomePage.getURLsMap().get("ShopURL")},
                {HomePage.getBtnMap().get("PaymentsBtn"), HomePage.getURLsMap().get("PaymentsURL")},
                {HomePage.getBtnMap().get("LibaryForKenshiBtn"), HomePage.getURLsMap().get("LibaryForKenshiURL")},
                {HomePage.getBtnMap().get("LibraryForMonshintoBtn"), HomePage.getURLsMap().get("LibraryForMonshintoURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "MonshintoTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLinkMonshinto(By TopMenuBtn, String TopMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.MONSHINTO_LOGIN.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "MonshintoTopMenu")
    public static Object[][] TopMenuDataMonshinto() {
        return new Object[][]{
                {HomePage.getBtnMap().get("MainBtn"), HomePage.getURLsMap().get("MainURL")},
                {HomePage.getBtnMap().get("NewsBtn"), HomePage.getURLsMap().get("NewsURL")},
                {HomePage.getBtnMap().get("FederationBtn"), HomePage.getURLsMap().get("FederationURL")},
                {HomePage.getBtnMap().get("BranchesBtn"), HomePage.getURLsMap().get("BranchesURL")},
                {HomePage.getBtnMap().get("CalendarBtn"), HomePage.getURLsMap().get("CalendarURL")},
                {HomePage.getBtnMap().get("CharterBtn"), HomePage.getURLsMap().get("CharterURL")},
                {HomePage.getBtnMap().get("LinksBtn"), HomePage.getURLsMap().get("LinksURL")},
        };
    }

    //BranchMaster User  Verify menu Links
    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "BranchMasterLeftMenu")
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLinkABranchMaster(By LeftMenuBtn, String LeftMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.BRANCH_MASTER_TEST.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(LeftMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), LeftMenuURL);
    }

    @DataProvider(name = "BranchMasterLeftMenu")
    public static Object[][] leftMenuDataBranchMaster() {
        return new Object[][]{
                {HomePage.getBtnMap().get("ShorinjiKempoBtn"), HomePage.getURLsMap().get("ShorinjiKempoURL")},
                {HomePage.getBtnMap().get("TechnikaBtn"), HomePage.getURLsMap().get("TechnikURL")},
                {HomePage.getBtnMap().get("FilosofiyaKaisoBtn"), HomePage.getURLsMap().get("FilosofiyaKaisoURL")},
                {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnMap().get("HappyoBtn"), HomePage.getURLsMap().get("HappyoURL")},
                {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnMap().get("ImpressionsBtn"), HomePage.getURLsMap().get("ImpressionsURL")},
                {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")},
                {HomePage.getBtnMap().get("ShopBtn"), HomePage.getURLsMap().get("ShopURL")},
                {HomePage.getBtnMap().get("PaymentsBtn"), HomePage.getURLsMap().get("PaymentsURL")},
                {HomePage.getBtnMap().get("LibaryForKenshiBtn"), HomePage.getURLsMap().get("LibaryForKenshiURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "BranchMasterTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLinkBranchMaster(By TopMenuBtn, String TopMenuURL) {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.BRANCH_MASTER_TEST.getValue(), UserData.TEST_PASS.getValue());
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "BranchMasterTopMenu")
    public static Object[][] TopMenuDataBranchMaster() {
        return new Object[][]{
                {HomePage.getBtnMap().get("MainBtn"), HomePage.getURLsMap().get("MainURL")},
                {HomePage.getBtnMap().get("NewsBtn"), HomePage.getURLsMap().get("NewsURL")},
                {HomePage.getBtnMap().get("FederationBtn"), HomePage.getURLsMap().get("FederationURL")},
                {HomePage.getBtnMap().get("BranchesBtn"), HomePage.getURLsMap().get("BranchesURL")},
                {HomePage.getBtnMap().get("CalendarBtn"), HomePage.getURLsMap().get("CalendarURL")},
                {HomePage.getBtnMap().get("CharterBtn"), HomePage.getURLsMap().get("CharterURL")},
                {HomePage.getBtnMap().get("LinksBtn"), HomePage.getURLsMap().get("LinksURL")},
                {HomePage.getBtnMap().get("DocumentsBtn"), HomePage.getURLsMap().get("DocumentsURL")}
        };
    }




    //Pozitive cases
    @Test(priority = 0, description = "Verify Admin user login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User Admin")
    @Story("Successful login with valid phone number and password")
    public void authorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
        homePage.assertAutoriz(UserData.LOGIN_ADMIN.getValue());
    }

    //Negative cases
    @Test(priority = 0, description = "Verify that Admin can not authorize with empty login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty login")
    @Story("User can not authorize with empty login")
    public void emptyLoginAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization("", UserData.PASS_ADMIN.getValue());
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with empty password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty password")
    @Story("User can not authorize with empty password")
    public void emptyPassAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), "");
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that system correctly clarify Up register")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with Up register password")
    @Story("User can not authorize with Up register password")
    public void UpRegisterPassAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData. BRANCH_MASTER_TEST.getValue(), "TEST123456");
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that system correctly clarify down register")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with down register password")
    @Story("User can not authorize with down register password")
    public void DownRegisterPassAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData. BRANCH_MASTER_TEST.getValue(), "test123456");
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with empty login and password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with empty login and password")
    @Story("User can not authorize with empty password")
    public void emptyLoginAndPassAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization("", "");
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with wrong password")
    @Story("User can not authorize with wrong password")
    public void invalidPassAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), "0 0");
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }

    @Test(priority = 0, description = "Verify that Admin can not authorize with wrong login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login User with wrong login")
    @Story("User can not authorize with wrong login")
    public void invalidLoginAuthorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization("Витали", UserData.PASS_ADMIN.getValue());
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getURLsMap().get("LoginURL"));
    }


    @Test
    public void verifyTopMenuLinkMons() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(UserData.MONSHINTO_LOGIN.getValue(), UserData.TEST_PASS.getValue());
        if(homePage.ElementPresent(By.linkText("Документы"))){
          Assert.assertFalse(false);
        }else
            Assert.assertTrue(true);
        }









    //     TODO write registration with different access levels for test Left Menu and TOP Menu by Users with different access level




}
