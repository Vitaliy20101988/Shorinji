import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import selectors.Selectors;

import static java.lang.Thread.sleep;

public class SKpage1 {

    static String loginYepancha = "Виталик";
    static String passWord = "20101988";
    static String loginToSk = "http://shorinji-kempo.org.ua/";
    static String RegistrationName = "Vitaliy";
    static String RegistrationEmail = "zayath88@gmail.com";
    static String RegistrationBranchName = "Kita Odessa";
    static String RegistrationKenshiNumber = "850123549";
    static String RegistrationLogin = "Red Dragon";
    static String RegistrationPassword = "6179c5cef8";
    Selectors selectors = new Selectors();



    @Test
    public void SKpage1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginToSk);

       // WebElement username = driver.findElement(By.name(selectors.getLoginFieldSelector()));
        //username.clear();
        //username.sendKeys(loginYepancha);

        //WebElement password = driver.findElement(By.name(selectors.getPasswordFieldSelector()));
       // password.clear();
        //password.sendKeys(passWord);

        //WebElement Enter = driver.findElement(By.name(selectors.getLoginBtnSelector()));
        //Enter.click();

       //WebElement exit = driver.findElement(By.name(selectors.getExitBtnSelector()));
       //exit.click();

       //Registration


        WebElement registration = driver.findElement(By.id(selectors.getRegistrationBtnSelector()));
        registration.click();

       WebElement Name = driver.findElement(By.id(selectors.getRegistrationNameSelector()));
       Name.sendKeys(RegistrationName);

       WebElement email = driver.findElement(By.id(selectors.getRegistrationEmailSelector()));
       email.sendKeys(RegistrationEmail);

       WebElement branchName = driver.findElement(By.id(selectors.getRegistrationBranchNameSelector()));
       branchName.sendKeys(RegistrationBranchName);

       WebElement kenshiNumber = driver.findElement(By.id(selectors.getRegistrationKenshiNumberSelector()));
       kenshiNumber.sendKeys(RegistrationKenshiNumber);

       WebElement loginName = driver.findElement(By.id(selectors.getRegistrationLoginSelector()));
       loginName.sendKeys(RegistrationLogin);

       WebElement RegPassword = driver.findElement(By.id(selectors.getRegistrationPasswordSelector()));
       RegPassword.sendKeys(RegistrationPassword);

       WebElement ReternPassword = driver.findElement(By.id(selectors.getRegistrationReternPasswordSelector()));
       ReternPassword.sendKeys(RegistrationPassword);

     WebElement registrationBtn = driver.findElement(By.cssSelector(selectors.getRegistrationToSKBtnSelector()));
     registrationBtn.click();
    }
}
