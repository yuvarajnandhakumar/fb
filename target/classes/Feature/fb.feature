#Author: yuvaraj
Feature: My first feature file

  #Background: Chrome launch
  # Given launching chrome browser
  Scenario Outline: Launch Fb
    Given User launch fb
    And user enters "<username>" and "<password>"
    Then user click submit button
  

    Examples: 
      | username          | password | url            |
      | yuvaraj@gmail.com | asdf@123 | https://fb.com |
     # | vipin@gmail.com   | ss       | https://fb.com |
     # | ashok@gmail.com   | asdf@123 | https://fb.com |
      
      
  #Scenario: Launch Fbclick
    #Then user click submit button
    #And Verify the Title
#
  #When User enters uname
  #And user enters pwd
  #Then user click submit button
  #Scenario: Launch Flipkart
    #Given User launches Flipkart site
