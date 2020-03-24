package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static java.util.Map.entry;

public class AuthPage extends AuthRegModule {

    public AuthPage(WebDriver driver){
        super (driver);
    }

    private static Map<String, By> AuthBTNMap = Map.ofEntries(
            entry("EnterBtn", By.name("Submit")),
            entry("Privet", By.cssSelector(".login-greeting.cb_template.cb_template_default"))
    );

    public static Map<String, By> getAuthBTN() {
        return AuthBTNMap;
    }

    private By LoginField = By.id("modlgn-username");
    private By PassField = By.id("modlgn-passwd");

    public By getLoginField(){
        return LoginField;
    }
    public By getPassField(){
        return PassField;
    }


    public AuthPage autorization(String login, String pass){
        sendKeys(getLoginField(), login);
        sendKeys(getPassField(), pass);
        clickElement(getAuthBTN().get("EnterBtn"));
        return this;
    }


    public AuthPage assertAutoriz(String loginName){
        assertTextContains(getAuthBTN().get("Privet"), "Приветствуем Вас, " + loginName);
        return this;
    }




}
