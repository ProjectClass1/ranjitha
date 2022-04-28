Feature: validating  login of adactinhotel Application.
Scenario: Validating logn with correct username and correct password.
Given User is on AdactinHotel Application on Chrome Browser.
When user enter"<username"> and "<password>".
And user should click on login button.
Then user should verify homepage is displayed or not
