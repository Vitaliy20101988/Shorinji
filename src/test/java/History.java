import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class History {

    Selectors selectors = new Selectors();
    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_History = "http://shorinji-kempo.org.ua/index.php/historysk";

    @Test

    public void History(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);


        WebElement skHistoryBtn = driver.findElement(By.cssSelector(selectors.getSK_HistoryBtnSelector()));
        skHistoryBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_History);
    }
}
