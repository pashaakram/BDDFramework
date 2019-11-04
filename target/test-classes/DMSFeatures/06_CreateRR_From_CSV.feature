@ta @iwo
 Feature: CreateRR:- Create RR Via CSV file

	# csv file should always saved in this location C:\Edge_Networks\EdgeNetworks\Data\Data.csv 
 	Scenario Outline: Via CSV :- Upload a CSV file and check if it is possible to create a RR.
			Given User should navigate to Opportunities page.
 			Then Click on Create RR via csv option in dashboard.
 			Then Try to upload the csv file .
 			Then Once the RR is created click on the View button of respective RR created.
 			Then Wait for the Preview page to appear since other fields are not entered try to enter the details.
 			Then Enter Opportunity and Project details page should appear and enter a "<opportunity>" code for which a demand to be created.
 			Then Select the "<RR Initiator>","<Primary RM>","<Engagement Type>","<Project Name>" and "<SO Type>","<Emp_id>" from drop down's and click next.
    		Then The to select the range page should display and select the "<From>" and "<To>" date from the calendar.
    		Then Select whether the extension should be "No","Weeks" and "30".
    		Then User enters the Resource Requirement details "<Designation>","<Primary Skill>","<Secondary Skill>" and "<Grade>" click on next button.
 			
 	 Examples:
      | opportunity     |Designation			 | Primary Skill								| Secondary Skill		 | Grade | RR Initiator | Primary RM				 | Engagement Type 	   | Project Name		   | SO Type		|Emp_id | From        | To          | Location 					  |Internal Interview | Hiring Manager | Delivery Manager | Interviewer | Client Interview | Mode Of Interview | Client Accepted Resource | BGV | Force_Approve | Approval_Status  |
      | OPP-0000000029  |Applications Consultant | Business Analyst-Business Case Development   |Architect-DevOps-Digital| L2    | dmsadmin	    |  Anupam Choudhari 		 | Strategic Staffing  |Share Point Project	   |Proactive Hiring| 31001 |11-Oct-2019  | 28-Oct-2019 | Bangalore, Karnataka, India | Yes				  | Chandru		   | Raghav Salotra	  | Sam Smith	| Yes			   | Face to Face	   | CAN Term				  | No  | Force_Approve | Approved	       |
   	
 		