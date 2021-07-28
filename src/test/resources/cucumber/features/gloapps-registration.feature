Feature: Create user account

  Scenario: Create user account
    Given Page https://qloapps.coderslab.pl/en/ opened in browser
    When Click 'Sign in' button
    And Create and account
    And Choose title false
    And Enter name 'Jan'
    And Enter surname 'Kowalski'
    And Enter password 'pass123'
    And Enter day of birth '22'
    And Enter month of birth
    And Enter year of birth '1995'
    And Set newsletter true
    And Set SpecialOffers false
    And Fill the form
    And Click 'Register' button
    Then User name displayed in a browser


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