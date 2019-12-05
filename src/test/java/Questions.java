import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selectors.Selectors;

public class Questions {

    Selectors selectors = new Selectors();
    static String Enter_Page = "http://shorinji-kempo.org.ua";
    static String url_Questions = "http://shorinji-kempo.org.ua/index.php/faq";


    @Test

    public void Questions() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Enter_Page);

        WebElement QuestionBtn = driver.findElement(By.linkText(selectors.getQuestionsBntSelectors()));
        QuestionBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_Questions);
    }
}
