import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void registration(){
        RegistrationPage registrationPage = new RegistrationPage();
        HomePage homePage = new HomePage(driver);
        homePage.clickElement(homePage.getBtnMap().get("RegistrationBTN"));
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("LoginField"), UserData.getUserNames()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("EmailField"), UserData.getEmailNames()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("NameOfBranchField"), UserData.getBranchNames()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("KenshiNumberField"), UserData.getKenshiNumber()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserLoginField"), UserData.getLoginNames()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserPassField"), UserData.getPasswords()[0]);
        registrationPage.sendKeys(registrationPage.getRegistrationFields().get("UserVerifyPassField"), UserData.getPasswords()[0]);
        registrationPage.clickElement(registrationPage.getBTNsRegistration().get("AccessRegBTN"));
        driver.get("http://shorinji-kempo.org.ua/administrator");
        driver.findElement(By.id("mod-login-username")).sendKeys("Виталик");
        driver.findElement(By.id("mod-login-password")).sendKeys("20101988");
        driver.findElement(By.cssSelector(".btn-block.btn-large")).click();
        driver.findElement(By.linkText("Менеджер пользователей")).click();
        driver.findElement(By.id("filter_search")).sendKeys("zayath88@gmail.com");
        driver.findElement(By.cssSelector(".btn.hasTooltip")).click();
        driver.findElement(By.linkText("Epancha Vitaliy")).click();
//        driver.findElement(By.cssSelector("#userList tbody:first-child .name a")).click();
        driver.findElement(By.xpath("//fieldset[@id='jform_block']/label[2]")).click();
        driver.findElement(By.linkText("Назначенные группы пользователей")).click();
        driver.findElement(By.id("1group_9")).click();
        driver.findElement(By.xpath("//div[@id='toolbar-save']/button")).click();
        driver.findElement(By.linkText("Community Builder")).click();
        driver.findElement(By.cssSelector(".menu-cb-user_management")).click();
        driver.findElement(By.id("cbusersbrowsersearch")).sendKeys("zayath88@gmail.com");
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
//        driver.findElement(By.linkText("Epancha Vitaliy")).click();
        driver.findElement(By.xpath("//td[13]/a/span")).click();
        driver.get("http://shorinji-kempo.org.ua");
        driver.findElement(By.id("modlgn-username")).sendKeys("Vitalik");
        driver.findElement(By.id("modlgn-passwd")).sendKeys("6179c5cef8");
        driver.findElement(By.name("Submit")).click();


     //   Assert.assertTrue(driver.findElements(By.linkText("Приветствуем Вас, Vitalik")).size() != 0);
    }
}
