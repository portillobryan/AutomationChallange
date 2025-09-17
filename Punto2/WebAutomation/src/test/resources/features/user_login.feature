Feature: User Login
  Given the user needs to make a purchase,
  When they enter their login information,
  Then they login successfully.


  @loginSuccess
  Scenario Outline: User Login success
    Given the user enter main page
    When the user fills the fields to login with success
    |username | password|
    |<username>| <password>|
    Then the user successfully login

    Examples:
      | username           | password |
       ##@externaldata@./src/test/resources/datadriven/test.xlsx@loginsuccess@
      | test2025@gmail.com | test123@ |



  @loginError
  Scenario Outline: User Login with error in the password
    Given the user enter main page
    When the user fills the fields to login with password incorrect
      |username | password|
      |<username>| <password>|
    Then the system show message error

    Examples:
      | username           | password      |
         ##@externaldata@./src/test/resources/datadriven/test.xlsx@loginerror@
      | test2025@gmail.com | test123334534 |