Feature: Text search in DuckDuckgo

  Scenario Outline: Create user account
    Given Page https://qloapps.coderslab.pl/en/ opened in browser
    When Click 'Sign in' button
    And Create and account
    And Choose title <title>
    And Enter name '<name>'
    And Enter surname '<surname>'
    And Enter password '<password>'
    And Enter day of birth '<day>'
    And Enter month of birth '<month>'
    And Enter year of birth '<year>'
    And Set newsletter <newsletter>
    And Set SpecialOffers <specialOffers>
    And Fill the form
    And Click 'Register' button
    Then User name displayed in a browser

    Examples:
    | title | name     | surname     | password | day | month    | year | newsletter | specialOffers |
    | false | Karolina | Maciejewska | pass 899#| 28  | JANUARY  | 1999 | true       | true          |
    | true  | Jan      | Kowalski    | pass123  | 22  | APRIL    | 1995 | true       | false         |
    | false | Aga      | Dabrowska   | pas 147  | 12  | NOVEMBER | 1986 | false      | true          |

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

  # Do zadania 2 należy dodać parametry w następujących polach w formularzu:

  # first name
  # last name
  # email (pole e-mail wykorzystywane jest już na ekranie 'Sign in')
  # password
  # Dodanie parametrów pozwoli tworzyć wielu użytkowników w ramach jednego skryptu testowego.