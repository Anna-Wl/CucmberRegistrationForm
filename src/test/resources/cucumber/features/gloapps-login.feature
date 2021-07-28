Feature: Login user and change address

  Scenario: Login user
    Given Page https://qloapps.coderslab.pl/en/ opened in browser
    When Click 'Sign in' link
    And Enter user credentials 'test2@testdotcome2.com' and 'pass123'
    And Click 'Sign in' button
    And Click 'My addresses'
    And Click 'Add new address'
    And Enter company 'Coders Lab'
    And Enter address 'Polna 23'
    And Enter zip '77-500'
    And Enter city 'Warsaw'
    And Enter phone '7776118254'
    And Enter additional information 'only vip'
    And Fill the form
    And Click 'Save'
    And User data are displayed in a browser
    Then Delete user


#  strona główna
#  przycisk 'Sign in'
#  przycisk Create an account
#  wypełnienie formularza
#  przycisk Register