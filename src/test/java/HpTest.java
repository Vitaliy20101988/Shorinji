import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HpTest extends BaseTest {


    @Test(description = "Open pages from Left Menu", dataProvider = "UnauthorizedLeftMenu")
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

    @Test(description = "Open pages from Top Menu", dataProvider = "UnauthorizedTopMenu")
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

    @Test
    public void authorization(){
       HomePage homePage = new HomePage(driver);
       homePage.sendKeys(homePage.getLoginField(), UserData.getName());
       homePage.sendKeys(homePage.getPassField(), UserData.getPassword());
       homePage.clickElement(homePage.getBtnMap().get("EnterBtn"));
       
    }






}


