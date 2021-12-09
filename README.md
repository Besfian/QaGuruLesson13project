# The test automation project for [SEMRUSH website](https://ru.semrush.com/)
## The project is prepared with technologies:
Java Gradle IntelliJ IDEA Selenide Selenoid JUnit5 Github Jenkins Allure Report Allure TestOps Telegram Jira
#### Запускать тесты с терминала локально
##### Run tests with filled remote properties:
`gradle clean test`
#### Run tests without filled remote properties:
`j
clean test
ava  \
"-DprojectName=${PROJECT_NAME}" \
"-Denv=${ENVIRONMENT}" \
"-DreportLink=${BUILD_URL}" \
"-Dcomm=Any comment here" \
"-Dconfig.file=notifications/telegram.json" \
-jar allure-notifications-3.1.2.jar`


