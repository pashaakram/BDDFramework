package com.edgenetworks.excelvalues;

import com.edgenetworks.common.GenericMethods;

public class LeadModuleChartCal 
{
	public static void YTD_Attr(String ColumnName,String filePath,String month) throws Exception
	{
		double value=GenericMethods.readdatafromExcelusingcolumnName(filePath,ColumnName, month);
		double pervalue=value*100;
		System.out.println("YTD ATTR Aggregation for "+month+" : "+pervalue);
		
	}
	
	public static void MON_Attr(String ColumnName,String filePath,String month) throws Exception
	{
		double value=GenericMethods.readdatafromExcelusingcolumnName(filePath,ColumnName, month);
		double pervalue=value*100;
		System.out.println("MON ATTR Aggregation for "+month+" : "+pervalue);
		
	}
	
	public static void revenuePerEmloyee(String filePath,String revenueColumnName,String chc_ColumnName,String month) throws Exception
	{
		double revenue=GenericMethods.readdatafromExcelAggregateColumn(filePath, revenueColumnName, chc_ColumnName, month);
		System.out.println("Revenue Per Employee for "+month+" :"+revenue);
	}
	
	public static void revenuePerEmloyeeM5(String filePath,String revenueColumnName,String chc_ColumnName,String month) throws Exception
	{
		double revenue=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, revenueColumnName, chc_ColumnName, month);
		System.out.println("Revenue Per Employee for "+month+" :"+revenue);
	}
	
	
	
	public static void employeeCostRevenue(String filePath,String revenueColumnName,String chc_ColumnName,String month) throws Exception
	{
		double revenue=GenericMethods.readdatafromExcelusingcolumnName(filePath,revenueColumnName,month);
		double cost=GenericMethods.readdatafromExcelusingcolumnName(filePath,chc_ColumnName,month);
		double sum= (cost/revenue);
		System.out.println("Employee Cost Revenue "+month+" :"+sum);
	}
	
	public static void costPerEmployee(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		double cost=GenericMethods.readdatafromExcelAggregateColumn(filePath, ColumnName, ColumnName1, month);
	 	System.out.println("Cost Per Employee "+month+" :"+cost);
	 	
	}
	
	public static void costPerEmployeeM5(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		double cost=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, ColumnName, ColumnName1, month);
	 	System.out.println("Cost Per Employee "+month+" :"+cost);
	 	
	}
	
	public static void utilizationChart(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		double utilization=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, ColumnName, ColumnName1, month);
	 	System.out.println("Utilization for  "+month+" :"+utilization);
	 	
	}
	
	public static void perSOFulfillmentChart(String filePath,String SO_FColumnName,String SO_RColumnName,String month) throws Exception
	{
		double SO_F=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FColumnName,month);
		double SO_R=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_RColumnName,month);
		double sum= (SO_F/SO_R);
		double perSO_Fullfillment=sum*100;
		System.out.println("SO Fulfillment "+month+" :"+perSO_Fullfillment);
	}
	
	public static void perForecastSOChart(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		double forecastSO=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, ColumnName, ColumnName1, month);
		double perForeCastSO=forecastSO*100;
	 	System.out.println("% of Forecast SO for  "+month+" :"+perForeCastSO);
	 	
	}
	
	public static void perEmployeeMobilityIndexChart(String filePath,String EMP_ROTColumnName,String EMP_ROT_DUEColumnName,String month) throws Exception
	{
		double EMP_ROT=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_ROTColumnName,month);
		double EMP_ROT_DUE=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_ROT_DUEColumnName,month);
		double sum= (EMP_ROT/EMP_ROT_DUE);
		double perEmployeeMobilityIndex=sum*100;
		System.out.println("Employee Mobility Index for "+month+" :"+perEmployeeMobilityIndex);
	}
	
	public static void perJuniorizationChart(String filePath,String SO_F_JColumn,String SO_FColumn,String month) throws Exception
	{
		double Juniorization=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_F_JColumn, SO_FColumn, month);
		double perJuniorization=Juniorization*100;
	 	System.out.println("Juniorization for  "+month+" :"+perJuniorization);
	 	
	}
	
	public static void perSO_OrderingChart(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		//double SO_Ordering=ColumnCalMethods.readdatafromExcelAggregateColumnValue(filePath, ColumnName, ColumnName1, month);
		double SO_C=GenericMethods.readdatafromExcelusingcolumnName(filePath,ColumnName,month);
		double SO_R=GenericMethods.readdatafromExcelusingcolumnName(filePath,ColumnName1,month);
		double sum = (SO_C/SO_R)+1;
		double perSO_Ordering=sum*100;
	 	System.out.println("SO Overordering  "+month+" :"+perSO_Ordering);
	 	
	}
	
	public static void perLearningEffectivenessChart(String filePath,String EMP_TRAN_N_FULLColumn,String EMP_TRAN_MTOColumn,String EMP_TRAN_MTSColumn,String EMP_TRANColumn,String month) throws Exception
	{
		double EMP_TRAN_N_FULL=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_N_FULLColumn,month);
		double EMP_TRAN_MTO=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_MTOColumn,month);
		double EMP_TRAN_MTS=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_MTSColumn,month);
		double EMP_TRAN=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRANColumn,month);
		double sum= (EMP_TRAN_N_FULL/(EMP_TRAN_MTO+EMP_TRAN_MTS+EMP_TRAN));
		double percentage= sum*100;
		System.out.println("Learning Effectiveness for "+month+" :"+percentage);
	}
	
	
	
	public static void perForecastEffectivenessChart(String filePath,String ColumnName,String ColumnName1,String month) throws Exception
	{
		double forecastEffective=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, ColumnName, ColumnName1, month);
		double perForecastEffective=forecastEffective*100;
	 	System.out.println("Forecast Effectiveness  "+month+" :"+perForecastEffective);
	 	
	}
	
	public static void fulfillmentFromBenchChart(String filePath,String SO_FIBColumnName,String SO_FIColumnName,String month) throws Exception
	{
		double SO_FIB=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FIBColumnName,month);
		double SO_FI=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FIColumnName,month);
		double sum= (SO_FIB/SO_FI);
		double percentage= sum*100;
		System.out.println("Fulfillment from Bench "+month+" :"+percentage);
	}
	
	public static void benchAgingChart(String filePath,String B_AWDColumn,String EMP_IN_CTCColumn,String month) throws Exception
	{
		double B_AWD=GenericMethods.readdatafromExcelusingcolumnName(filePath,B_AWDColumn,month);
		double EMP_IN_CTC=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_IN_CTCColumn,month);
		double sum= (B_AWD/EMP_IN_CTC);
		System.out.println("Bench aging (in working days) for "+month+" :"+sum);
	}
	
	/*public static void fulfillmentFromBenchChartM5(String filePath,String SO_FIBColumnName,String SO_FIColumnName,String month) throws Exception
	{
		double fulfill=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FIBColumnName, SO_FIColumnName, month);
		double percentage= fulfill*100;
		System.out.println("Employee Cost Revenue "+month+" :"+percentage);
	}*/
	
	public static void employeeReferralChannelChart(String filePath,String SO_FEVERColumnName,String SO_FEColumnName,String month) throws Exception
	{
		double SO_FEVER=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEVERColumnName,month);
		double SO_FE=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEColumnName,month);
		double sum= (SO_FEVER/SO_FE);
		double percentage= sum*100;
		System.out.println("Channel Mix [Employee] "+month+" :"+percentage);
	}
	
	public static void recruiterReferralChannelChart(String filePath,String SO_FEVRColumnName,String SO_FEColumnName,String month) throws Exception
	{
		double SO_FEVR=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEVRColumnName,month);
		double SO_FE=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEColumnName,month);
		double sum= (SO_FEVR/SO_FE);
		double percentage= sum*100;
		System.out.println("Channel Mix [Recruiter] "+month+" :"+percentage);
	}
	
	public static void vendorReferralChannelChart(String filePath,String SO_FEVVColumnName,String SO_FEColumnName,String month) throws Exception
	{
		double SO_FEVV=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEVVColumnName,month);
		double SO_FE=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEColumnName,month);
		double sum= (SO_FEVV/SO_FE);
		double percentage= sum*100;
		System.out.println("Channel Mix [Vendor] "+month+" :"+percentage);
	}
	
	public static void perMarkedExternalChart(String filePath,String SO_MTEColumnName,String SO_RColumnName,String month) throws Exception
	{
		double markedExternal=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_MTEColumnName, SO_RColumnName, month);
		double permarkedExternal=markedExternal*100;
	 	System.out.println(" % Marked to External  "+month+" :"+permarkedExternal);
	 	
	}
	
	public static void sourceByExternalChart(String filePath,String SO_FEColumnName,String SO_FColumnName,String month) throws Exception
	{
		double sum=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FEColumnName, SO_FColumnName, month);
		//double SO_FE=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FEColumnName,month);
		//double SO_F=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FColumnName,month);
		//double sum= (SO_FE/SO_F);
		double percentage= sum*100;
		System.out.println("Sourced By External "+month+" :"+percentage);
	}
	
	public static void forecastSOCancellationChart(String filePath,String FSO_CColumnName,String FSO_RColumnName,String month) throws Exception
	{
		double FSO_C=GenericMethods.readdatafromExcelusingcolumnName(filePath,FSO_CColumnName,month);
		double FSO_R=GenericMethods.readdatafromExcelusingcolumnName(filePath,FSO_RColumnName,month);
		double sum= (FSO_C/FSO_R);
		double percentage= sum*100;
		System.out.println("Forecasting => Forecasted SO Cancellation % "+month+" :"+percentage);
	}
	
	public static void SOCancellationChart(String filePath,String SO_CColumnName,String SO_RColumnName,String month) throws Exception
	{
		double SO_C=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_CColumnName,month);
		double SO_R=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_RColumnName,month);
		double sum= (SO_C/SO_R);
		double percentage= sum*100;
		System.out.println("SO Ordering => SO Cancellation % "+month+" :"+percentage);
	}
	
	public static void releaseNonComplianceChart(String filePath,String EMP_NOT_ROTColumnName,String EMP_ROT_DUEColumnName,String month) throws Exception
	{
		double EMP_NOT_ROT=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_NOT_ROTColumnName,month);
		double EMP_ROT_DUE=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_ROT_DUEColumnName,month);
		double sum= (EMP_NOT_ROT/EMP_ROT_DUE);
		double percentage= sum*100;
		System.out.println("Workforce => Release Non Compliance "+month+" :"+percentage);
	}
	
	
	public static void perSOModifiedChart(String filePath,String SO_MColumnName,String SO_RColumnName,String month) throws Exception
	{
		double SO_Modified=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_MColumnName, SO_RColumnName, month);
		double perSO_Modified=SO_Modified*100;
	 	System.out.println("Process =>SO Ordering =>SO Modified %  "+month+" :"+perSO_Modified);
	 	
	}
	
	
	
	public static void perSOModifiedSignificantlyChart(String filePath,String SO_MSColumnName,String SO_RColumnName,String month) throws Exception
	{
		double SO_ModifiedSignificantly=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_MSColumnName, SO_RColumnName, month);
		double perSO_Modified=SO_ModifiedSignificantly*100;
	 	System.out.println("Process =>SO Ordering =>SO Modified Significantly %  "+month+" :"+perSO_Modified);
	 	
	}
	
	public static void perStrengthInternalChart(String filePath,String SO_FIColumnName,String SO_FColumnName,String month) throws Exception
	{
		double StrengthInternal=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FIColumnName, SO_FColumnName, month);
		double perStrengthInternal=StrengthInternal*100;
	 	System.out.println("Process =>Matching - Internal Fulfillment =>Strength of Internal Capacity  "+month+" :"+perStrengthInternal);
	 	
	}
	
	public static void perTimeAdherenceChart(String filePath,String SO_FTColumnName,String SO_FColumnName,String month) throws Exception
	{
		double TimeAdherence=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FTColumnName, SO_FColumnName, month);
		double perTimeAdherence=TimeAdherence*100;
	 	System.out.println("Process =>Matching - Internal Fulfillment =>Timeline Adherence  "+month+" :"+perTimeAdherence);
	 	
	}
	
	public static void perDemandAgingChart(String filePath,String SO_UFColumn,String SO_FB2WBSDColumn,String SO_RColumn,String month) throws Exception
	{
		double SO_UF=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_UFColumn,month);
		double SO_FB2WBSD=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_FB2WBSDColumn,month);
		double SO_R=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_RColumn,month);
		double sum= ((SO_UF+SO_FB2WBSD)/SO_R);
		double percentage= sum*100;
		System.out.println("Process =>Matching - Internal Fulfillment =>Demand Aging "+month+" :"+percentage);
	}
	
	
	public static void perMTO_EffectivenessChart(String filePath,String EMP_TRAN_N_FULL_MTOColumn,String EMP_TRAN_MTOColumn,String month) throws Exception
	{
		double EMP_TRAN_N_FULL_MTO=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_N_FULL_MTOColumn,month);
		double EMP_TRAN_MTO=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_MTOColumn,month);
		double sum= (EMP_TRAN_N_FULL_MTO/EMP_TRAN_MTO);
		double percentage= sum*100;
		System.out.println("MTO Effectiveness for "+month+" :"+percentage);
	 	
	}
	
	public static void perMTS_EffectivenessChart(String filePath,String EMP_TRAN_N_FULL_MTSColumn,String EMP_TRAN_MTSColumn,String month) throws Exception
	{
		double EMP_TRAN_N_FULL_MTS=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_N_FULL_MTSColumn,month);
		double EMP_TRAN_MTS=GenericMethods.readdatafromExcelusingcolumnName(filePath,EMP_TRAN_MTSColumn,month);
		double sum= (EMP_TRAN_N_FULL_MTS/EMP_TRAN_MTS);
		double percentage= sum*100;
		System.out.println("MTS Redeployment for "+month+" :"+percentage);
	 	
	}
	
	public static void averageLeadTimeChart(String filePath,String SO_ALTColumn,String month) throws Exception
	{
		double SO_ALT=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_ALTColumn,month);
		System.out.println("Process =>Matching - SO Ordering =>Average lead time (in working days) "+month+" :"+SO_ALT);
	}
	
	public static void talentPoolChart(String filePath,String IFLT_CTCColumn,String month) throws Exception
	{
		double IFLT_CTC=GenericMethods.readdatafromExcelusingcolumnName(filePath,IFLT_CTCColumn,month);
		System.out.println("Process =>Matching - SO Ordering =>Average lead time (in working days) "+month+" :"+IFLT_CTC);
	}
	
	
	public static void perInternalCapacityChart(String filePath,String SO_FIColumn,String SO_FColumn,String month) throws Exception
	{
		
		double sum=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FIColumn, SO_FColumn, month);
		double percentage= sum*100;
		System.out.println("Process => Matching - Internal Fulfillment => Strength of Internal Capacity for "+month+" :"+percentage);
	 	
	}
	
	public static void subConChart(String filePath,String SUBCON_HIRING_TATColumn,String month) throws Exception
	{
		double SUBCON_HIRING_TAT=GenericMethods.readdatafromExcelusingcolumnName(filePath,SUBCON_HIRING_TATColumn,month);
		System.out.println("Process =>Lateral Hiring => Sub Con "+month+" :"+SUBCON_HIRING_TAT);
	}
	
	public static void perInternalFulfillmentChart(String filePath,String SO_R_CUMVColumn,String SO_C_CUMVColumn,String month) throws Exception
	{
		double SO_R_CUMV=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_R_CUMVColumn,month);
		double SO_C_CUMV=GenericMethods.readdatafromExcelusingcolumnName(filePath,SO_C_CUMVColumn,month);
		double sum= (SO_R_CUMV/(SO_R_CUMV-SO_C_CUMV));
		double percentage= sum*100;
		System.out.println("Internal SO Fulfillment for "+month+" :"+percentage);
	 	
	}
	public static void perInternalFulfillmentChartMonth(String filePath,String SO_R_CUMVColumn,String SO_FColumn,String month) throws Exception
	{
		
		double sum=ColumnCalMethods.readdatafromExcelAggregateSOInternal(filePath, SO_R_CUMVColumn, SO_FColumn, month);
		double percentage= sum*100;
		System.out.println("Internal SO Fulfillment for "+month+" :"+percentage);
	 	
	}
	
	public static void perSourcedInternalChart(String filePath,String SO_FIColumnName,String SO_FColumnName,String month) throws Exception
	{
		double SourcedInternal=ColumnCalMethods.readdatafromExcelAggregateColumn(filePath, SO_FIColumnName, SO_FColumnName, month);
		double perStrengthInternal=SourcedInternal*100;
	 	System.out.println("Process =>Lateral Hiring =>Sourced By Internal  "+month+" :"+perStrengthInternal);
	 	
	}
	
	
	public static void subConAgingChart(String filePath,String AVGSUBCON_AGE_IMColumn,String month) throws Exception
	{
		double AVGSUBCON_AGE_IM=GenericMethods.readdatafromExcelusingcolumnName(filePath,AVGSUBCON_AGE_IMColumn,month);
		System.out.println("Process =>Lateral Hiring => Sub Con Aging "+month+" :"+AVGSUBCON_AGE_IM);
	}
	
	
	
}
