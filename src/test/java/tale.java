import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class tale {

    Selectors selectors = new Selectors();
    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_tales = "http://shorinji-kempo.org.ua/index.php/rasskazy-uchiteley";


    @Test

    public void Tale(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);


        WebElement talesBtn = driver.findElement(By.linkText(selectors.getTalesBtnSelector()));
        talesBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_tales);

    }
}
