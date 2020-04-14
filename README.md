# ChatSpringBoot
creazione di una chat broadcast tramite springboot , web socket , html , js , e db H2
# Requirements
java version "1.8.0_181"
build:Maven 4.0.0
IDE: Eclipse Java EE IDE for Web Developers.Version: 2018-09 (4.9.0)
db h2 : download from http://www.h2database.com/html/download.html (innstal and create test by console istance)
         jdbc:h2:~/test
         user name :sa 
         password :
## Steps to Setup


**1. Clone the application**

```bash
git clone https://github.com/belliazzi/ChatSpringBoot.git
```
**2.1 Build and run the app using IDE**
  clik left button on project 
   - run as : click on maven clean 
   - run as : click on maven install 
   click on "BootDashBord"
    add target project 
    click on it right button and click on Restart
**2.2 Build and run the app using maven**

```bash
cd ChatSpringBoot
mvn package
java -jar target/chat-demo-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the app directly without packaging it like so -

```bash
mvn spring-boot:run
```
