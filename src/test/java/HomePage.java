
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

public HomePage(WebDriver driver){
    super (driver);
}

String baseURL = "http://shorinji-kempo.org.ua";


  public HomePage goTo() {
      driver.get(baseURL);
      return this;
  }

}
