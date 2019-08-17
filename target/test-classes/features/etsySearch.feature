Feature: Etsy search feature
  @etsy
  Scenario: Etsy title verification using search feature
  Given   User is on Etsy Homepage
  When User types "Wooden Spoon" in the search box
  And  User clicks search button
  Then User sees "Wooden Spoon" is in the title

