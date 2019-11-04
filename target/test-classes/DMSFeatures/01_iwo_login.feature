@ta @dms
Feature: Login:- A user should be logged in only if he/she provides correct credentials and valid error messages should be displayed wherever required
	
  Scenario Outline: Check all negative login scenarios
    Given user launches portal
    And the landing page is displayed with brand name "HIREalchemy"
    When user enters user name "<username>"
    And user enters password "<password>"
    When user clicks on sign in button
    Then proper validation message "<validationMessage>" is displayed when "<condition>"
    
    Examples:

      | username                | password    | validationMessage   			  | condition                                         |
      |                         | welcome@123 | The username field is required.   | user field is empty                               |
      | abcuser@edgenetworks.in |             | The password field is required.   | password field is empty                           |
      | abcuser                 | welcome@123 | user credentials are wrong.       | Credentials entered wrong				          |
      
      
    
    @ta @dms
  Scenario Outline: Login:- Check if a user with correct credentials is able to log in
    Given user launches hire alchemy portal
    And the landing page is displayed with brand name "HIREalchemy"
    When user enters user name "<username>"
    And user enters password "<password>"
    When user clicks on sign in button
    Then user is able to login successfully
    And user is also able to see with his/her logged in name"<initials>"
    Then user logs out

    Examples:
      | username | password       | initials |
      | dmsadmin | dmsadmin@123   |  D       |

 