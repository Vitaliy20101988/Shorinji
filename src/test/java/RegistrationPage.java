import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;
import static java.util.Map.*;


public class RegistrationPage extends BasePage {

    private String adminURL = "https://shorinji-kempo.org.ua/administrator";

    public RegistrationPage(WebDriver driver){
        super (driver, 10);
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
      entry("CheckBoxBTN", By.id("cbusersbrowserid0"))

    );
    public static Map<String, By> getAdminSelectors() {return adminSelectors;}



    //  Open Admin Page//
    public RegistrationPage goToAdmin (){
        driver.get(adminURL);
        sendKeys(getAdminSelectors().get("LoginField"), UserData.VitLogin.getValue());
        sendKeys(getAdminSelectors().get("PassField"), UserData.VitPass.getValue());
        clickElement(getAdminSelectors().get("AccessLoginBTN"));
        return this;
    }

    public RegistrationPage findUserInUserAdminPage(String value){
        clickElement(getAdminSelectors().get("CommunityBuilder"));
        clickElement(getAdminSelectors().get("UserManager"));
        sendKeys(getAdminSelectors().get("SearchField"), value);
        clickElement(getAdminSelectors().get("SearchBTN"));
        return this;
    }

    public RegistrationPage acceptReg(By elementBy){
        clickElement(elementBy);
        select(By.id("block"), "0");
        select(By.id("approved"), "1");
        clickElement(getAdminSelectors().get("SaveAndCloseBTN"));
        return this;
    }

    public RegistrationPage deleteUser(String value){
        clickElement(getAdminSelectors().get("CommunityBuilder"));
        clickElement(getAdminSelectors().get("UserManager"));
        sendKeys(getAdminSelectors().get("SearchField"), value);
        clickElement(getAdminSelectors().get("SearchBTN"));
        clickElement(getAdminSelectors().get("CheckBoxBTN"));
        return this;
    }
}





