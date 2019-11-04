@ta @ust @dms
 Feature: IWO :- Filter Validation in IWO
 	
# 	 @ust @dms  
# 	Scenario Outline: IWO :- Validate All Filter present in iwo page 
# 		Given User should navigate to Opportunities page.
# 		Then User navigates to iwo page.
# 		Then Validate the Filters present on iwo page "<Cost_Center>","<Experience_Lower>","<Experience_Upper>","<PayBand>","<Practice>","<RR_Type>","<Visa_Type>"
#  		
# 		Examples:
# 		| Cost_Center | Experience_Lower | Experience_Upper | PayBand | Practice | RR_Type | Visa_Type | 
# 		| COST CENTER | EXPERIENCE LOWER | EXPERIENCE UPPER | PAYBAND | PRACTICE | RR TYPE | VISA TYPE | 
# 		
# 		
# 		 @ust @dms  
# 	Scenario Outline: IWO :- Select different filters in IWO.
# 		Given User should navigate to Opportunities page.
#		Then User navigates to iwo page.
# 		Then Select any filter "<FilterSelectCost>" ,"<FilterCost>" from drop down.
# 		Then Select any filter "<FilterSelectPayBand>" ,"<FilterPayBand>" from drop down.
# 		Then Select any filter "<FilterSelectPractice>" ,"<FilterPractice>" from drop down.
# 		Then Select any filter "<FilterSelectRRType>" ,"<FilterPayBandRRType>" from drop down.
# 		Then Select any filter "<FilterSelectVisa>" ,"<FilterPayVisa>" from drop down.
#  		
# 		Examples:
# 		 | FilterSelectCost | FilterCost 				     | FilterSelectPayBand | FilterPayBand | FilterSelectPractice | FilterPractice 						  |  FilterSelectRRType |FilterPayBandRRType | FilterSelectVisa | FilterPayVisa |
# 		 | cost center	    | FA: Staffing Philly Operations |  payband			   | L2			   | practice             | Enterprise Application Services (EAS) | rr type				| Proactive Hiring   | visa type        | H-1B (US)		|
# 		 
#		 
 		 
 		 @ust @dms  
 	Scenario Outline: IWO :- Validate All Filter present in iwo page 
 		Given User should navigate to Opportunities page.
 		Then User navigates to iwo page.
  		Then Select the "<OpenStatus>" from DropDown and validate that same status RR are appearing by clicking on More Details.
  		Then Select the "<OnHoldStatus>" from DropDown and validate that same status RR are appearing by clicking on More Details.
  		Then Select the "<ArchiveStatus>" from DropDown and validate that same status RR are appearing by clicking on More Details.
  		Then Select the "<FulfilledStatus>" from DropDown and validate that same status RR are appearing by clicking on More Details.
  		Then Search for a particular "<RR>" and validate whether the searched RR is present.
  		
 		Examples:
 		 | OpenStatus | OnHoldStatus | ArchiveStatus | FulfilledStatus | RR         |
 		 | Open		  | On-Hold		 | Archive       | Fulfilled	   |1000001123  |
 		