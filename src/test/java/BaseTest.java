import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    public WebDriver driver;
    static String baseURL = "http://shorinji-kempo.org.ua";


    @BeforeMethod

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }


   @AfterMethod
    public void teardown(){
       driver.quit();
    }
}
