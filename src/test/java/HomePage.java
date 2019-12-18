
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

public HomePage(WebDriver driver){
    super (driver, 10);
}



        private String [] HomePageURLs = {
        "http://shorinji-kempo.org.ua",                             //0
        "http://shorinji-kempo.org.ua/index.php/shorinjikempo",    //1
        "http://shorinji-kempo.org.ua/index.php/historysk",       //2
        "http://shorinji-kempo.org.ua/index.php/uchebnaya-programma",    //3
        "http://shorinji-kempo.org.ua/index.php/raspisanie-trenirovok" ,    //4
        "http://shorinji-kempo.org.ua/index.php/meditation",                //5
        "http://shorinji-kempo.org.ua/index.php/nashiuchitelya",            //6
        "http://shorinji-kempo.org.ua/index.php/rasskazy-uchiteley",         //7
        "http://shorinji-kempo.org.ua/index.php/vpechatleniya",              //8
        "http://shorinji-kempo.org.ua/index.php/faq",                         //9
        "http://shorinji-kempo.org.ua/index.php/tehnika",                      //10
        "http://shorinji-kempo.org.ua/index.php/filosofiyakaiso",              //11
        "http://shorinji-kempo.org.ua/index.php/verouchenie-kongozen",          //12
        "http://shorinji-kempo.org.ua/index.php/buddhism",                      //13
        "http://shorinji-kempo.org.ua/index.php/happyo",                        //14
        "http://shorinji-kempo.org.ua/index.php/shopsk",                         //15
        "http://shorinji-kempo.org.ua/index.php/list-of-fees",                    //16
};


                //GETTERS//
    public String getHomePageURL (int i){
        return HomePageURLs[i];
    }




      //LEFT MENU//
private By LeftMenuBtn [] = {
              By.cssSelector(".item-25 > a"),     //0
              By.cssSelector(".item-29 > a"),      //1
              By.linkText("Учебная программа"),     //2
              By.linkText("Расписание"),            //3
              By.linkText("Медитация"),             //4
              By.linkText("Наши Учителя"),          //5
              By.linkText("Рассказы Учителей"),     //6
              By.linkText("Впечатления о..."),      //7
              By.linkText("Вопросы и Ответы"),      //8
              By.linkText("Техника"),               //9
              By.linkText("Философия Кайсо"),       //10
              By.linkText("Конго Дзэн"),            //11
              By.linkText("Буддизм"),               //12
              By.linkText("Хаппё"),                 //13
              By.linkText("Магазин"),               //14
              By.linkText("Перечень платежей")      //15
    };


    public By getLeftMenuBtn (int i){
        return LeftMenuBtn[i];
    }



}
