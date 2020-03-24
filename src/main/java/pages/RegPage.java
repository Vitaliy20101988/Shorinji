package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parametrs.UserData;

import java.util.*;
import static java.util.Map.*;


public class RegPage extends AuthRegModule {

    private String adminURL = "https://shorinji-kempo.org.ua/administrator";

    public RegPage(WebDriver driver){
        super (driver);
    }



    public static Map<String, By> BTNsRegistration = Map.ofEntries(
            entry("AccessRegBTN", By.cssSelector(".cbRegistrationSubmit"))
    );
    public static Map<String, By> getBTNsRegistration(){ return BTNsRegistration;}



    public static Map<String, By> registrationFields = Map.ofEntries(
            entry("LoginField", By.id("name")),
            entry("EmailField", By.id("email")),
            entry("NameOfBranchField", By.id("cb_filial")),
            entry("KenshiNumberField", By.id("cb_kenshi")),
            entry("UserLoginField", By.id("username")),
            entry("UserPassField", By.id("password")),
            entry("UserVerifyPassField", By.id("password__verify"))
    );
    public static Map<String, By> getRegistrationFields() {return registrationFields;}


   public static Map<String, By> adminSelectors = Map.ofEntries(
      entry("LoginField", By.id("mod-login-username")),
      entry("PassField", By.id("mod-login-password")),
      entry("AccessLoginBTN", By.cssSelector(".btn-block.btn-large")),
      entry("CommunityBuilder", By.linkText("Community Builder")),
      entry("UserManager", By.cssSelector(".menu-cb-user_management")),
      entry("SearchField", By.id("cbusersbrowsersearch")),
      entry("SearchBTN", By.cssSelector(".btn-light.border")),
      entry("BlockBTN", By.id("block")),
      entry("ApprovedBTN", By.id("approved")),
      entry("NameBTN", By.linkText("Epancha Vitaliy")),
      entry("SaveAndCloseBTN", By.cssSelector("#toolbar-save > .btn")),
      entry("CheckBoxBTN", By.id("cbusersbrowserid0")),
      entry("DeleteBTN", By.xpath("//div[@id='toolbar-delete']/button"))

    );
    public static Map<String, By> getAdminSelectors() {return adminSelectors;}



    //  Open Admin Page//

    public RegPage goToAdmin (){
        driver.get(adminURL);
        return this;}

    @Step("write registration form")
    public RegPage fillRegForm(String userName, String email, String branchName, String kenshiNum, String login, String pass){
        sendKeys(getRegistrationFields().get("LoginField"), userName);
        sendKeys(getRegistrationFields().get("EmailField"), email);
        sendKeys(getRegistrationFields().get("NameOfBranchField"), branchName);
        sendKeys(getRegistrationFields().get("KenshiNumberField"), kenshiNum);
        sendKeys(getRegistrationFields().get("UserLoginField"), login);
        sendKeys(getRegistrationFields().get("UserPassField"), pass);
        sendKeys(getRegistrationFields().get("UserVerifyPassField"), pass);
        clickElement(getBTNsRegistration().get("AccessRegBTN"));
        return this;
    }


    public RegPage AuthAdmin (){
        goToAdmin();
        sendKeys(getAdminSelectors().get("LoginField"), UserData.LOGIN_ADMIN.getValue());
        sendKeys(getAdminSelectors().get("PassField"), UserData.PASS_ADMIN.getValue());
        clickElement(getAdminSelectors().get("AccessLoginBTN"));
        return this;
    }

    public RegPage findUserInUserAdminPage(String value){
        clickElement(getAdminSelectors().get("CommunityBuilder"));
        clickElement(getAdminSelectors().get("UserManager"));
        clearField(getAdminSelectors().get("SearchField"));
        sendKeys(getAdminSelectors().get("SearchField"), value);
        clickElement(getAdminSelectors().get("SearchBTN"));
        return this;
    }

    public RegPage confirmReg(By elementBy){
        clickElement(elementBy);
        select(By.id("block"), "0");
        select(By.id("approved"), "1");
        clickElement(getAdminSelectors().get("SaveAndCloseBTN"));
        return this;
    }

    public RegPage deleteUser(){
        clickElement(getAdminSelectors().get("CheckBoxBTN"));
        clickElement(getAdminSelectors().get("DeleteBTN"));
        AllertAccept();
        return this;
    }
}





