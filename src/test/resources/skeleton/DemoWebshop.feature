Feature: Login
This is to test the login feature of theDemoWebshop Page
Cucumber can be used to write both code and documentation.


Scenario: Valid login
Given the user is in the Demo Webshop page
And user clicks on Login button
When the user gives valid credentials
Then user should be able to login
And user should be able to view the product details page