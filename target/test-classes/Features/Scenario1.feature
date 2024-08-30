Feature: Login page Automation of Saucedemo App

Scenario: Verify whether user is able to login and add product to the cart.
Given User is on login page
When User enters valid username and password
And Clicks on login button
Then User is navigated to the last product and clicks on Add to cart button
And Clicks on cartIcon
Then validate the products present in the cart and title of that product same as homepage

