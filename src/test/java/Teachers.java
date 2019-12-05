import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class Teachers {

    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_teachers = "http://shorinji-kempo.org.ua/index.php/nashiuchitelya";
    Selectors selectors = new Selectors();


    @Test

    public void Meditation() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);

        WebElement teachersBtn = driver.findElement(By.linkText(selectors.getTeachersBtnSelector()));
        teachersBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_teachers);
    }
}
