import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HpTest extends BaseTest {

  // HomePage homePage = new HomePage(driver);

    @Test (description = "Open pages from Left Menu", dataProvider = "UnautorizedLeftMenu")
    public void verifyHistoryLink(By HistoryBtn, String HistoryURL) {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(HistoryBtn);
        homePage.AssertEqualURLs(driver.getCurrentUrl(), HistoryURL);
    }

    @DataProvider(name = "UnautorizedLeftMenu")
    public static Object[][] leftMenuData() {
        return new Object[][]{
        {HomePage.getBtnHashMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")}
          //{HomePage.getBtnHashMap().get("HistoryBtn"), HomePage.getURLsMap().get("HistoryURL")},
         // {hpBtnsMap.get("ShorinjiKempoBtn"), hpBtnsMap.get("ShorinjiKempoURL")},
        };
    }


  //  @Test
    //public void verifyShorinjiLink(){
      //  HomePage homePage = new HomePage(driver);
        //homePage.clickElement(homePage.getLeftMenuBtn(0));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(1));
   // }


   // @Test
   // public void verifyProgrammLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(2));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(3));
   // }

   // @Test
   // public void verifyScheduleLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(3));
      //  homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(4));
   // }

   // @Test
   // public void verifyMeditationLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(4));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(5));
   // }

   // @Test
   // public void verifyOurTeachersLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(6));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(6));
   // }

   // @Test
   // public void verifyTalesLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(6));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(7));
   // }

   // @Test
   // public void verifyImpressionsLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(7));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(8));
    //}

   // @Test
   // public void verifyQuestionsAndAnswersLink(){
     //   HomePage homePage = new HomePage(driver);
       // homePage.clickElement(homePage.getLeftMenuBtn(8));
       // homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(9));
   // }


    //Negative cases//



    }


