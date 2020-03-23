package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    public WebDriver driver;
    static String baseURL = "https://shorinji-kempo.org.ua";


    @BeforeMethod

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    public WebDriver getDriver() {
        return driver;
    }


   @AfterMethod
    public void teardown(){
       driver.quit();
    }

    //Open Home Page//
    public BaseTest goToSK() {
        driver.get(baseURL);
        return this;
    }
}
