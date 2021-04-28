
Feature: Switching languages on the homepage of the application
  @wip
  Scenario: The user can see 3 more languages in addition to English which is the default Language
    Given   the user navigates to the homepage of the application
    When    the user clicks on "Languages Dropdown"
    Then    the user should be able to see:
      | DK |
      | FI |
      | SE |

    @wip
    Scenario: the user Switches the language
      Given the user navigates to the homepage of the application
      When the user clicks on "Languages Dropdown"
      Then the user can switch the language from "English" to "Swedish"

