# Проект автотестов на МЕДИНДЕКС

## Покрыт следующий функционал
* UI тесты
    * ✅ Проверка отображения страницы Тарифы
    * ✅ Проверка отображения страницы Топовые веб-сайты
    * ✅ Проверка отображения страницы Контакты
    * ✅ Проверка авторизации и отображения личного кабинета
    * ✅ Проверка отображения страницы SEMrush API

## Технологический стек
Java, Gradle, JUnit5, IntelliJ IDEA, Selenide, Jenkins, Allure TestOps, Jira, Github, Telegram

<p  align="center"

<code>
<img width="5%" title="Java" src="images/logo/Java_icon.png">
<img width="5%" title="Gradle" src="images/logo/Gradle_icon.svg">
<img width="5%" title="IntelliJ IDEA" src="images/logo/Intellij_icon.png">
<img width="5%" title="Selenide" src="images/logo/Selenide_icon.svg">
<img width="5%" title="Selenoid" src="images/logo/Selenoid_icon.svg">
<img width="5%" title="JUnit5" src="images/logo/JUnit5_icon.png">
<img width="5%" title="Github" src="images/logo/Github_icon.png">
<img width="5%" title="Jenkins" src="images/logo/Jenkins_icon.svg">
<img width="5%" title="Allure Report" src="images/logo/Allure_Report_icon.svg">
<img width="5%" title="Allure TestOps" src="images/logo/Allure_TestOps_icon.svg">
<img width="5%" title="Telegram" src="images/logo/Telegram_icon.png">
<img width="5%" title="Jira" src="images/logo/Jira_icon.png">
</code>
</p>

## Как запустить
Перед выполением необходимо:
* в local.properies определить параметры конфигурации (для запуска тестов локально)
* в remote.properies определить параметры конфигурации (для запуска тестов удаленно) или передать значения:
    - browser (default chrome)
    - browserVersion (default 89.0)
    - browserSize (default 1920x1080)
    - browserMobileView (mobile device name, for example iPhone X)
    - remoteDriverUrl (url address from selenoid or grid)
    - videoStorage (url address where you should get video)
    - threads (number of threads)

### Локально
```
gradle clean test
```

### Удаленно
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```



### Запуск в Jenkins
Статистика по запускам <br >
<a href="https://ibb.co/nnKgcv6"><img src="https://i.ibb.co/CMS17Zm/statistic-jenkins.png" alt="Статистика по запускам" border="0" /></a>

Параметры запуска <br >
<a href="https://ibb.co/zbNbgHb"><img src="https://i.ibb.co/Y8b8ST8/jenkins-parametrs.png" alt="jenkins-parametrs" border="0" /></a>

### Отчёт о прохождении автотестов в Allure Report
<a href="https://ibb.co/HzG3q6q"><img src="https://i.ibb.co/WyBjfZf/Allure-report.png" alt="Allure-report" border="0" /></a>
### Список автотестов в Allure Report
<a href="https://ibb.co/sWqKV61"><img src="https://i.ibb.co/hYVBmZd/Allure-list.png" alt="Allure-list" border="0" /></a>

### Уведомления о прохождении автотестов в Telegram
<p  align="center"
<code>
<img width="50%" title="TelegramBot" src="images/screens/bot.png">
</code>
</p>
