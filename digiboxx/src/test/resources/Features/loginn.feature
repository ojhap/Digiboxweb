Feature: feature to test login  and upload file functionality

  Background: check login successfull with valid credentials
    Given user is on login page
    When user passes valid spacename username and password
    Then clicks on login button
    

   @createfolder @uploadfile
  Scenario: Check login user is able to create folder
  When user clicks on add button
  Then clicks on add folder
  And user gives folder name
  Then click on create  button
  
  @uploadfile
  Scenario: Check login user is able to upload file
  When user clicks on desired folder
  And  choose the add option
  Then clicks on upload files
  
  @filter
  Scenario: Check  user is able to use filter option
  When user clicks on filter option
  Then  choose the name filter option
  And  choose the size filter option
  Then clicks on apply button
   
  