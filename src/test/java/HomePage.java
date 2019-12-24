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
           entry("ImpressonsURL", "http://shorinji-kempo.org.ua/index.php/vpechatleniya"),
           entry("QuestionsAndAnswersURL", "http://shorinji-kempo.org.ua/index.php/faq"),
           entry("TechnikURL", "http://shorinji-kempo.org.ua/index.php/tehnika"),
           entry("FilosofiyaKaisoURL", "http://shorinji-kempo.org.ua/index.php/filosofiyakaiso"),
           entry("VerouchenieKongoZenURL", "http://shorinji-kempo.org.ua/index.php/verouchenie-kongozen"),
           entry("BuddizmURL", "http://shorinji-kempo.org.ua/index.php/buddhism"),
           entry("HappyoURL", "http://shorinji-kempo.org.ua/index.php/happyo"),
           entry("ShopURL", "http://shorinji-kempo.org.ua/index.php/shopsk"),
           entry("PaymentsURL", "http://shorinji-kempo.org.ua/index.php/list-of-fees")
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
                entry("ImpressonsBtn", By.linkText("Впечатления о...")),
                entry("QuestionsAndAnswersBtn", By.linkText("Вопросы и Ответы")),
                entry("TechnikaBtn", By.linkText("Техника")),
                entry("FilosofiyaKaisoBtn", By.linkText("Философия Кайсо")),
                entry("KongoZenBtn", By.linkText("Конго Дзэн")),
                entry("BuddizmBtn", By.linkText("Буддизм")),
                entry("HappyoBtn", By.linkText("Хаппё")),
                entry("ShopBtn", By.linkText("Магазин")),
                entry("PaymentsBtn", By.linkText("Перечень платежей"))
    );


             public static Map<String, By> getBtnMap() {
                 return BTNsMap;
             }
}



