$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/fb.feature");
formatter.feature({
  "name": "My first feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Launch Fb",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch fb \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click submit button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "url"
      ]
    },
    {
      "cells": [
        "yuvaraj@gmail.com",
        "asdf@123",
        "https://fb.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Launch Fb",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch fb \"https://fb.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_launch_fb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"yuvaraj@gmail.com\" and \"asdf@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_enters_and(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027YUVARAJ\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat facebook.launch.facebook.user_enters_and(facebook.java:119)\r\n\tat ✽.user enters \"yuvaraj@gmail.com\" and \"asdf@123\"(src/main/resources/Feature/fb.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
});