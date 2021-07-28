Feature: Login user and change address

  Scenario Outline: Login user
    Given Page https://qloapps.coderslab.pl/en/ opened in browser
    When Click 'Sign in' link
    And Enter user credentials '<emailAddress>' and '<password>'
    And Click 'Sign in' button
    And Click 'My addresses'
    And Click 'Add new address'
    And Enter company '<company>'
    And Enter address '<address>'
    And Enter zip '<zip>'
    And Enter city '<city>'
    And Enter phone '<phone>'
    And Enter additional information '<info>'
    And Fill the form
    And Click 'Save'
    And User data are displayed in a browser
    Then Delete user

    Examples:
      |emailAddress          |password|company   |address |zip   |city  |phone     |info     |
      |test2@testdotcome2.com|pass123 |Coders Lab|Polna 23|77-500|Warsaw|7776118254|only vip |

#  strona główna
#  przycisk 'Sign in'
#  przycisk Create an account
#  wypełnienie formularza
#  przycisk Register