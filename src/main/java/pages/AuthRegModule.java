package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Map;
import static java.util.Map.entry;

public class AuthRegModule extends BasePage {

    public AuthRegModule(WebDriver driver) {
        super(driver, 10);
    }

    private static Map<String, By> BTNsMap = Map.ofEntries(
            entry("RegisterBTN", By.id("form-login-register")),
            entry("ForgetPasswordBTN", By.id("form-login-forgot"))
    );

    private static Map<String, String> URLsMap = Map.ofEntries(
            entry("LoginURL", "https://shorinji-kempo.org.ua/cb-login")
    );

    public static Map<String, String> getURLsMap() {
        return URLsMap;
    }

    public static Map<String, By> getBTNsMap() {
        return BTNsMap;
    }

    @Step("open register page")
    public void openRegPage (){
        clickElement(getBTNsMap().get("RegistrationBTN"));
    }
}
