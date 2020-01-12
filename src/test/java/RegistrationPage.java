import org.openqa.selenium.By;
import java.util.*;
import static java.util.Map.*;


public class RegistrationPage extends BasePage {

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
//      entry("")
    );





}
