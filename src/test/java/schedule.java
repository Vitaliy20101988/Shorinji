import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class schedule {

    Selectors selectors = new Selectors();
    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_schedule = "http://shorinji-kempo.org.ua/index.php/raspisanie-trenirovok";

    @Test

    public void Schedule() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);

        WebElement scheduleBtn = driver.findElement(By.linkText(selectors.getScheduleBtnSelector()));
        scheduleBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_schedule);
    }

}
