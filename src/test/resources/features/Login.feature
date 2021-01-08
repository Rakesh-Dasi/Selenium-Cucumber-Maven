Feature: Login Functionality

  Background: The chrome browser should be launched


	@Test
  Scenario: Validate Login with Valid Credentials
    Given user navigates to Orange HRM portal
    When user enter his valid credentials
    And user clicks on submit button
    Then Dashboard page should be displayed

  Scenario: Validate Login with Valid Credentials by passing credentials
    Given user navigates to Orange HRM portal
    When user enter his username as "Admin" and password "admin123"
    And user clicks on submit button
    Then Dashboard page should be displayed

	@SmokeTest
  Scenario Outline: Validate Login with Valid Credentials by passing credentials
    Given user navigates to Orange HRM portal
    When user enter his username as "<username>" and password "<password>"
    And user clicks on submit button
    Then Dashboard page should be displayed

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin1   | admin123 |
      | Admin    | admin123 |
