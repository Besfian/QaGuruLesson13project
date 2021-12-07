package ru.mail.besfian;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Tests extends TestBase{


    @Disabled
    @Test
    void test() {
        open("https://ru.semrush.com/");
        $(byText("Тарифы")).click();
        $("[data-ui-name=Text]").shouldHave(text("Тарифные планы"));
    }
    @Disabled
    @Test
    void test1() {
        open("https://ru.semrush.com/");
        $(byText("Ресурсы")).click();
        $(byText("Топовые веб-сайты")).click();
        $(".TopWebsitesForm__description___lWbFO").shouldHave(text("Based on data from the Semrush"));
    }
    @Test
    void test2() {
        open("https://ru.semrush.com/");
        $(byText("Войти")).click();
        $("#email").setValue("besfian@mail.ru");
        $("#password").setValue("spride0930237h").pressEnter();
        $("[data-ui-name=Box]").shouldHave(visible);
        $("[data-test=header-menu__user]").click();
        $(byText("Выйти")).click();
    }
}
