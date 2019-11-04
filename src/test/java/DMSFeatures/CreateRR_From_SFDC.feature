 @ta @ust @dms
 Feature: Login:- Creating a RR from Opportunity SFDC
   
    @ust @dms  
 	Scenario: CreateRR_SFDC :- Create RR with SFDC opportunities with proper required error message
   	 	Given User should navigate to Opportunities page.
    	Then check the count of Opportunities displayed is equal to opportunity in table.
    	Then Search for the specific opportunity and click on create RR.
    	|Quality Assurance |
    	Then Select the RR Initiator and directly click on next button .
    	|dmsadmin	|
    	Then Without going to next page validateMessage message should be displayed where condition .
     
     
     #Force_Approve  can be either RM_Approve/Force_Approve/Rejected/Cost_Approve
    @ust @dms
	Scenario Outline: CreateRR_SFDC :- Create RR with SFDC opportunities with details filled correctly.
		Given User should navigate to Opportunities page.
    	Then check the count of Opportunities displayed is equal to opportunity in table.
    	Then Search for the specific opportunity and click on create RR.
    		 |Quality Assurance |
    	Then Select the "<RR Initiator>","<Primary RM>","<Engagement Type>","<Project Name>" and "<SO Type>","<Emp_id>" from drop down's and click next.
    	Then The to select the range page should display and select the "<From>" and "<To>" date from the calendar.
    	Then Select whether the extension should be "No","Weeks" and "30".
    	Then User enters the Resource Requirement details "<ResourceNumber>","<Designation>","<Primary Skill>","<Secondary Skill>" and "<Grade>" click on next button.   	
    	Then Select the Range of experience and enter the Job Description and Internal Description.
    	And Select the "<Location>" and click next.
    	Then User waits for analysis result to appear and choose option.
    	Then Job Details page should appear and select the "<Internal Interview>","<Hiring Manager>","<Delivery Manager>","<Interviewer>","<Client Interview>","<Mode Of Interview>" and "<Client Accepted Resource>","<BGV>" appropriate options and click on preview button.    		
       	Then Once preview page opens validate the "<RR Initiator>","<SO Type>","<Primary RM>","<Engagement Type>","<Project Name>","<Location>","<Internal Interview>","<Hiring Manager>","<Interviewer>","<Client Interview>","<Mode Of Interview>","<Client Accepted Resource>" and "<BGV>".
    	Then User click on All RR option.
   		Then  Check RR_id whether it exist in table,if so check the status it should be in Created status.
   		Then  If the Status is in Created then Click on respective View button for approval.
   		Then  Check the particular RR is changed to "Submitted for Resource Approval".
   		Then  click on the respective RR View button for "<Force_Approve>" Approval. 
   		Then  check the status of the RR is changed to "<Approval_Status>".
   		Then User navigates to originate RM page and search for RR_ID the specific demand should be seen.
   		Then Click on more details link and validate the "<SO Type>","<Engagement Type>","100" and "Open".
   		Then User clicks on view supply button and search for a "025971" supply .
  		And  Click on the External hire yes option and select all check box's appeared and click ok button'.
#  		Then Navigate to the Operate-TA page.
#  		Then User should login to TA page by providing "<UserName>" and "<Password>" .
#   	Then User lands on Home Page search for the Project "<ProjectName>" and click on the Project.
#		Then Search for the Demand created in DMS with the Preview ID.
#		Then Validate whether the Demand is Available.
		
     Examples:
    | UserName 				   		  | Password       | ProjectName | ResourceNumber|Designation			 | Primary Skill								| Secondary Skill		 | Grade | RR Initiator | Primary RM				 | Engagement Type 	   | Project Name		   | SO Type		|Emp_id | From        | To          | Location 					  |Internal Interview | Hiring Manager | Delivery Manager | Interviewer | Client Interview | Mode Of Interview | Client Accepted Resource | BGV |Force_Approve  | Approval_Status  |
    | manmohan.sharma@edgenetworks.in | Welcome@1234   | UST	     |  12			 |Applications Consultant| Business Analyst-Business Case Development   |Architect-DevOps-Digital| L2    | dmsadmin	    |  Anupam Choudhari 		 | Strategic Staffing  |Share Point Project	   |Proactive Hiring| 31001 |10-Oct-2019  | 24-Oct-2019 | Bangalore, Karnataka, India | No 				  | Chandru		   | Raghav Salotra	  | Sam Smith	| No			   | Face to Face	   | CAN Term				  | No  | Force_Approve | Approved 	       |
  
#Scenario Outline: CreateRR_SFDC :- Connect to Originate TA and check if the Demand that created is available in TA.
#			Given 
#				When User lands on Home Page search for the Project "<ProjectName>" and click on the Project.
#				Then Search for the Demand created in DMS with the Preview ID.
#				Then Validate whether the Demand is Available.
#				#Then Click on the Demand and reduce the Score scroll
#				
#	Examples:
#			| UserName 				   		  | Password       | ProjectName |
#			| manmohan.sharma@edgenetworks.in | Welcome@1234   | UST	     |




