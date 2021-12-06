package ru.mail.besfian;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Tests extends TestBase{



    @Test
    void test() {
        open("https://ru.semrush.com/");
        $(byText("Тарифы")).click();
        $("[data-ui-name=Text]").shouldHave(text("Тарифные планы"));
    }

    @Test
    void test1() {
        open("https://ru.semrush.com/");
        $(byText("Ресурсы")).click();
        $(byText("Топовые веб-сайты")).click();
        $(".TopWebsitesForm__description___lWbFO").shouldHave(text("Based on data from the Semrush"));
    }
}
