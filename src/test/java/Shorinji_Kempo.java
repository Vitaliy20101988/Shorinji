import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selectors.Selectors;

public class Shorinji_Kempo {

    Selectors selectors = new Selectors();
    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_Shorinji_Kempo = "http://shorinji-kempo.org.ua/index.php/shorinjikempo";


    @Test

    public void SKpage1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);

        WebElement Shorinji_KempoBtn = driver.findElement(By.cssSelector(selectors.getShorinji_KempoBtnSelector()));
        Shorinji_KempoBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_Shorinji_Kempo);
    }
}