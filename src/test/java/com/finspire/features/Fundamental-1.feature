Feature: Stripe Create User Feature

  @paralel
  Scenario: Printing
    * print  "Some words"
    * print 'My name is',"Karate Kid"
    * print 2+2

  @paralel
  Scenario: Variables
    * def name = 'Emrah'
    * print 'My name is ' + name
    * def age = 20
    * print name, 'is', age, 'years old'

  @paralel
  Scenario: Difficult parameters: json object
    * def student = {'name' : 'Emrah', 'age' : 40}
    * print student
    * print student.name
    * print student.age

  @paralel
  Scenario: Json Object 2
    * def s =
    """
    {
      "firstName" : "A",
      "lastName" : "B",
      "age" : 20
    }
    """
    * print s
    * print s.firstName

  @paralel
  Scenario: Array Object
    * def students =
      """
        [
        {
        'name' : 'Erdem',
        'payment' : false
        },
        {
        'name' : 'Ozlem',
        'payment' : true
        }
        ]
      """
    * print students
    * print students[0].name
    * print students[1].payment




