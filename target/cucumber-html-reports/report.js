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
  "name": "User launch fb",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch fb",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_launch_fb()"
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
  "status": "passed"
});
formatter.step({
  "name": "user click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});