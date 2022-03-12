Feature: Validate Challenging dom application

  Background:
    Given application is launched

  @DomApplicationValidation @ApplicationLaunchValidation
  Scenario: To validate challenging dom application is launched successfully
    Then user should be on the home page
    
  @DomApplicationValidation @ApplicationLaunchValidation
  Scenario: To validate all three buttons are present in application homepage
    Then user should be on the home page and all three buttons are present
    

