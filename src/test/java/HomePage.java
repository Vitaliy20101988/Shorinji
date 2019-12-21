import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Map;
import static java.util.Map.entry;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver){
    super (driver, 10);
    }


   private Map<String, String> URLsMap = Map.ofEntries (
           entry("baseUrl", "http://shorinji-kempo.org.ua"),
           entry("ShorinjiKempoURL", "http://shorinji-kempo.org.ua/index.php/shorinjikempo"),
           entry("HistoryURL", "http://shorinji-kempo.org.ua/index.php/historysk"),
           entry("UchebnazProgrammaURL", "http://shorinji-kempo.org.ua/index.php/uchebnaya-programma"),
           entry("RaspisanieTrenirovokURL", "http://shorinji-kempo.org.ua/index.php/raspisanie-trenirovok"),
           entry("MeditationURL", "http://shorinji-kempo.org.ua/index.php/meditation"),
           entry("NashiUchitelyaURL", "http://shorinji-kempo.org.ua/index.php/nashiuchitelya"),
           entry("RasskazyUchiteleyURL", "http://shorinji-kempo.org.ua/index.php/rasskazy-uchiteley"),
           entry("VpechatleniyaOURL", "http://shorinji-kempo.org.ua/index.php/vpechatleniya"),
           entry("VoprosyIOtvetyURL", "http://shorinji-kempo.org.ua/index.php/faq"),
           entry("TechnikaURL", "http://shorinji-kempo.org.ua/index.php/tehnika"),
           entry("FilosofiyaKaisoURL", "http://shorinji-kempo.org.ua/index.php/filosofiyakaiso"),
           entry("VerouchenieKongoZenURL", "http://shorinji-kempo.org.ua/index.php/verouchenie-kongozen"),
           entry("BuddizmURL", "http://shorinji-kempo.org.ua/index.php/buddhism"),
           entry("HappyoURL", "http://shorinji-kempo.org.ua/index.php/happyo"),
           entry("ShopURL", "http://shorinji-kempo.org.ua/index.php/shopsk"),
           entry("OplatyURL", "http://shorinji-kempo.org.ua/index.php/list-of-fees")
   );

         public static Map<String, String> getURLsMap() {
             return getURLsMap();
        }



    public Map<String, By> BTNsMap = Map.ofEntries (
            entry("ShorinjiKempoBtn", By.cssSelector(".item-25 > a")),
            entry("HistoryBtn", By.cssSelector(".item-29 > a")),
            entry("UchebnayaProgrammaBtn", By.linkText("Учебная программа")),
            entry("RaspisanieBtn", By.linkText("Расписание")),
            entry("MeditationBtn", By.linkText("Медитация")),
            entry("NashiUchitelyaBtn", By.linkText("Наши Учителя")),
            entry("RasskazyUchiteleyBtn", By.linkText("Рассказы Учителей")),
            entry("VpechatleniyaOBtn", By.linkText("Впечатления о...")),
            entry("VoprosyIOtvetyBtn", By.linkText("Вопросы и Ответы")),
            entry("TechnikaBtn", By.linkText("Техника")),
            entry("FilosofiyaKaisoBtn", By.linkText("Философия Кайсо")),
            entry("KongoZenBtn", By.linkText("Конго Дзэн")),
            entry("BuddizmBtn", By.linkText("Буддизм")),
            entry("HappyoBtn", By.linkText("Хаппё")),
            entry("ShopBtn", By.linkText("Магазин")),
            entry("PlatezyBtn", By.linkText("Перечень платежей"))
    );


             public static Map<String, By> getBtnHashMap() {
                 return BTNsMap();
             }
}



