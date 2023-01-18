# Created by bence at 2023. 01. 18.
Feature: Pick your spot

  Scenario: Table reservation
    Given I am logged in
    When I click on the first table
    And I click on the reserve button
    Then I can see the reserved table on my profile