# The test automation project for [SEMRUSH website](https://ru.semrush.com/)
## The project is prepared with technologies:
Java Gradle IntelliJ IDEA Selenide Selenoid JUnit5 Github Jenkins Allure Report Allure TestOps Telegram Jira
#### Запускать тесты с терминала локально
##### Run tests with filled remote properties:
`gradle clean test`
#### Run tests without filled remote properties:
`gradle clean
test
-Dtag=${tag}
-Denvironment=${ENVIRONMENT}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView=${BROWSER_MOBILE}
-DURL=${REMOTE_DRIVER_URL}
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}`


