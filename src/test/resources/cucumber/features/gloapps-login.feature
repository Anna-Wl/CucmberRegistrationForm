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

#    And Create and account
#    And Choose title false
#    And Enter name 'Jan'
#    And Enter surname 'Kowalski'
#    And Enter password 'pass123'
#    And Enter day of birth '22'
#    And Enter month of birth
#    And Enter year of birth '1995'
#    And Set newsletter true
#    And Set SpecialOffers false
#    And Fill the form
#    And Click 'Register' button
#    Then User name displayed in a browser


#  .setMr(true)
#  .setFirstName("Robert")
#  .setLastName("Romanowicz")
#  .setPassword("romanow123")
#  .setDays(22)
#  .setMonths(Month.APRIL)
#  .setYears(1995)
#  .setNewsletter(true)
#  .setSpecialOffers(false);

#  strona główna
#  przycisk 'Sign in'
#  przycisk Create an account
#  wypełnienie formularza
#  przycisk Register