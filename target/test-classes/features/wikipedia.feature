Feature: Wikipedia search feature

  @wikipedia
  Scenario: Wikipedia title verification using search boz feature
    Given User is on Wikipedia Homepage
    When User types "Steve Jobs" in the  wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the  wiki title


  Scenario: Wikipedia title verification using search boz feature
    Given User is on Wikipedia Homepage
    When User types "Steve Jobs" in the  wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header



  Scenario: Wikipedia title verification using search boz feature
    Given User is on Wikipedia Homepage
    When User types "Steve Jobs" in the  wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the  image header