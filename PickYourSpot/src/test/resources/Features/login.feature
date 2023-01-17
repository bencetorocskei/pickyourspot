# Created by bence at 2023. 01. 17.
Feature: Login


  Scenario: Happy path
    Given I am on the home page
    When I click on the Login button
    When I set the Username and Password with valid data
    And I click on the Submit button
    Then I am on the Dashboard page

    Scenario: Invalid username
      Given invalid credentials
      Given I am on the login page
      When I set the Username input
      And I set the Password
      And press the Submit button
      Then I got error message

      Given admin credentials
      Given I am on the login page
      When I set the Username input
      And I set the Password
      And press the Submit button
      Then I am on the dashboard page and there is the admin button