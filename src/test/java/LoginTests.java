import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.openqa.selenium.firefox.FirefoxDriver;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {


  //  static WebDriverWait driver;
    @Test
    void successfulLginTest(){
        //Не закрывает браузер после проверки
        Configuration.holdBrowserOpen = true;

       open("https://qa.guru/cms/system/login?required=true");

       //Ввести адрес электронной почты
       $("[name=email]").setValue("qagurubot@gmail.com");

       //Ввести пароль
        $("[name=password]").setValue("qagurupassword");

        //Нажать кнопку войти
        $(".btn-success").click();
        $("[class=has-arrow]").click();
        
        //проверить наличие текста
        $(".logined-form").shouldHave(text("QA_GURU_BOT"));


/*
        open("http://cargo-dev2n.smartcom.local/");
        $("[name=login]").setValue("VadimT");
        $("[name=password]").setValue("0508580102gG!");
        $("[type=button]").click();
        WebDriverWait wait = (new WebDriverWait((WebDriver) driver, 100));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("[contains(text(), 'Can not load localization ru for module printUniversalTransferDocument')]")));
        $("[role=presentation]").click();
        $("[class=x-tab-inner]").click();
*/

    }

}
