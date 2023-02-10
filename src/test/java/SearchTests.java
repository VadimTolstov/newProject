import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");

        //Ввести selenide в поиск
        $("[name=q]").setValue("selenide").pressEnter();

        //Проверить что selenide появился в результате поиска
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }

}
