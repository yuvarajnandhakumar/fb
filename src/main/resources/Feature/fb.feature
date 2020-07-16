#Author: yuvaraj
Feature: My first feature file

  Background: Chrome launch
    Given launching chrome browser

  Scenario: Launch Fb
    Given User launches fb
    Then user enter username as "ashok@gmail.com" and password "ashok78687"
    #And Verify the Title
    #When User enters uname
    #And user enters pwd
    #Then user click submit button
    
    

    #Scenario: Launch Flipkart
    #Given User launches Flipkart site
