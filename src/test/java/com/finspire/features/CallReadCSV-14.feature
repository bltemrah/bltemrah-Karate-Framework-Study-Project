Feature: API test

  Background:
    * url 'https://fakerestapi.azurewebsites.net'
    * header Content-Type = 'application/json'
    * header Accept = 'application/json'


  Scenario Outline:  Call and read CSV file in examples
    Given path "/api/v1/Users"
    And request
    """
    {
      "id": '<id>',
      "userName": '<userName>',
      "password": '<password>'
    }
    """
    When method POST
    Then status 200
    And print response
    Then match response == {"id" : "#number", "userName" : "#string","password" : "#string"}

    Examples:
      | read('src/test/java/com/finspire/data/users.csv') |
