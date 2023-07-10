Feature: Create a rich text note
  As a user
  I want to be able to create a rich text note
  To highlight certain elements with bold text


  Scenario Outline: Create a note with bold text
    Given I am on the note creation page
    When I enter the  "<nota>"
    Then I see the saved note with the text highlighted in bold

    Examples:
      | nota |
      | This is an important note that needs to be highlighted |