
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

public HomePage(WebDriver driver){
    super (driver, 10);
}


      public String [] HomePageURLs = {
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




      //LEFT MENU//

By ShorinjiKempo = By.cssSelector(".item-25 > a");
By HistoryShorinji = By.cssSelector(".item-29 > a");
By Programm = By.linkText("Учебная программа");
By Schedule = By.linkText("Расписание");
By Meditation = By.linkText("Медитация");
By OurTeachers = By.linkText("Наши Учителя");
By Tales = By.linkText("Рассказы Учителей");
By Impressions = By.linkText("Впечатления о...");
By QuestionsAndAnswers = By.linkText("Вопросы и Ответы");
By Tehnika = By.linkText("Техника");
By FilosofiyaKaiso = By.linkText("Философия Кайсо");
By Kongozen = By.linkText("Конго Дзэн");
By Buddizm = By.linkText("Буддизм");
By Happyo = By.linkText("Хаппё");
By Shop = By.linkText("Магазин");
By Payments = By.linkText("Перечень платежей");


    public HomePage verifyHistoryLink (){
        click(HistoryShorinji);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[2]);
        return this;
    }


    public HomePage verifyShorinjiLink (){
        click(ShorinjiKempo);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[1]);
        return this;
    }

     public HomePage verifyProgrammLink(){
        click(Programm);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[3]);
        return this;
     }

     public HomePage verifySceduleLink(){
        click(Schedule);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[4]);
        return this;
     }

     public HomePage verifyMeditationLink(){
        click(Meditation);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[5]);
        return this;
     }

     public HomePage verifyOurTeachersLink(){
        click(OurTeachers);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[6]);
        return this;
     }

     public HomePage verifyTalesLink(){
        click(Tales);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[7]);
        return this;
     }

     public HomePage verifyImpressionsLink(){
        click(Impressions);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[8]);
        return this;
     }

     public HomePage verifyQuestionsAndAnswersLink(){
        click(QuestionsAndAnswers);
        AssertEqualURLs(driver.getCurrentUrl(), HomePageURLs[9]);
        return this;
     }



}
