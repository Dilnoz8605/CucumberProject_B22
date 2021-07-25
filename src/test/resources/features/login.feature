@loginFunctionality
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student



  @librarian
Scenario: Librarian login functionality
    Given user is on Cybertek Library App Login page
    When librarian enters correct credentials
    #Correct Credentials: EMAIL - librarian13@library  PASSWORD - 9rf6axdD
    And clicks sign in button
    Then librarian dashboard should be displayed


  @student
  Scenario: Student login functionality
    Given user is on Cybertek Library App Login page
    When student enters correct credentials
    #Correct Credentials: EMAIL - student11@library  PASSWORD - tScBPCUr
    And clicks sign in button
    Then student dashboard should be displayed



