@ta @ust @dms
 Feature: Login:- Validating the count in ALL RRs

    @ust @dms  
 	Scenario Outline: All RRs :- Validating the Count of All RRs
			Given User should navigate to Opportunities page.
 			Then Click on All RRs option in dashboard.
 			Then Select "<Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			
 		Examples:
 		|	Option  				   |
 		| Created 					   |
 		#| Submitted for Approval       |
 		| Approved by RM Only	 	   |
 		#| Approved by Cost Center Only |
 		| Edits Requested			   |
 		| Cancelled					   |
 		| Rejected					   |
 		
 		
 		
 	@ust @dms  
 	Scenario Outline: All RRs :- Validating the Count of All RRs
 			Given User should navigate to Opportunities page.
 			Then Click on All RRs option in dashboard.
			Then Select "<Option>" projects "<AXA Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<Data Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<Invoicing Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<Enterprise Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<InfoImage Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<MS Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<Share Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			Then Select "<Option>" projects "<Zee Option>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 		
 		Examples:
 		| Option	|	AXA Option             |   Data Option											 | Invoicing Option           | Enterprise Option                           | InfoImage Option                        | MS Option       | Share Option        | Zee Option                         |
 		| Created	| AXA Ariba Implementation | Database Systems Administrator Oracle Product Support   |E-Invoicing Implementation  |Enterprise Computing - Project Management	|InfoImage Support & Maintenance project  | MS Dynamics AX  |Share Point Project  |Zee Medical Sales Force Automation  |
 		
 
   @ust @dms  
	Scenario Outline: All RRs :- Validating the Count of All RRs
 			Given User should navigate to Opportunities page.
 			Then Click on All RRs option in dashboard.
 			Then Select "<Option>" projects "<AXA Option>" and "<Account>" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner.
 			
 		Examples:
 		| Option	|	AXA Option             | Account              |
 		| Created	| AXA Ariba Implementation | Quality Assurance    |
 		
 	
 			
           
 		
 			