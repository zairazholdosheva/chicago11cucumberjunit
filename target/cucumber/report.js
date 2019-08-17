$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikiSearchSO.feature");
formatter.feature({
  "name": "Wikipedia search feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@so"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Wikipedia title verification using search boz feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User types \"\u003csearchKey\u003e\" in the  wiki search box",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.step({
  "name": "User sees \"\u003ctitle\u003e\" is in the  wiki title",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for search functionality",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchKey",
        "title"
      ]
    },
    {
      "cells": [
        "Steve Jobs",
        "Steve Jobs"
      ]
    },
    {
      "cells": [
        "Ricky Martin",
        "Ricky Martin"
      ]
    },
    {
      "cells": [
        "Lionel Messi",
        "Lionel Messi"
      ]
    },
    {
      "cells": [
        "Lady Gaga",
        "Lady Gaga"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia title verification using search boz feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@so"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the  wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the  wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia title verification using search boz feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@so"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Ricky Martin\" in the  wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Ricky Martin\" is in the  wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia title verification using search boz feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@so"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Lionel Messi\" in the  wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Lionel Messi\" is in the  wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia title verification using search boz feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@so"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Lady Gaga\" in the  wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Lady Gaga\" is in the  wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});