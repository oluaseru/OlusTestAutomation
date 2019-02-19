Feature: searching
  As a potential customer of Clear Channel
  I want to be able to search the website
  So that I can find the information I am looking for

  Background:
    Given I'm on the the Clear Channel website "https://www.clearchannelinternational.com"

  @search
  Scenario Outline: User should be able to use the main search to find relevant information
    When I enter "<searchTerm>" into main search
    Then Results page title should contain "<searchTerm>"
    And I should see results displayed

    Examples:
      |searchTerm|
      |Test      |
      |Mobile    |

  @search
  Scenario Outline: Enter invalid searchTerms such as special characters should not display any results
    When I enter "<invalidTerm>" into main search
    Then an error page be should be displayed
    And I should be able to return to previous Page

    Examples:
      |invalidTerm|
      |£@         |
      |)(         |
      |           |

    @search
    Scenario Outline: when User clicks on any of the result links then navigates back, results should be maintained
      When I enter "<searchTerm>" into main search
      And I click on search result link 1
      Then I should be able to navigate to the corresponding page
      And navigate back to my results page

      Examples:
        |searchTerm|
        |mobile    |


  @search
  Scenario Outline: When a user enter a valid searchTerm which has no results, an informative message should be displayed
    When I enter "<searchTerm>" into main search
    And there are no results
    Then a "No results found." message should be displayed

    Examples:
      |searchTerm|
      |startUp   |
