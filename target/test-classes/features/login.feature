#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

      
Feature: Login      

Scenario: Login exitoso

	Given el usuario abre el navegador 
	When navega al sitio "https://www.saucedemo.com/"
	And ingresa usuario "standard_user" y contraseña "secret_sauce"
	Then deberia ver el titulo "Swag Labs"
	
