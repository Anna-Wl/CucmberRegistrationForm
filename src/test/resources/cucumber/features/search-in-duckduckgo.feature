Feature: Text search in DuckDuckgo

  Scenario Outline: Search phrase in DuckduckGo
    Given Page http://duckduckgo.com/ opened in browser
    When Enter phrase '<searchPhrase>' in search input
    And Submit form
    Then First <number> results contain phrase '<searchPhrase>' in the link text

    Examples:
      |searchPhrase|number|
      |Tokyo 2020  |1     |
