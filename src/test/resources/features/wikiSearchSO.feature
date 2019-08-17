@so
Feature: Wikipedia search feature


  Scenario Outline: Wikipedia title verification using search boz feature
    Given User is on Wikipedia Homepage
    When User types "<searchKey>" in the  wiki search box
    And User clicks wiki search button
    Then User sees "<title>" is in the  wiki title
    Examples: Test data for search functionality
      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Lionel Messi | Lionel Messi |
      | Lady Gaga    | Lady Gaga    |
    #option command L : for aligning pipes automatically
