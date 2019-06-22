Feature: User should login the Adactin Application

Background:  To verify user should login the application

Given User should launch the adactin application
Then  User should Validate the login page
Then  User enter the username "<username>" and password "<password>" 
Then  User enter the login button
Then  user should validate the username
Then user click the logout Button

Scenario Outline: To verify whether the check-outdate field accepts a later date than check in date - 102

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User Enter check-in-date as in test data "<+7date>"
And  User Enter check-out-date as in test data "<+5date>"
Then User Verify that system gives an error message for check in date
Then User Verify that system gives an error message for check out date
Then User click the search button

Examples:
| location | hotel       | roomtype | no of rooms | +7date    | +5date      |
| Sydney   | Hotel Creek | Standard | 1           |05/06/2019 | 03/06/2019  |