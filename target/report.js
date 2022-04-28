$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Validating login function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating login with different conditions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on facebook applicaton on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003cusername\u003e\"and\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should  verify home page is present",
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
        "password"
      ]
    },
    {
      "cells": [
        "welcome",
        "wel345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating login with different conditions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on facebook applicaton on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb.user_is_on_facebook_applicaton_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"welcome\"and\"wel345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Fb.user_enter_and(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d100.0.4896.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-87JJ3Q7\u0027, ip: \u0027192.168.1.68\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.75, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\PROGRA~1\\KMSpico\\temp\\sc...}, goog:chromeOptions: {debuggerAddress: localhost:62788}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 09a9590c07717b32ae10373d0e77f911\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdef1.Fb.user_enter_and(Fb.java:26)\r\n\tat ✽.user enter \"welcome\"and\"wel345\"(src/test/resources/login.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Fb.user_should_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should  verify home page is present",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb.user_should_verify_home_page_is_present()"
});
formatter.result({
  "status": "skipped"
});
});