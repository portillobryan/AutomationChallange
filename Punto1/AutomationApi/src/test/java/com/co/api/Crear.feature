Feature: Validar la funcionalidad crear los productos
Given que el admnistrador necesita realizar una creación
When realiza la peticion con los datos obligatorios
Then realiza la creacion de manera exitosa

  Background:
    * configure ssl = true
    And header Content-Type = 'application/json'
    * def schemaUtil = Java.type('com.co.util.JsonSchemaUtil')

  @crear @crearProduct @01
  Scenario: Crear un producto válido.

    Given url urlApi
    And path '/products'
    * def req = read('../jsonBody/crear/bodyRequest.json')
    And request req
    When method post
    Then status 201
    * string schemaExpect = read('../schema/crear/schemaExitoso.json')
    * string schemaObt = response
    * assert schemaUtil.isValid(schemaExpect, schemaObt)
    * def idproducto = response.id


    #esto es un escenario de Error, debido a que la api de prueba siempre responde exitoso, se deja validando el status 201, si fuera una api real, se valida el status y el repsonse
  @crear @crearProduct @error
  Scenario: Crear producto con datos inválidos.

    Given url urlApi
    And path '/products'
    * def req = read('../jsonBody/crear/bodyRequestError.json')
    And request req
    When method post
    Then status 201