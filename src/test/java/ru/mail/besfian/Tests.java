package ru.mail.besfian;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {
    @Owner("Sergeev")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображения страницы Тарифы")
    @Test
    void test() {
        step("переход по ссылке", () -> {
            open("https://ru.semrush.com/");
        });
        step("переход на страницу Тарифы", () -> {
            $(byText("Тарифы")).click();
        });
        step("проверка отображения элемента на странице", () -> {
            $("[data-ui-name=Text]").shouldHave(text("Тарифные планы"));
        });
    }

    @Owner("Sergeev")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображения страницы Топовые веб-сайты")
    @Test
    void test1() {
        step("переход по ссылке", () -> {
            open("https://ru.semrush.com/");
        });
        step("переход на страницу Топовые веб-сайты", () -> {
            $(byText("Ресурсы")).click();
            $(byText("Топовые веб-сайты")).click();
        });
        step("проверка отображения элемента на странице", () -> {
            $(".TopWebsitesForm__description___lWbFO").shouldHave(text("Based on data from the Semrush"));
        });

    }

    @Owner("Sergeev")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображения страницы Контакты")
    @Test
    void test2() {
        step("переход по ссылке", () -> {
            open("https://ru.semrush.com/");
        });
        step("переход на страницу Контакты", () -> {
            $(byText("О компании")).click();
            $(byText("Контакты")).click();
        });
        step("проверка отображения элемента на странице", () -> {
            $(byText("+1 (800) 815 - 9959")).scrollTo().shouldHave(visible);
        });

    }

    @Owner("Sergeev")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка авторизации и отображения личного кабинета")
    @Test
    void test3() {
        step("переход по ссылке", () -> {
            open("https://ru.semrush.com/");
        });
        step("авторизация", () -> {
            $(byText("Войти")).click();
            $("#email").setValue("besfian@mail.ru");
            $("#password").setValue("spride0930237h").pressEnter();
        });
        step("проверка отображение элемента в личном кабинете", () -> {
            $("[data-ui-name=Box]").shouldHave(visible);
        });
        step("выход", () -> {
            $("[data-test=header-menu__user]").click();
            $(byText("Выйти")).click();
        });

    }

    @Owner("Sergeev")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображения страницы SEMrush API")
    @Test
    void test4() {
        step("Открытие главной страницы", () -> {
            open("https://ru.semrush.com/");
        });
        step("переход на страницу SEMrush API", () -> {
            $(byText("Semrush API")).scrollTo().click();});
            step("проверка отображения элемента", () -> {
                $(byText("Get API")).click();
                $(byText("Get API")).shouldHave(visible);
            });



    }
}
