@smoketest
Feature: Booking Hotel Using Adactin Application

Scenario Outline: The User Logins Into The Web Application
Given user Launches The Adactin Application
When the User Enters The "<username>" In The Username Field
And the User Enters The "<password>" In The Password Field
Then the User Clicks The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|ronietina|3WE459|
|presentina|12345tina|

@sanitytest
Scenario: The User Searches The Hotel In The Search Hotel Page
When the User Selects The Location Of The Hotel
And the User Selects The Hotel
And the User Selects The Room Type
And the User Selects The Number Of Rooms
And the User Enters The Check In Date
And the User Enters The Check Out Date
And the User Selects Number Of Adults
And the User Selects Number Of Children
And the User Clicks The Login Button And It Navigates To The Select Hotel Page

@sanitytest
Scenario: The User Selects The Hotel From Select Hotel Page
When the User Clicks The Required Hotel
Then the User Clicks The Continue Button And It Navigates To The Book Hotel Page

@sanitytest
Scenario: The User Books The Hotel In The Book Hotel Page
When the User Enters The Firstname In The Firstame Field
And the User Enters The Lastname I The Lastname Field
And the User Enters The Billing Address In The Billing Field
And the User Enters The Credit Card Number In The Credit Card Number Field
And the User Selects Credit Card Type
And the User Selects Expiry Month
And the User Selects Expiry Year
And the User Enters The CVV Number In The CVV Number Field
Then the User Clicks The Book Now Button And It Navigates To The Booking Confirmation Page

@regressiontest
Scenario: The User Confirms The Details Of The Hotel
Then the User clicks The Logout Button And Then It Navigates Back To The Login Page





