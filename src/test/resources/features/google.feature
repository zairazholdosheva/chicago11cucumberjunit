@back
  Feature: Google title verification
    #Google title verification
    Background: Login to google
      When User is on google Search page
    @googleTitle


  Scenario:Google title verification
    When User is on Google search page
    And User searches for apple
    Then User should see apple inside of the title
    And User goes to amazon website

      @new
    Scenario: Google title verification with preferred data
      When User is on Google search page
      And User searches for a word "apple"
      Then User should see a word "apple" inside of the title




