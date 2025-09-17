Feature: User Forgotten Password
  Given the user needs recovery the password


  @ForgottenPasswordSuccess
  Scenario Outline: User Login success
    Given the user enter main page
    When the user fills the fields to recovery password with success
      | email   |
      | <email> |
    Then the user recovery success

    Examples:
      | email              |
       ##@externaldata@./src/test/resources/datadriven/test.xlsx@recovery@
      | test2025@gmail.com |

