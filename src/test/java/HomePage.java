import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;
import static java.util.Map.*;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver){
        super (driver, 10);
    }


   public static Map<String, String> URLsMap = Map.ofEntries (
           entry("baseUrl", "http://shorinji-kempo.org.ua"),
           entry("ShorinjiKempoURL", "http://shorinji-kempo.org.ua/index.php/shorinjikempo"),
           entry("HistoryURL", "http://shorinji-kempo.org.ua/index.php/historysk"),
           entry("LearningProgrammURL", "http://shorinji-kempo.org.ua/index.php/uchebnaya-programma"),
           entry("ScheduleOfTrainingsURL", "http://shorinji-kempo.org.ua/index.php/raspisanie-trenirovok"),
           entry("MeditationURL", "http://shorinji-kempo.org.ua/index.php/meditation"),
           entry("OurTeachersURL", "http://shorinji-kempo.org.ua/index.php/nashiuchitelya"),
           entry("TeachersTalesURL", "http://shorinji-kempo.org.ua/index.php/rasskazy-uchiteley"),
           entry("ImpressionsURL", "http://shorinji-kempo.org.ua/index.php/vpechatleniya"),
           entry("QuestionsAndAnswersURL", "http://shorinji-kempo.org.ua/index.php/faq"),
           entry("TechnikURL", "http://shorinji-kempo.org.ua/index.php/tehnika"),
           entry("FilosofiyaKaisoURL", "http://shorinji-kempo.org.ua/index.php/filosofiyakaiso"),
           entry("VerouchenieKongoZenURL", "http://shorinji-kempo.org.ua/index.php/verouchenie-kongozen"),
           entry("BuddizmURL", "http://shorinji-kempo.org.ua/index.php/buddhism"),
           entry("HappyoURL", "http://shorinji-kempo.org.ua/index.php/happyo"),
           entry("ShopURL", "http://shorinji-kempo.org.ua/index.php/shopsk"),
           entry("PaymentsURL", "http://shorinji-kempo.org.ua/index.php/list-of-fees"),
           entry("MainURL", "http://shorinji-kempo.org.ua/index.php"),
           entry("NewsURL", "http://shorinji-kempo.org.ua/index.php/news"),
           entry("FederationURL", "http://shorinji-kempo.org.ua/index.php/federaciya"),
           entry("BranchesURL", "http://shorinji-kempo.org.ua/index.php/branches"),
           entry("CalendarURL", "http://shorinji-kempo.org.ua/index.php/calendar"),
           entry("CharterURL", "http://shorinji-kempo.org.ua/index.php/statutes"),
           entry("LinksURL", "http://shorinji-kempo.org.ua/index.php/links")
   );

         public static Map<String, String> getURLsMap() {
             return URLsMap;
        }


        public static Map<String, By> BTNsMap = Map.ofEntries (
                entry("ShorinjiKempoBtn", By.cssSelector(".item-25 > a")),
                entry("HistoryBtn", By.cssSelector(".item-29 > a")),
                entry("LearningProgrammBtn", By.linkText("Учебная программа")),
                entry("ScheduleOfTrainingsBtn", By.linkText("Расписание")),
                entry("MeditationBtn", By.linkText("Медитация")),
                entry("OurTeachersBtn", By.linkText("Наши Учителя")),
                entry("TeachersTalesBtn", By.linkText("Рассказы Учителей")),
                entry("ImpressionsBtn", By.cssSelector(".item-35 > a")),
                entry("QuestionsAndAnswersBtn", By.linkText("Вопросы и Ответы")),
                entry("TechnikaBtn", By.linkText("Техника")),
                entry("FilosofiyaKaisoBtn", By.linkText("Философия Кайсо")),
                entry("KongoZenBtn", By.linkText("Конго Дзэн")),
                entry("BuddizmBtn", By.linkText("Буддизм")),
                entry("HappyoBtn", By.linkText("Хаппё")),
                entry("ShopBtn", By.linkText("Магазин")),
                entry("PaymentsBtn", By.linkText("Перечень платежей")),
                entry("MainBtn", By.cssSelector(".item-41 > a")),
                entry("NewsBtn", By.cssSelector(".item-18 > a")),
                entry("FederationBtn", By.cssSelector(".item-2 > a")),
                entry("BranchesBtn", By.cssSelector(".item-229 > a")),
                entry("CalendarBtn", By.cssSelector(".item-22 > a")),
                entry("CharterBtn", By.cssSelector(".item-23 > a")),
                entry("LinksBtn", By.cssSelector(".item-24 > a")),
                entry("EnterBtn", By.name("Submit"))
    );

         public static Map<String, By> getBtnMap() {
                 return BTNsMap;
             }

          private By LoginField = By.id("modlgn-username");
          private By PassField = By.id("modlgn-passwd");

           public By getLoginField(){
             return LoginField;
         }
           public By getPassField(){
               return PassField;
           }





}



