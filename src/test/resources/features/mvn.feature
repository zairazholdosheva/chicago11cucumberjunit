@mvnrepository
  Feature: Cucumber java verification
    Scenario: User is on mvnrepository page
    And User searches for "cucumber java"
    Then User should see  "Cucumber JVM: Java" is in the first result