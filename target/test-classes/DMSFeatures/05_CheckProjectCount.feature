@ta @ust @dms
 Feature: Login:- Validating the count of Specific Project

    @ust @dms  
 	Scenario Outline: Projects :- Validating the Count of Specific Project
 	       Given User should navigate to Opportunities page.
 	       Then Click on Projects link in the DashBoard.
 	       Then Select the Specific "<Project>" and click on view RRs.
 	       Then Validate the number of "<Projects>" listed in the table is equal to the count displaying on top.
 			
 		Examples:
 		|	Project  				   		 |
 		| Zee Medical Sales Force Automation |
 		