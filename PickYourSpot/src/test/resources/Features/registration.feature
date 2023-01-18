# Created by bence at 2023. 01. 17.
Feature: Registration

  Scenario: Register new User
    Given I am on the registration page
    When I fill the Username and Password and Email with valid data
    And I click on the Registration Submit button
    Then I am on the Login page and I can login

  Scenario: Register with already existing User
    Given I am on the registration page
    When I fill the Username and Password and Email with invalid data
    And I click on the Registration Submit button
    Then Error message is displayed
