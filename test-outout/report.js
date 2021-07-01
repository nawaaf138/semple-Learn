$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/96655/eclipse-workspace/project2/projects/projectTwo.feature");
formatter.feature({
  "line": 2,
  "name": "Open Browser and login",
  "description": "I want to use this template for my feature file",
  "id": "open-browser-and-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "open-browser-and-login;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open the brwoser and Swiggy website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "open login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "add phone number and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Swiggy.open_the_brwoser_and_Swiggy_website()"
});
formatter.result({
  "duration": 506270201,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat seleniumTest.Swiggy.open_the_brwoser_and_Swiggy_website(Swiggy.java:42)\r\n\tat ✽.Given open the brwoser and Swiggy website(C:/Users/96655/eclipse-workspace/project2/projects/projectTwo.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Swiggy.open_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Swiggy.add_phone_number_and_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});