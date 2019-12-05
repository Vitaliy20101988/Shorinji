import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class Meditation {

    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_Meditation = "http://shorinji-kempo.org.ua/index.php/meditation";
    Selectors selectors = new Selectors();


    @Test

    public void Meditation() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);

        WebElement meditationBtn = driver.findElement(By.linkText(selectors.getMeditationBtnSelector()));
        meditationBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_Meditation);
    }
}
