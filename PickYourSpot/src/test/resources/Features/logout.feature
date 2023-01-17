# Created by bence at 2023. 01. 17.
Feature: Logout
  # Enter feature description here

  Scenario: Happy path
    Given I am logged in
    When I click on the Logout button
    Then there is a login button instead of logout button