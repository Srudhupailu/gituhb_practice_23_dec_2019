Feature: Login
This is to test the login feature of the application created.
Cucumber can be used to write both code and documentation.


Scenario Outline: Valid login multiple users
Given the user is in the Demo Webshop page
When the user gives valid id "<Email>" and "<Password>"
Then relevant login username is displayed
Examples:
|Email|Password|
|shruthapillai@gmail.com|Shrutha02|
|shruthipillai@gmail.com|Shruthi02|


