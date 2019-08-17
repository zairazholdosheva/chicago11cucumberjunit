Feature: Wikipedia search feature
Background: User searched for given text
  @wikipedia
  Scenario: Wikipedia title verification using search boz feature
    Given User is on Wikipedia Homepage
    When User types "Steve Jobs" in the  wiki search box
    And User clicks wiki search button


  Scenario: Wikipedia title verification using search boz feature

    Then User sees "Steve Jobs" is in the main header



  Scenario: Wikipedia title verification using search boz feature

    Then User sees "Steve Jobs" is in the  image header