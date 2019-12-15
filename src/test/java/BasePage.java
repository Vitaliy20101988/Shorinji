import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.IAssert;

public class BasePage{

    public WebDriver driver;
    public WebDriverWait wait;
    private String baseURL = "http://shorinji-kempo.org.ua";



    public BasePage(WebDriver driver, int waitTime) {
        this.driver = driver;
        wait = new WebDriverWait(driver, waitTime);

    }

    //Open Home Page//
    public BasePage goToSK (){
        driver.get(baseURL);
        return this;
    }



    //Click Method
    public void clickElement (By elementBy) {
        driver.findElement(elementBy).click();
    }


    //Assert//
    public void AssertEqualURLs(String currentUrl, String expectedURL) {
        Assert.assertEquals(currentUrl, expectedURL);
    }

    public void AssertNotEqualURLs(String currentUrl, String expectedURL) {
        Assert.assertNotEquals(currentUrl, expectedURL);
        }

}