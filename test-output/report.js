$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calculate.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator Application",
  "description": "I want to CheckFunctionality of Calculator",
  "id": "calculator-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Adding Two single digit numbers",
  "description": "",
  "id": "calculator-application;adding-two-single-digit-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@ADD"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Calculator App is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"\u003cnumber1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on plus sign \"\u003csign\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on \"\u003cnumber2\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Equals to sign \"\u003cesign\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I will check the \"\u003canswer\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "calculator-application;adding-two-single-digit-numbers;",
  "rows": [
    {
      "cells": [
        "number1",
        "sign",
        "number2",
        "esign",
        "answer"
      ],
      "line": 14,
      "id": "calculator-application;adding-two-single-digit-numbers;;1"
    },
    {
      "cells": [
        "2",
        "+",
        "2",
        "\u003d",
        "4"
      ],
      "line": 15,
      "id": "calculator-application;adding-two-single-digit-numbers;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4435581600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adding Two single digit numbers",
  "description": "",
  "id": "calculator-application;adding-two-single-digit-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@ADD"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Calculator App is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on plus sign \"+\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on \"2\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Equals to sign \"\u003d\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I will check the \"4\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Addition.calculator_App_is_open()"
});
formatter.result({
  "duration": 415116500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    }
  ],
  "location": "Addition.i_click_on_number(int)"
});
formatter.result({
  "duration": 589365400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "+",
      "offset": 22
    }
  ],
  "location": "Addition.i_click_on_plus_sign(char)"
});
formatter.result({
  "duration": 480416900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    }
  ],
  "location": "Addition.i_click_on_number(int)"
});
formatter.result({
  "duration": 500850000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003d",
      "offset": 27
    }
  ],
  "location": "Addition.i_click_on_Equals_to_sign(char)"
});
formatter.result({
  "duration": 482823900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 18
    }
  ],
  "location": "Addition.i_will_check_the(String)"
});
formatter.result({
  "duration": 221320200,
  "status": "passed"
});
formatter.after({
  "duration": 72896400,
  "status": "passed"
});
formatter.after({
  "duration": 163200,
  "status": "passed"
});
});