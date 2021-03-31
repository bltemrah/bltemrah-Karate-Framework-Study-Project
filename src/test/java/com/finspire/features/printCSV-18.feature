Feature: Read csv file

  Scenario: Print out csv file
    * def a = read ('com/finspire/data/token.csv')
    * print a
