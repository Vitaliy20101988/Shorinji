import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    private String baseURL = "https://shorinji-kempo.org.ua";


    public BasePage(WebDriver driver, int waitTime) {
        this.driver = driver;
        wait = new WebDriverWait(driver, waitTime);

    }

    public BasePage() {
    }


    //Open Home Page//
    public BasePage goToSK() {
        driver.get(baseURL);
        return this;
    }

    //Click Method
    public void clickElement(By elementBy) {
        driver.findElement(elementBy).click();
    }

    //Send Keys
    public void sendKeys(By elementBy, String value) {
        driver.findElement(elementBy).sendKeys(value);
    }

    //Assert//
    public void AssertEqualURLs(String currentUrl, String expectedURL) {
        Assert.assertEquals(currentUrl, expectedURL);
    }

    public void assertTextContains(By elementBy, String textPart) {
        String text = readText(elementBy);
        assert text.contains(textPart);
    }

    public String readText(By elementBy) {
        return driver.findElement(elementBy).getText();
    }


    public void select(By elementBy, String value) {
        Select select = new Select(driver.findElement(elementBy));
        select.selectByValue(value); }
}
