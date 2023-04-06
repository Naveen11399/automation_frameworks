@smoke @regression
Feature: Registration Page Function

  @register_page
  Scenario: User register the account
    Given Goes to the registration page
    And Sign button is clicked
    When User try to register the account
    And Enter the fullname and email
    And Enter the password and confirm password values
    Then Enter the phone number
    And Submit and verify the registarion is successful

  @register_page
  Scenario: Verify the UI for registration page
    Given Registration form title  is Verifying
    When Mandatory field is Verifying
    Then Placeholder is verifying
    And Logo is verifying
