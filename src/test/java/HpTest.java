import org.testng.annotations.Test;

public class HpTest extends BaseTest {

    @Test
    public void verifyHistoryLink() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyHistoryLink();
    }


    @Test
    public void verifyShorinjiLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyShorinjiLink();
    }


    @Test
    public void verifyProgrammLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyProgrammLink();
    }

    @Test
    public void verifyScheduleLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifySceduleLink();
    }

    @Test
    public void verifyMeditationLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyMeditationLink();
    }

    @Test
    public void verifyOurTeachersLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyOurTeachersLink();
    }

    @Test
    public void verifyTalesLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyTalesLink();
    }

    @Test
    public void verifyImpressionsLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyImpressionsLink();
    }

    @Test
    public void verifyQuestionsAndAnswersLink(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyQuestionsAndAnswersLink();
    }

}
