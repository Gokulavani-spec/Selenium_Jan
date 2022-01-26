Feature: Test the amazon page
Scenario: Test the login page with valid details
Given :Open CHROME browser and URL of application
When Enter USERNAME, password and click on submit
Then Success in login



Scenario: Test the search page
Given Open CHROME browser and URL of application1
When Enter the search value
Then Success in search



Scenario: Test the add to cart page
Given Open CHROME browser and URL of application2
When add product to cart
Then Success in adding to cart