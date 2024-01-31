Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given user Launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login"
    And user enter Email as "admin@yourstore.com" and password as "admin"
    And click to login
    Then Page title should be "Dashboard /nopCommerce administation"
    When Click on logout link
    Then page title should be "Your store.Login"
    And close browser
    
 

  Scenario Outline: Successful Login with Valid Credentials DDT
    Given user Launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login"
    And user enter Email as "<email>" and password as "<password>"
    And click to login
    Then Page title should be "Dashboard /nopCommerce administation"
    When Click on logout link
    Then page title should be "Your store.Login"
    And Close the browser
    
    Example:
    |email|password|
    |admin@yourstore.com|admin|
    |test@yourstore.com|admin|