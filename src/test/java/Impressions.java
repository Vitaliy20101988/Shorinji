import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selectors.Selectors;

public class Impressions extends BaseTest {


    Selectors selectors = new Selectors();
    static String url_tales = "http://shorinji-kempo.org.ua/index.php/vpechatleniya";


    @Test

    public void Impressions() {
        HomePage HomePage = new HomePage(driver);


        WebElement ImpressionsBtn = driver.findElement(By.linkText(selectors.getImpressionBtnSelector()));
        ImpressionsBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), url_tales);

    }
}
