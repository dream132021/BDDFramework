Feature: Login page Automation 
Scenario Outline: Check login is successful with valid creds
Given User is on login page
When user provides "<username>" and "<password>"
And clicks on submit button
Then user should land on Home Page
And close the browser


Examples:
|username | password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |
