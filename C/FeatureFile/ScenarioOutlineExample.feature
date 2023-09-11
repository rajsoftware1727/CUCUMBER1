Feature: Scenario Outline with Example Keyword
Scenario Outline: outline Example keyword

Given Bharu goto website
When Bharu enter "<uname>" and "<pwd>"
Then Bharu click login
Then Bharu goto login page
Examples:
|uname|pwd|
|mngr525595|masumAr|
|mngr525595|masumAr|