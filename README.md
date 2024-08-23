# Henry Xchange Automation
<b>`This framework is to tests Henry Xchange applications on Web platforms.`</b><br><br>
This is a generic Page Object model using Cucumber(BDD) with TestNG approach which solves all the automation needs with single codebase.<br>
We often tend to create different test frameworks for different platforms and it's very difficult for anyone to serve all platform needs in one test automation framework.<br>

<b>`Henry Xchange Automation framework solves all QA needs and help in doing Sanity and Regressions leads to perform tedious and repetitive tasks and helps QA team to meet the deadlines.`</b><br>

## Contents:

* [Features](#features)
* [Libraries Used](#libraries-used)
* [Prerequisites Installations](#prerequisites-installations)
* [Appium Setup](#appium-setup)
* [How This Framework Works](#how-this-framework-works)
* [How To Run Tests](#how-to-run-tests)
* [How To See Allure Result Report](#how-to-see-allure-result-report)
* [Image Comparison Output](#image-comparison-output)
* [Pending Tasks](#pending-tasks)

## Features:

* Easy to automate any type of application
* Cross-platform (Android & iOS) support with single codebase
* Page Factory Model
* TestNG integration
* Cucumber (BDD)
* Extent & Allure Reporting
* Robust in nature
* Many configurations

## Libraries Used:

1. Selenium WebDriver
2. Appium
3. Java
4. TestNG
5. Maven
6. WebDriverManager
7. Cucumber
8. Rest Assured
9. Extent Report
10. Allure Reports

## Prerequisites Installations:

1. <b>`JAVA 19`</b> - Install Java and set the JAVA_HOME path on your machine.
2. <b>`Node & NPM`</b> - Download & install node from `https://nodejs.org/en/download/`.
3. <b>`Maven`</b> - Install Maven.
4. <b>`Android`</b> - Install Android Studio & set <i><b>ANDROID_HOME</b></i> path.<br>
    -  Downloading the Android SDK
    -  Download the Android SDK tools such as
        1. Build tools
        2. Platform tools
        3. Android Emulator
        4. Intel HAXM installer etc.....
        5. Create an emulator device from AVD manager
5. <b>`iOS`</b> - Install XCode on your machine & download required iPhone/iPad simulators.<br>


<b>`Note: If you want to run only on WEB, you don't need anything except JAVA.`</b><br>
<b>`Mentioned installations Node, Android & iOS are for mobile app automation & Rest like Maven & Extent are for framework level`</b>

## Appium Setup:

- <b>`Install Appium`</b>
``` 
 $ sudo npm install -g appium@latest --unsafe-perm=true --allow-root 
```
- <b>`Appium Doctor`</b> - which is used to see if the appium setup is correctly done or not. Run it and fix the issues as per that.<br>
``` 
 $ sudo npm install -g appium-doctor --unsafe-perm=true --allow-root
 $ appium-doctor
```
- <b>`Appium Drivers`</b> - which is used to translate the commands sent by the appium client to the appium server
  and translate it to the native platform understandable formats.<br>
```
 $ appium driver ls - To list out all the available appium drivers
 $ appium driver install uiautomator2 - To install the android native driver
 $ appium driver install xcuitest - To install the iOS native driver
```

## How This Framework Works:

This framework is built in Page Factory model style using Cucumber with TestNG framework.<br>
We have "testng.xml" file which has tests for each and every platform in cross browser/device testing fashion.

###### Here are the minimal things you have to do:

- Create your tests
- Create your Page Object class w.r.t test that you have written, if not created already (Take the reference from <b>org.oneframework.pageObjects</b>).<br>
  For e.g, SignIn button locators for web, ios & android set as shown below.<br>
  <img src="https://ecco-aman.github.io/ecco-automation-assets/page_objects_screen.png" width="300" >
- If mobile app, Set the android, ios device details in corresponding files in resources directory as shown below.<br>
  <img src="https://ecco-aman.github.io/ecco-automation-assets/ios_device_json.png" width="350">
  <img src="https://ecco-aman.github.io/ecco-automation-assets/android_device_json.png" width="350">
- If web app, Set web app URL in BaseTest

## How To Run Tests:

1. Clone the repo.<br>
   `https://github.com/allhenry/exchange-automation-test.git` <br>
2. Build the JAR and run it.<br>
```
$ mvn clean build
$ mvn install
$ mvn test
```
<b>`Note:`</b>`capture & compare are the image capture and compare modes.`</b>

## How To See Allure Report:

Once test execution is complete, extent-reports directory gets generated. Just go to the directory and open the html file in any browser of your choice.

<img src="assets/Screenshot 2023-12-27 at 3.33.56 PM.png" width="300" >
<img src="assets/Screenshot 2023-12-27 at 3.34.38 PM.png" width="300" >
<img src="assets/Screenshot 2023-12-27 at 3.34.53 PM.png" width="300" >
<img src="assets/Screenshot 2023-12-27 at 3.35.04 PM.png" width="300" >

## Pending Tasks:

1. Parallel test execution
2. Integration with CI i.e. Jenkins (or) GitHub Actions
3. Recording of test execution
4. Setup to execute the scripts on to the remote devices.