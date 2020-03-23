package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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

    public String getDomain(){return baseURL;}


    //Open Home Page//
    public BasePage goToSK() {
        getDomain ();
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


        public void AllertAccept() { driver.switchTo().alert().accept(); }


        public void clearField(By elementBy){
        driver.findElement(elementBy).clear();
        }

       public boolean ElementPresent (By elementBy) {
        try {
            driver.findElement(elementBy);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    }



