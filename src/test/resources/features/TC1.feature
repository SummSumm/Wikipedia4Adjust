Feature: Language Recognition Functionality
  #To see whether Wikipedia recognizes words despite special characters and regardless of language, can translate it to English and give the relevant pages in English

  Scenario Template: Using various languages and characters in search bar
    Given user is on search page
    When user clicks on the search bar
    And user writes the "<keyword>"
    And the user hits Search
    Then the search result is the "<English>" version for each

    Examples:
      | keyword                       | English |
      | Orta Doğu Teknik Üniversitesi | East    |
      | Ελλάδα                        | Greece  |
      | Polska                        | Poland  |
      | München                       | Munich  |

