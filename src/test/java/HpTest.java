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
                {HomePage.getBtnHashMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
                {HomePage.getBtnHashMap().get("LearningProgrammBtn"), HomePage.getURLsMap().get("LearningProgrammURL")},
                {HomePage.getBtnHashMap().get("ScheduleOfTrainingsBtn"), HomePage.getURLsMap().get("ScheduleOfTrainingsURL")},
                {HomePage.getBtnHashMap().get("MeditationBtn"), HomePage.getURLsMap().get("MeditationURL")},
                {HomePage.getBtnHashMap().get("OurTeachersBtn"), HomePage.getURLsMap().get("OurTeachersURL")},
                {HomePage.getBtnHashMap().get("TeachersTalesBtn"), HomePage.getURLsMap().get("TeachersTalesURL")},
                {HomePage.getBtnHashMap().get("ImpressonsBtn"), HomePage.getURLsMap().get("ImpressonsOURL")},
                {HomePage.getBtnHashMap().get("QuestionsAndAnswersBtn"), HomePage.getURLsMap().get("QuestionsAndAnswersURL")}
        };
    }


    //Negative cases//


}


