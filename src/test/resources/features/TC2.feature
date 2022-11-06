Feature: Multiple keyword search
  #To see whether Wikipedia can narrow down search results in the given way

  Scenario: Choosing multiple filters
    Given user is on search page

    When user clicks on Advanced Search
    And user writes kw2 in the Not These Words Box under Search in Page Text
    And user writes kw1 in Page Title Contains box under Structure
    And user chooses ch1 from File Type under Files and Images
    And user chooses ch2 from Sorting Order under Sorting Order
    And user writes kw1 in Search Box
    And the user hits Search
    Then user gets res1 in the results


  #kw1: Roman Empire
  #kw2: church
  #ch1: video
  #ch2: relevance
  #res1: Roman Empire map.ogv