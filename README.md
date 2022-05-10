<p align="center"> Fourth Project Selenium Task Amazon </p>

---

## Installation

1. Install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) and [maven](https://maven.apache.org/download.cgi) before running any tests. Select already installed java version in Project SDK drop-down in File -> Project Structure.
2. Download [ChromeDriver](https://chromedriver.chromium.org/) and specify path to the executable in config.properties in chrome.driver.dir parameter. 
In my case I have created empty folder C:\selenium and have unzipped chromedriver.exe in it, so that my variable is chrome.driver.dir=C:/selenium/chromedriver.exe. 
Make sure you are downloading correct driver version (see your Chrome browser version).

---

## Import project in IntelliJ IDEA

If you are using IntelliJ IDEA or any other IDE you can import the project from pom.xml

1. Clone the repo using ssh - git@github.com:milenaGugova/fourthProject.git or https url - https://github.com/milenaGugova/fourthProject.git
2. Import the project in IntelliJ - File -> New -> Project from Existing Sources... Select the pom.xml file and the whole project will be imported.

---

## Running a test

Tests are written in Cucumber .feature files. (test/resources/features).

1. Every feature needs to be in separate file. A feature can have multiple scenarios.
2. Every written [step](https://cucumber.io/docs/gherkin/step-organization/) needs to have a [step definition](https://cucumber.io/docs/cucumber/step-definitions/) in steps package. Can be found here -fourthProject/src/main/java/steps.
3. Pages are organized using [Page Object Model](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) design pattern. Every component/page that can be reused needs to be in a separate class (for now extending base class Page.java). Can be found here -fourthProject/src/main/java/pageobjects.
4. Every common steps that can be reused across applications can be found in fourthProject/src/main/java/helpers.
5. Every common variables are placed in config.properties file in fourthProject/src/main/resources, including chrome.driver.dir variable (make sure it takes to the dictionary the driver is downloaded and placed).
6. Cucumber [PicoContainer](https://github.com/cucumber/cucumber-jvm/tree/master/picocontainer) is used to provide dependency injection to steps ensuring a single webdriver instance is used throughout all steps - achieved through DynamicDriverManager.java (needs to be injected in all Components and Steps)
7. AutomationRunner.java is used to run all specified feature files. In order to create configuration for runner - Right click on Runner -> Create Runner.
8. To execute feature files through maven - execute mvn clean test where pom.xml is located or right click on the feature file and select Run 'Feature: AmazonScenario' or open AmazonScenario.feature file and select the Scenario and again Right click and Run (or Ctrl+Shift+F10).
