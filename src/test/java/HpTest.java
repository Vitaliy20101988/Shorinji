import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HpTest extends BaseTest {


    @Test
    public void verifyHistoryLink() {
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(1));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(2));
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
        homePage.clickElement(homePage.getLeftMenuBtn(7));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(7));
    }

    @Test
    public void verifyImpressionsLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(8));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(8));
    }

    @Test
    public void verifyQuestionsAndAnswersLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getLeftMenuBtn(9));
        homePage.AssertEqualURLs(driver.getCurrentUrl(), homePage.getHomePageURL(9));
    }


    //Negative cases//

    @Test
    public void elementIsNotClickeble(By leftMenuBtn){
        HomePage homePage = new HomePage(driver);
        boolean displayed = driver.findElement(homePage.getLeftMenuBtn(1)).isDisplayed();
        boolean enabled = driver.findElement(homePage.getLeftMenuBtn(1)).isEnabled();
       if (!displayed & !enabled) {
           assert true;
        }
       else assert false;
    }

}
