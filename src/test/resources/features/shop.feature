@PurchaseFlow
Feature: Purchase flow in SauceDemo

  Scenario: Successful purchase of two products
    Given the user is on the login page
    When the user logs in with credentials from "valid user"
    When the user adds two products to the cart
    When the user views the cart
    When the user completes the purchase form with data from "test data"
    Then the purchase should be confirmed with the message "Thank you for your order!"

