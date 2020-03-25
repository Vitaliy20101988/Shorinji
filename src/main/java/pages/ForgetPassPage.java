package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class ForgetPassPage extends AuthPage {

    public ForgetPassPage(WebDriver driver){
        super (driver);
    }

    private static Map<String, By> BTNsMap = Map.ofEntries(
            Map.entry("ForgetNameBTN", By.id("reminderUsername")),
            Map.entry("ForgetPassBTN", By.id("reminderPassword")),
            Map.entry("SendBTN", By.cssSelector(".btn.cbLostPassSend"))
    );

    public static Map<String, By> getBTNsMap() {
        return BTNsMap;
    }

    private By sendField = By.id("checkemail");

    public By getSendField() {
        return sendField;
    }

    public ForgetPassPage selectCheckbox(String elementBy){
        clickElement(getBTNsMap().get(elementBy));
        return this;
    }

    public ForgetPassPage fillForgeForm(By elementBy, String value){
        sendKeys(elementBy, value);
        return  this;
    }

    public ForgetPassPage clickSendBTN(){
        clickElement(getBTNsMap().get("SendBTN"));
        return this;
    }

    public boolean assertVerifyText(String textPart){
        assertTextContains(By.cssSelector("#lostusernamedesc > div"), textPart);
        return true;
    }
}
