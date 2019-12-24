import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HpTest extends BaseTest {


    @Test(description = "Open pages from Left Menu", dataProvider = "UnautorizedLeftMenu")
    public void verifyHistoryLink(By HistoryBtn, String HistoryURL) {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(HistoryBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), HistoryURL);
    }

    @DataProvider(name = "UnautorizedLeftMenu")
    public static Object[][] leftMenuData() {
        return new Object[][]{

             {HomePage.getBtnMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
             {HomePage.getBtnMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
             {HomePage.getBtnMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
             {HomePage.getBtnMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
             {HomePage.getBtnMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
             {HomePage.getBtnMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
             {HomePage.getBtnMap().get("ImpressonsBtn"), HomePage.getURLsMap().get("ImpressonsOURL")},
             {HomePage.getBtnMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")}
        };
    }


    //Negative cases//


}


