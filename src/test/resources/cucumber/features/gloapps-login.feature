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
    And Delete user
    Then Logout the user

    Examples:
      |emailAddress          |password |company   |address     |zip   |city  |phone     |info        |
      |test2@testdotcome2.com|pass123  |Coders Lab|Polna 23    |77-500|Warsaw|7776115254|only vip    |
#      |test23@emailtest.com  |pas 147  |Samsung   |Zdunska 12  |04-500|Cracow|7788858211|free drinks |
#      |karo23@emailtest.com  |pass 899#|Sony      |Krakowska 12|14-500|Gdansk|7489968252|free food   |


#  strona główna
#  przycisk 'Sign in'
#  przycisk Create an account
#  wypełnienie formularza
#  przycisk Register