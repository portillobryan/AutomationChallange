Feature: Validar la funcionalidad actualizar la informacion de los productos
Given que el admnistrador necesita realizar una actualizacion
When realiza la peticion con el cambio de la imagen
Then el sistema realiza la actualizacion de manera exitosa

  Background:
    * configure ssl = true
    And header Content-Type = 'application/json'
    * def schemaUtil = Java.type('com.co.util.JsonSchemaUtil')

  @actualizar @actualizarProduct @success
  Scenario: Crear un producto válido.
    * call read('./Crear.feature@01')
    Given url urlApi
    And path '/products/'+idproducto
    * def req = read('../jsonBody/crear/bodyRequest.json')
    * req.image = 'https://imagentest.com.co'
    And request req
    When method put
    Then status 200
    * match response.image == 'https://imagentest.com.co'

  @actualizar @actualizarProduct @error
  Scenario: Crear un producto válido.
    Given url urlApi
    And path '/products/null'
    * def req = read('../jsonBody/crear/bodyRequest.json')
    * req.image = 'https://imagentest.com.co'
    And request req
    When method put
    Then status 400