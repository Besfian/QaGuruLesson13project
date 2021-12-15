package ru.mail.besfian;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageObject {
    private final String URL = "https://ru.semrush.com/";
    private SelenideElement
            formLoginInput = $("#email"),
            formPasswordInput = $("#password");


    public PageObject openPage() {
        open(URL);
        return this;
    }


    public PageObject authorization(String login, String password) {
        formLoginInput.setValue(login);
        formPasswordInput.setValue(password).pressEnter();
        return this;
    }


}
