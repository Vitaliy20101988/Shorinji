import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    public WebDriver driver;
    static String url_Setup = "http://shorinji-kempo.org.ua";


    @BeforeMethod

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url_Setup);
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
