$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureAdactin.feature");
formatter.feature({
  "line": 1,
  "name": "User should login the Adactin Application",
  "description": "",
  "id": "user-should-login-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "To verify whether the check-outdate field accepts a later date than check in date - 102",
  "description": "",
  "id": "user-should-login-the-adactin-application;to-verify-whether-the-check-outdate-field-accepts-a-later-date-than-check-in-date---102",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User verify that correct username is displayed on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User should location as in test data \"\u003clocation\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should hotel as in test data \"\u003chotel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should room type as in test data \"\u003croomtype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should no-of-rooms as in test data \"\u003cno of rooms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Enter check-in-date as in test data \"\u003c+7date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Enter check-out-date as in test data \"\u003c+5date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Verify that system gives an error message for check in date",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Verify that system gives an error message for check out date",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User click the search button",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "user-should-login-the-adactin-application;to-verify-whether-the-check-outdate-field-accepts-a-later-date-than-check-in-date---102;",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "no of rooms",
        "+7date",
        "+5date"
      ],
      "line": 26,
      "id": "user-should-login-the-adactin-application;to-verify-whether-the-check-outdate-field-accepts-a-later-date-than-check-in-date---102;;1"
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1",
        "05/06/2019",
        "03/06/2019"
      ],
      "line": 27,
      "id": "user-should-login-the-adactin-application;to-verify-whether-the-check-outdate-field-accepts-a-later-date-than-check-in-date---102;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "To verify user should login the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User should launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should Validate the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter the username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enter the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should validate the username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click the logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_launch_the_adactin_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_should_Validate_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 25
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 51
    }
  ],
  "location": "StepDefinition.user_enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_should_validate_the_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_the_logout_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "To verify whether the check-outdate field accepts a later date than check in date - 102",
  "description": "",
  "id": "user-should-login-the-adactin-application;to-verify-whether-the-check-outdate-field-accepts-a-later-date-than-check-in-date---102;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User verify that correct username is displayed on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User should location as in test data \"Sydney\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should hotel as in test data \"Hotel Creek\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should room type as in test data \"Standard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should no-of-rooms as in test data \"1\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Enter check-in-date as in test data \"05/06/2019\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Enter check-out-date as in test data \"03/06/2019\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Verify that system gives an error message for check in date",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Verify that system gives an error message for check out date",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_that_correct_username_is_displayed_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 38
    }
  ],
  "location": "StepDefinition.user_should_location_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 35
    }
  ],
  "location": "StepDefinition.user_should_hotel_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 39
    }
  ],
  "location": "StepDefinition.user_should_room_type_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_should_no_of_rooms_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "05/06/2019",
      "offset": 42
    }
  ],
  "location": "StepDefinition.user_Enter_check_in_date_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "03/06/2019",
      "offset": 43
    }
  ],
  "location": "StepDefinition.user_Enter_check_out_date_as_in_test_data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Verify_that_system_gives_an_error_message_for_check_in_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Verify_that_system_gives_an_error_message_for_check_out_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
});