#Author: srilakshmi
#Background: List of steps run before each of the scenarios
Feature: login to demowebshop successful
  I want to use this template for my feature file

 

  Background: 
    Given john launched chrome browser
    And provided demowebshop site url

 

  Scenario: login to demo webshop
    When he clicks on login
    Then he shall be able to provide credentials

 

  Scenario: registering to demo webshop
    When he clicks on register link
    Then he shall be able to provide registration details

 

  Scenario: wishlist in demo webshop
    When he clicks on wishlist
    Then he shall be able to view his wishlist