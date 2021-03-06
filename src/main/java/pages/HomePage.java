package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;
import static java.util.Map.*;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver){
        super (driver, 10);
    }


   private static Map<String, String> URLsMap = Map.ofEntries (

           entry("ShorinjiKempoURL", "https://shorinji-kempo.org.ua/shorinjikempo"),
           entry("HistoryURL", "https://shorinji-kempo.org.ua/historysk"),
           entry("LearningProgrammURL", "https://shorinji-kempo.org.ua/uchebnaya-programma"),
           entry("ScheduleOfTrainingsURL", "https://shorinji-kempo.org.ua/raspisanie-trenirovok"),
           entry("MeditationURL", "https://shorinji-kempo.org.ua/meditation"),
           entry("OurTeachersURL", "https://shorinji-kempo.org.ua/nashiuchitelya"),
           entry("TeachersTalesURL", "https://shorinji-kempo.org.ua/rasskazy-uchiteley"),
           entry("ImpressionsURL", "https://shorinji-kempo.org.ua/vpechatleniya"),
           entry("QuestionsAndAnswersURL", "https://shorinji-kempo.org.ua/faq"),
           entry("TechnikURL", "https://shorinji-kempo.org.ua/tehnika"),
           entry("FilosofiyaKaisoURL", "https://shorinji-kempo.org.ua/filosofiyakaiso"),
           entry("VerouchenieKongoZenURL", "https://shorinji-kempo.org.ua/verouchenie-kongozen"),
           entry("BuddizmURL", "https://shorinji-kempo.org.ua/buddhism"),
           entry("HappyoURL", "https://shorinji-kempo.org.ua/happyo"),
           entry("ShopURL", "https://shorinji-kempo.org.ua/shopsk"),
           entry("PaymentsURL", "https://shorinji-kempo.org.ua/list-of-fees"),
           entry("LibaryForKenshiURL", "https://shorinji-kempo.org.ua/books-for-kenshi"),
           entry("LibraryForMonshintoURL", "https://shorinji-kempo.org.ua/books-for-monshinto"),
           entry("MainURL", "https://shorinji-kempo.org.ua/"),
           entry("NewsURL", "https://shorinji-kempo.org.ua/news"),
           entry("FederationURL", "https://shorinji-kempo.org.ua/federaciya"),
           entry("BranchesURL", "https://shorinji-kempo.org.ua/branches"),
           entry("CalendarURL", "https://shorinji-kempo.org.ua/calendar"),
           entry("CharterURL", "https://shorinji-kempo.org.ua/statutes"),
           entry("LinksURL", "https://shorinji-kempo.org.ua/links"),
           entry("DocumentsURL", "https://shorinji-kempo.org.ua/documets")
   );

         public static Map<String, String> getURLsMap() {
             return URLsMap;
        }


        private static Map<String, By> BTNsMap = Map.ofEntries (
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
                entry("LibaryForKenshiBtn", By.xpath("//*[@id=\"left_s\"]/div[2]/div/ul/li[1]/a")),
                entry("LibraryForMonshintoBtn", By.linkText("Для Монсинто")),
                entry("MainBtn", By.cssSelector(".item-41 > a")),
                entry("NewsBtn", By.cssSelector(".item-18 > a")),
                entry("FederationBtn", By.cssSelector(".item-2 > a")),
                entry("BranchesBtn", By.cssSelector(".item-229 > a")),
                entry("CalendarBtn", By.cssSelector(".item-22 > a")),
                entry("CharterBtn", By.cssSelector(".item-23 > a")),
                entry("LinksBtn", By.cssSelector(".item-24 > a")),
                entry("DocumentsBtn", By.cssSelector(".item-157 > a"))
    );

         public static Map<String, By> getBtnMap() {
                 return BTNsMap;
             }


}



