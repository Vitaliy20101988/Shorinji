import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage{

    public WebDriver driver;{
        this.driver = driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    //Click Method
    public void click (By elementBy) {
        driver.findElement(elementBy).click();
    }



    //Assert//
    //public void assertEquals () {
    //Assert.assertEquals(readText(elementBy), expectedText);
}
