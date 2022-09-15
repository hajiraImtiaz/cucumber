Feature: Wikipedia search functionality and verifications
#WSF-45234

  Scenario: Wikipedia Search Functionality Title Verifications
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User click wiki search button
    Then User sees Steve Jobs is in wiki title