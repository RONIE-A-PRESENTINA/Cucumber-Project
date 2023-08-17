$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Booking Hotel Using Adactin Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoketest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "The User Logins Into The Web Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launches The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the User Enters The \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the User Enters The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the User Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;;1"
    },
    {
      "cells": [
        "ronietina",
        "3WE459"
      ],
      "line": 12,
      "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;;2"
    },
    {
      "cells": [
        "presentina",
        "12345tina"
      ],
      "line": 13,
      "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "The User Logins Into The Web Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launches The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the User Enters The \"ronietina\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the User Enters The \"3WE459\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the User Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launches_The_Adactin_Application()"
});
formatter.result({
  "duration": 4954373900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ronietina",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.the_User_Enters_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 211193500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3WE459",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.the_User_Enters_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 95764700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1697415600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "The User Logins Into The Web Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-logins-into-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launches The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the User Enters The \"presentina\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the User Enters The \"12345tina\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the User Clicks The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launches_The_Adactin_Application()"
});
formatter.result({
  "duration": 1037512400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "presentina",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.the_User_Enters_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 100092800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345tina",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.the_User_Enters_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 114467300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 934642300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "The User Searches The Hotel In The Search Hotel Page",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-searches-the-hotel-in-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the User Selects The Location Of The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the User Selects The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the User Selects The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the User Selects The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the User Enters The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the User Enters The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the User Selects Number Of Adults",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the User Selects Number Of Children",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "the User Clicks The Login Button And It Navigates To The Select Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_The_Location_Of_The_Hotel()"
});
formatter.result({
  "duration": 729542100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_The_Hotel()"
});
formatter.result({
  "duration": 456497600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_The_Room_Type()"
});
formatter.result({
  "duration": 338924400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 391001200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Check_In_Date()"
});
formatter.result({
  "duration": 232797600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Check_Out_Date()"
});
formatter.result({
  "duration": 235165800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_Number_Of_Adults()"
});
formatter.result({
  "duration": 419118800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_Number_Of_Children()"
});
formatter.result({
  "duration": 484857100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1080763500,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "The User Selects The Hotel From Select Hotel Page",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-selects-the-hotel-from-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "the User Clicks The Required Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the User Clicks The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Required_Hotel()"
});
formatter.result({
  "duration": 245831700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1090493300,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "The User Books The Hotel In The Book Hotel Page",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-books-the-hotel-in-the-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the User Enters The Firstname In The Firstame Field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the User Enters The Lastname I The Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the User Enters The Billing Address In The Billing Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "the User Enters The Credit Card Number In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "the User Selects Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "the User Selects Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "the User Selects Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "the User Enters The CVV Number In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "the User Clicks The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Firstname_In_The_Firstame_Field()"
});
formatter.result({
  "duration": 183487600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Lastname_I_The_Lastname_Field()"
});
formatter.result({
  "duration": 181284200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Billing_Address_In_The_Billing_Field()"
});
formatter.result({
  "duration": 210097900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_Credit_Card_Number_In_The_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 272957700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_Credit_Card_Type()"
});
formatter.result({
  "duration": 421267100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_Expiry_Month()"
});
formatter.result({
  "duration": 401084900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Selects_Expiry_Year()"
});
formatter.result({
  "duration": 584493600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Enters_The_CVV_Number_In_The_CVV_Number_Field()"
});
formatter.result({
  "duration": 206543800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.the_User_Clicks_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 194264800,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "The User Confirms The Details Of The Hotel",
  "description": "",
  "id": "booking-hotel-using-adactin-application;the-user-confirms-the-details-of-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@regressiontest"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "the User clicks The Logout Button And Then It Navigates Back To The Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.the_User_clicks_The_Logout_Button_And_Then_It_Navigates_Back_To_The_Login_Page()"
});
formatter.result({
  "duration": 9117100800,
  "status": "passed"
});
});