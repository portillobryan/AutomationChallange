Feature: User Register
  Given the user needs register in the web,
  When they enter their register information,
  Then they register successfully.


  @RegisterSuccess
  Scenario Outline: User register success
    Given the user enter main page
    When the user fills the fields to register with success
      | firstname  | lastname   | email   | telephone   | password   | confirm   |
      | <firstname> | <lastname> | <email> | <telephone> | <password> | <confirm> |
    Then the register successfully

    Examples:
      | firstname | lastname | email                | telephone | password | confirm  |
          ##@externaldata@./src/test/resources/datadriven/test.xlsx@register@
      | test      | test     | test202601@gmail.com | 959859599 | test123@ | test123@ |


