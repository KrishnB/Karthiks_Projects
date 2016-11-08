Feature: Homepage
  Verify minicabit homepage


Scenario: Login
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on login button
  And I enter Emailaddress as "vinaykumarvvs1936@gmail.com"
  And I enter password as "asdfgh"
  And I click on submit button
  Then I should be able view my account details


Scenario Outline:
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on login button
  And I enter loginDetails as <LoginDetails>
  Then I should be able view my account details
  Examples:
  |LoginDetails|
  |validLogin  |
  |invalidLogin|


Scenario: Invalid Login
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on login button
  And I enter Emailaddress as "vinaykumarvvs1936@gmail.com"
  And I enter password as "snand"
  And I click on submit button
  Then I should not be able view my account details

Scenario: Invalid Username
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on login button
  And I enter Emailaddress as "kakka@gmmm.com"
  And I enter password as "asdfgh"
  And  I click on submit button
  Then  I should not be able view my account details


Scenario: Signup
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on Signup button
  And I enter Email as "kakka@gmail.com"
  And I enter Confirm Email as ""
  And I enter spassword as "Minicabit@45"
  And I enter confirm password as "Minicabit@45"
  And I select a Title as "Mr"
  And I enter as FirstName as "kakaka"
  And I enter as LastName as "emilia"
  And I enter Contact mobile number as "12345678901"
  And I enter Confirm mobile number as "12345678901"
  And I enter town as "London"
  And I Click on Register button
  Then I should not be able to create account

Scenario Outline:SignUp
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on Signup button
  And I enter signUpDetails as <SignUpDetails>
  Examples:
  |SignUpDetails|
  |ValidSignUp |
  |InvalidSignUp|


Scenario:PasswordCheck
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  When I click on Signup button
  And I enter Email as "kakka@gmmm.com"
  And I enter Confirm Email as "kakka@gmmm.com"
  And I enter spassword as "Minic"
  And I enter confirm password as "Minic"
  And I select a Title as "Mr"
  And I enter as FirstName as "kakaka"
  And I enter as LastName as "emilia"
  And I enter Contact mobile number as "12345678901"
  And I enter Confirm mobile number as "12345678901"
  And I enter town as "London"
  Then I should not be able to create account

Scenario:Social Media Page
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  And I click on facebookIcon button
  And I should be navigated to facebook page

Scenario:Social Media Page
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  And I click on GooglePlusIcon button
  And I should be navigated to googlePlus page

Scenario:Invalid Booking
  Given In a browser I enter "https://www.minicabit.com/"
  And I should be navigated to homepage
  And I enter the From location as "Manchester Airport"
  And I enter the To location as "Manchester Airport"
  And I enter Pickup as "9/10"
  And I enter Hour as "10"
  And I enter minutes as "40"
  And I click on Single Trip
  And I enter How many passengers as "1Passenger"
  And I enter Any Additional Luggage as "3 suitcases"
  And I click on getquote button
  And I should not be able to book a cab

Scenario:Invalid Booking
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter the From location as "Manchester Airport"
    And I enter the To location as ""
    And I enter Pickup as "28-10-2016"
    And I enter time as "10:45"
    And I click on Single Trip
    And I enter How many passengers as "1Passenger"
    And I enter Any Additional Luggage as "3 suitcases"
    And I click on getquote button
    And I should not be able to book a cab

  Scenario:Invalid Booking
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter the From location as "Manchester Airport"
    And I enter the To location as ""
    And I enter Pickup as "28-10-2016"
    And I enter time as "10:45"
    And I click on Round Trip
    And I enter How many passengers as "1Passenger"
    And I enter Any Additional Luggage as "3 suitcases"
    And I click on getquote button
    And I should not be able to book a cab

  Scenario:valid Booking
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter the From location as "Manchester Airport"
    And I enter the To location as "Manchester Airport"
    And I enter Pickup as "28-10-2016"
    And I enter time as "10:45"
    And I click on Single Trip
    And I enter How many passengers as "16Passenger"
    And I enter Any Additional Luggage as "16 suitcases"
    And I click on getquote button
    And I should be able to book a cab