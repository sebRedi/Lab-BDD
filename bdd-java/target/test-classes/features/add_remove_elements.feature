Feature: Add and Remove Elements

  Scenario: Add a delete button and remove it
    Given I am on the Add Remove Elements page
    When I click the Add Element button
    Then I should see a Delete button
    When I click the Delete button
    Then I should not see any Delete button