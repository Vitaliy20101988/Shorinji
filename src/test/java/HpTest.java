import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HpTest extends BaseTest {


    @Test (description = "Open pages from Left Menu", dataProvider = "leftMenu")
    public void verifyHistoryLink(By history, String historyURL) {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(history);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), historyURL);
    }

    @DataProvider(name = "leftMenu")
    public Object[][] leftMenuData()   {
        HomePage homePage = new HomePage(driver);
        return new Object[][]{
          {homePage.getLeftMenuBtn(0), homePage.getHomePageURL(1)}
        };
    }


    @Test
    public void verifyShorinjiLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(0));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(1));
    }


    @Test
    public void verifyProgrammLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(2));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(3));
    }

    @Test
    public void verifyScheduleLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(3));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(4));
    }

    @Test
    public void verifyMeditationLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(4));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(5));
    }

    @Test
    public void verifyOurTeachersLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(6));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(6));
    }

    @Test
    public void verifyTalesLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(6));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(7));
    }

    @Test
    public void verifyImpressionsLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(7));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(8));
    }

    @Test
    public void verifyQuestionsAndAnswersLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(8));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(9));
    }


    //Negative cases//



    }


