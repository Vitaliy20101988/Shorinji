import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class Programm {

    Selectors selectors = new Selectors();
    static String EnterSite = "http://shorinji-kempo.org.ua";
    static String url_Programm = "http://shorinji-kempo.org.ua/index.php/uchebnaya-programma";

    @Test

    public void Programm() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EnterSite);


        WebElement programmBtn = driver.findElement(By.linkText(selectors.getProgrammBtnSelector()));
        programmBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_Programm);
    }

}
