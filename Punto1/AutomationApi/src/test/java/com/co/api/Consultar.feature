Feature: Validar la funcionalidad consultar los productos
Given que el admnistrador necesita realizar una consulta
When realiza la consulta por producto o categoria
Then muestra la información requerida.

Background:
    * configure ssl = true
    And header Content-Type = 'application/json'
  * def schemaUtil = Java.type('com.co.util.JsonSchemaUtil')

  @consultar @consultarCategory @success
  Scenario: Consultar productos de la categoría 'electronics'.

    Given url urlApi
    And path '/products/category/electronics'
    When method get
    Then status 200
    And match response[0].category == 'electronics'

  @consultar @consultarCategory @error
  Scenario: Consultar una categoría inexistente.

    Given url urlApi
    And path '/products/category/electroasasnics'
    When method get
    Then status 200
    And match response == []


  @consultar @consultarProduct @success
  Scenario: Consultar un producto existente.

    Given url urlApi
    And path '/products/9'
    When method get
    Then status 200
    * string schemaExpect = read('../schema/consultar/schemaExitoso.json')
    * string schemaObt = response
    * assert schemaUtil.isValid(schemaExpect, schemaObt)

  @consultar @consultarProduct @error
  Scenario: Consultar un producto existente.

    Given url urlApi
    And path '/products/913212'
    When method get
    Then status 200
    And match response == ''