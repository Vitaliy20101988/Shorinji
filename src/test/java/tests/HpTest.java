package tests;

import io.qameta.allure.*;
import listeners.ScreenshotListener;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import parametrs.UserData;
import tests.BaseTest;

@Listeners({ScreenshotListener.class})
@Epic(("Regression Tests"))
@Feature("Menu Tests")
public class HpTest extends BaseTest {


    @Test(priority = 0, description = "Open pages from Left Menu", dataProvider = "UnauthorizedLeftMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Left Menu")
    @Story("User open Home Page and click button from Left Menu")
    public void verifyLeftMenuLink(By LeftMenuBtn, String LeftMenuURL) {
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
             {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")}
        };
    }

    @Test(priority = 0, description = "Open pages from Top Menu", dataProvider = "UnauthorizedTopMenu")
    @Severity(SeverityLevel.NORMAL)
    @Description("Open pages from Top Menu")
    @Story("User open Home Page and click button from TOP Menu")
    public void verifyTopMenuLink(By TopMenuBtn, String TopMenuURL){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(TopMenuBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), TopMenuURL);
    }

    @DataProvider(name = "UnauthorizedTopMenu")
    public static Object[][] TopMenuData(){
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

   @Test(priority = 0, description = "Verify Admin user login")
   @Severity(SeverityLevel.CRITICAL)
   @Description("Login User Admin")
   @Story("Successful login with valid phone number and password")
    public void authorization(){
       HomePage homePage = new HomePage(driver);
       homePage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
    }
    //     TODO write registration with different access levels for test Left Menu and TOP Menu by Users with different access level
}


