package com.edgenetworks.excelvalues;

public class ExcelValueLeadModule {

	public static void main(String[] args) throws Exception 
	{
		String YTDColumnName = "YTD_ATTR";
		String MONColumnName ="MON_ATTR";
		String revenueColumnName="Revenue";
		String chc_ColumnName="CHC";
		String costColumnName="Cost";
		String TBHColumn="TBH";
		String TPHColumn="TPH";
		String FSO_F_CUMV ="FSO_F_CUMV";
		String FSO_R_CUMV ="FSO_R_CUMV";
		String FSORColumn = "FSO_R";
		String SORColumn = "SO_R";
		String SO_M="SO_M";
		String SO_MS="SO_MS";
		String SO_FT="SO_FT";
		String SO_UF="SO_UF";
		String SO_F_J = "SO_F_J";
		String SO_FB2WBSD="SO_FB2WBSD";
		String B_AWD="B_AWD";
		String EMP_IN_CTC="EMP_IN_CTC";
		String SOC_Column = "SO_C";
		String SO_C_CUMV="SO_C_CUMV";
		String SO_R_CUMV = "SO_R_CUMV";
		String SO_F_CUMV = "SO_F_CUMV";
		String FSO_2ML="FSO_2MLT";
		String SO_ALT ="SO_ALT";
		String IFLT_CTC ="IFLT_CTC"; 
		String SUBCON_HIRING_TAT ="SUBCON_HIRING_TAT";
		String SO_FIBCoulmn = "SO_FIB";
		String SO_FIColumn = "SO_FI";
		String SO_FEVERColumnName = "SO_FEVER";
		String SO_FEColumnName = "SO_FE";
		String SO_FEVRColumnName= "SO_FEVR";
		String SO_FEVVColumnName= "SO_FEVV";
		String SO_MTEColumnName = "SO_MTE";
		String SO_FColumnName = "SO_F";
		String FSO_CColumnName="FSO_C";
		String EMP_NOT_ROTColumnName = "EMP_NOT_ROT";
		String EMP_ROT_DUEColumnName = "EMP_ROT_DUE";
		String EMP_ROT="EMP_ROT";
		String EMP_TRAN_N_FULL_MTO="EMP_TRAN_N_FULL_MTO";
		String EMP_TRAN_MTO="EMP_TRAN_MTO";
		String EMP_TRAN_N_FULL_MTS="EMP_TRAN_N_FULL_MTS";
		String EMP_TRAN_MTS="EMP_TRAN_MTS";
		String EMP_TRAN_N_FULL ="EMP_TRAN_N_FULL";
		String EMP_TRAN="EMP_TRAN";
		String AVGSUBCON_AGE_IM ="AVGSUBCON_AGE_IM";
		String M1="M1";

		String M2="M2";
		String M3="M3";
		String M4="M4";
		String M5="M5";
		String filePath="C:\\Edge_Networks\\EdgeNetworks\\Data\\data_testing_v2.xlsx";
		//Code to calculate YTD_ATTR
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=====================YTD Attrition=======================|");
		LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M1);
		LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M2);
		LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M3);
		LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M4);
		LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M5);

		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=====================MON Attrition=======================|");
		LeadModuleChartCal.MON_Attr(MONColumnName, filePath,M1);
		LeadModuleChartCal.MON_Attr(MONColumnName, filePath,M2);
		LeadModuleChartCal.MON_Attr(MONColumnName, filePath,M3);
		LeadModuleChartCal.MON_Attr(MONColumnName, filePath,M4);
		LeadModuleChartCal.MON_Attr(MONColumnName, filePath,M5);

		//Code to calculate Revenue per employee
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|==================Revenue Per Employee===================|");
		LeadModuleChartCal.revenuePerEmloyee(filePath, revenueColumnName, chc_ColumnName, M1);
		LeadModuleChartCal.revenuePerEmloyee(filePath, revenueColumnName, chc_ColumnName, M2);
		LeadModuleChartCal.revenuePerEmloyee(filePath, revenueColumnName, chc_ColumnName, M3);
		LeadModuleChartCal.revenuePerEmloyee(filePath, revenueColumnName, chc_ColumnName, M4);
		LeadModuleChartCal.revenuePerEmloyeeM5(filePath,revenueColumnName, chc_ColumnName, M5);

		//Code to calculate Employee Cost Revenue
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|==================Employee Cost Revenue==================|");
		LeadModuleChartCal.employeeCostRevenue(filePath, revenueColumnName, costColumnName, M1);
		LeadModuleChartCal.employeeCostRevenue(filePath, revenueColumnName, costColumnName, M2);
		LeadModuleChartCal.employeeCostRevenue(filePath, revenueColumnName, costColumnName, M3);
		LeadModuleChartCal.employeeCostRevenue(filePath, revenueColumnName, costColumnName, M4);
		LeadModuleChartCal.employeeCostRevenue(filePath, revenueColumnName, costColumnName, M5);

		//Code to calculate Cost Per Employee
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|====================Cost Per Employee====================|");
		LeadModuleChartCal.costPerEmployee(filePath, costColumnName, chc_ColumnName, M1);
		LeadModuleChartCal.costPerEmployee(filePath, costColumnName, chc_ColumnName, M2);
		LeadModuleChartCal.costPerEmployee(filePath, costColumnName, chc_ColumnName, M3);
		LeadModuleChartCal.costPerEmployee(filePath, costColumnName, chc_ColumnName, M4);
		LeadModuleChartCal.costPerEmployeeM5(filePath, costColumnName, chc_ColumnName, M5);

		//Code to calculate SO Fulfillment
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=================== SO Fulfillment ======================|");
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M1);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M2);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M3);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M4);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M5);

		//Code to calculate SO Fulfillment
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=================== SO Fulfillment CUMV ======================|");
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M1);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_F_CUMV, SO_R_CUMV, M2);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_F_CUMV, SO_R_CUMV, M3);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_F_CUMV, SO_R_CUMV, M4);
		LeadModuleChartCal.perSOFulfillmentChart(filePath, SO_FColumnName, SORColumn, M5);

		//Code to calculate % of Forecast SO Chart
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=================== % of Forecast SO ====================|");
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M1);
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M2);
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M3);
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M4);
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M5);

		//Code to calculate % of Forecast SO Chart
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=================== % of Forecast SO CUMV ====================|");
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M1);
		LeadModuleChartCal.perForecastSOChart(filePath, FSO_R_CUMV, SO_R_CUMV, M2);
		LeadModuleChartCal.perForecastSOChart(filePath, FSO_R_CUMV, SO_R_CUMV, M3);
		LeadModuleChartCal.perForecastSOChart(filePath, FSO_R_CUMV, SO_R_CUMV, M4);
		LeadModuleChartCal.perForecastSOChart(filePath, FSORColumn, SORColumn, M5); 

		//Code to calculate Utilization Chart
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|====================== Utilization ======================|");
		LeadModuleChartCal.utilizationChart(filePath, TBHColumn, TPHColumn, M1);
		LeadModuleChartCal.utilizationChart(filePath, TBHColumn, TPHColumn, M2);
		LeadModuleChartCal.utilizationChart(filePath, TBHColumn, TPHColumn, M3);
		LeadModuleChartCal.utilizationChart(filePath, TBHColumn, TPHColumn, M4);
		LeadModuleChartCal.utilizationChart(filePath, TBHColumn, TPHColumn, M5);


		//Code to calculate Employee Mobility Index 
		System.out.println("|----------------------------------------------------------------|");
		System.out.println("|== Employee Mobility Index & 18 Months Account Ageing Rotation==|");
		LeadModuleChartCal.perEmployeeMobilityIndexChart(filePath, EMP_ROT, EMP_ROT_DUEColumnName, M1);
		LeadModuleChartCal.perEmployeeMobilityIndexChart(filePath, EMP_ROT, EMP_ROT_DUEColumnName, M2);
		LeadModuleChartCal.perEmployeeMobilityIndexChart(filePath, EMP_ROT, EMP_ROT_DUEColumnName, M3);
		LeadModuleChartCal.perEmployeeMobilityIndexChart(filePath, EMP_ROT, EMP_ROT_DUEColumnName, M4);
		LeadModuleChartCal.perEmployeeMobilityIndexChart(filePath, EMP_ROT, EMP_ROT_DUEColumnName, M5);

		//Code to calculate Learning Effectiveness
		System.out.println("|-----------------------------------------------------------------------|");
		System.out.println("|========================== Learning Effectiveness =====================|");
		LeadModuleChartCal.perLearningEffectivenessChart(filePath, EMP_TRAN_N_FULL, EMP_TRAN_MTO, EMP_TRAN_MTS, EMP_TRAN, M1);
		LeadModuleChartCal.perLearningEffectivenessChart(filePath, EMP_TRAN_N_FULL, EMP_TRAN_MTO, EMP_TRAN_MTS, EMP_TRAN, M2);
		LeadModuleChartCal.perLearningEffectivenessChart(filePath, EMP_TRAN_N_FULL, EMP_TRAN_MTO, EMP_TRAN_MTS, EMP_TRAN, M3);
		LeadModuleChartCal.perLearningEffectivenessChart(filePath, EMP_TRAN_N_FULL, EMP_TRAN_MTO, EMP_TRAN_MTS, EMP_TRAN, M4);
		LeadModuleChartCal.perLearningEffectivenessChart(filePath, EMP_TRAN_N_FULL, EMP_TRAN_MTO, EMP_TRAN_MTS, EMP_TRAN, M5);


		//Code to calculate Juniorization
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|===================== Juniorization =====================|");
		LeadModuleChartCal.perJuniorizationChart(filePath, SO_F_J, SO_FColumnName, M1);
		LeadModuleChartCal.perJuniorizationChart(filePath, SO_F_J, SO_FColumnName, M2);
		LeadModuleChartCal.perJuniorizationChart(filePath, SO_F_J, SO_FColumnName, M3);
		LeadModuleChartCal.perJuniorizationChart(filePath, SO_F_J, SO_FColumnName, M4);
		LeadModuleChartCal.perJuniorizationChart(filePath, SO_F_J, SO_FColumnName, M5);

		//Code to calculate SO Ordering
		System.out.println("|-------------------------------------------------------------------------------------------------|");
		System.out.println("|===Function => WorkForce=>  SO Overordering  & Process => Forecasting => SO Ordering=============|");
		LeadModuleChartCal.perSO_OrderingChart(filePath, SOC_Column, SORColumn, M1);
		LeadModuleChartCal.perSO_OrderingChart(filePath, SO_C_CUMV, SO_R_CUMV, M2);
		LeadModuleChartCal.perSO_OrderingChart(filePath, SO_C_CUMV, SO_R_CUMV, M3);
		LeadModuleChartCal.perSO_OrderingChart(filePath, SO_C_CUMV, SO_R_CUMV, M4);
		LeadModuleChartCal.perSO_OrderingChart(filePath, SO_C_CUMV, SO_R_CUMV, M5);

		//Code to calculate SO Fulfillment 
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=====Function => WorkForce=>  SO Internl Fulfillment ====|");
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M1);
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M2);
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M3);
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M4);
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M5);

		//Code to calculate SO Fulfillment 
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|====Function => WorkForce=>  SO Internl Fulfillment CUMV=|");
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SORColumn, SOC_Column, M1);
		LeadModuleChartCal.perInternalFulfillmentChartMonth(filePath, SO_R_CUMV, SO_C_CUMV, M2);
		LeadModuleChartCal.perInternalFulfillmentChartMonth(filePath, SO_R_CUMV, SO_C_CUMV, M3);
		LeadModuleChartCal.perInternalFulfillmentChartMonth(filePath, SO_R_CUMV, SO_C_CUMV, M4);
		LeadModuleChartCal.perInternalFulfillmentChart(filePath, SO_R_CUMV, SO_C_CUMV, M5);

		//Code to calculate Forecast Effectiveness
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|====Function => WorkForce=> Forecast Effectiveness ======|");
		LeadModuleChartCal.perForecastEffectivenessChart(filePath, FSO_2ML, SORColumn, M1);
		LeadModuleChartCal.perForecastEffectivenessChart(filePath, FSO_2ML, SORColumn, M2);
		LeadModuleChartCal.perForecastEffectivenessChart(filePath, FSO_2ML, SORColumn, M3);
		LeadModuleChartCal.perForecastEffectivenessChart(filePath, FSO_2ML, SORColumn, M4);
		LeadModuleChartCal.perForecastEffectivenessChart(filePath, FSO_2ML, SORColumn, M5);

		//Code to calculate Fulfillment from Bench
		System.out.println("|--------------------------------------------------------------------------|");
		System.out.println("|==========Function => Resource => Fulfillment from Bench =================|");
		LeadModuleChartCal.fulfillmentFromBenchChart(filePath, SO_FIBCoulmn, SO_FIColumn, M1);
		LeadModuleChartCal.fulfillmentFromBenchChart(filePath, SO_FIBCoulmn, SO_FIColumn, M2);
		LeadModuleChartCal.fulfillmentFromBenchChart(filePath, SO_FIBCoulmn, SO_FIColumn, M3);
		LeadModuleChartCal.fulfillmentFromBenchChart(filePath, SO_FIBCoulmn, SO_FIColumn, M4);
		LeadModuleChartCal.fulfillmentFromBenchChart(filePath, SO_FIBCoulmn, SO_FIColumn, M5);

		//Code to calculate Bench Aging 
		System.out.println("|-----------------------------------------------------------------|");
		System.out.println("|===Function => Resource =>Bench aging (in working days) =========|");
		LeadModuleChartCal.benchAgingChart(filePath, B_AWD, EMP_IN_CTC, M1);
		LeadModuleChartCal.benchAgingChart(filePath, B_AWD, EMP_IN_CTC, M2);
		LeadModuleChartCal.benchAgingChart(filePath, B_AWD, EMP_IN_CTC, M3);
		LeadModuleChartCal.benchAgingChart(filePath, B_AWD, EMP_IN_CTC, M4);
		LeadModuleChartCal.benchAgingChart(filePath, B_AWD, EMP_IN_CTC, M5);


		//Code to calculate Channel Mix[Employee]
		System.out.println("|------------------------------------------------------------------------|");
		System.out.println("|======Function => Talent Acq => Channel Mix[Employee] ==================|");
		LeadModuleChartCal.employeeReferralChannelChart(filePath, SO_FEVERColumnName, SO_FEColumnName, M1);
		LeadModuleChartCal.employeeReferralChannelChart(filePath, SO_FEVERColumnName, SO_FEColumnName, M2);
		LeadModuleChartCal.employeeReferralChannelChart(filePath, SO_FEVERColumnName, SO_FEColumnName, M3);
		LeadModuleChartCal.employeeReferralChannelChart(filePath, SO_FEVERColumnName, SO_FEColumnName, M4);
		LeadModuleChartCal.employeeReferralChannelChart(filePath, SO_FEVERColumnName, SO_FEColumnName, M5);

		//Code to calculate Channel Mix[Recruiter]
		System.out.println("|------------------------------------------------------------------------|");
		System.out.println("|======Function => Talent Acq => Channel Mix[Recruiter] ==================|");
		LeadModuleChartCal.recruiterReferralChannelChart(filePath, SO_FEVRColumnName, SO_FEColumnName, M1);
		LeadModuleChartCal.recruiterReferralChannelChart(filePath, SO_FEVRColumnName, SO_FEColumnName, M2);
		LeadModuleChartCal.recruiterReferralChannelChart(filePath, SO_FEVRColumnName, SO_FEColumnName, M3);
		LeadModuleChartCal.recruiterReferralChannelChart(filePath, SO_FEVRColumnName, SO_FEColumnName, M4);
		LeadModuleChartCal.recruiterReferralChannelChart(filePath, SO_FEVRColumnName, SO_FEColumnName, M5);

		//Code to calculate Channel Mix[Vendor]
		System.out.println("|------------------------------------------------------------------------|");
		System.out.println("|======Function => Talent Acq => Channel Mix[Vendor] ==================|");
		LeadModuleChartCal.vendorReferralChannelChart(filePath, SO_FEVVColumnName, SO_FEColumnName, M1);
		LeadModuleChartCal.vendorReferralChannelChart(filePath, SO_FEVVColumnName, SO_FEColumnName, M2);
		LeadModuleChartCal.vendorReferralChannelChart(filePath, SO_FEVVColumnName, SO_FEColumnName, M3);
		LeadModuleChartCal.vendorReferralChannelChart(filePath, SO_FEVVColumnName, SO_FEColumnName, M4);
		LeadModuleChartCal.vendorReferralChannelChart(filePath, SO_FEVVColumnName, SO_FEColumnName, M5);


		//Code to calculate MTO Effectiveness
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=====Function => Talent Trans =>  MTO Effectiveness =======|");
		LeadModuleChartCal.perMTO_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTO, EMP_TRAN_MTO, M1);
		LeadModuleChartCal.perMTO_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTO, EMP_TRAN_MTO, M2);
		LeadModuleChartCal.perMTO_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTO, EMP_TRAN_MTO, M3);
		LeadModuleChartCal.perMTO_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTO, EMP_TRAN_MTO, M4);
		LeadModuleChartCal.perMTO_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTO, EMP_TRAN_MTO, M5);

		//Code to calculate MTS Effectiveness
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|=====Function => Talent Trans =>  MTS Redeployment=======|");
		LeadModuleChartCal.perMTS_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTS, EMP_TRAN_MTS, M1);
		LeadModuleChartCal.perMTS_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTS, EMP_TRAN_MTS, M2);
		LeadModuleChartCal.perMTS_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTS, EMP_TRAN_MTS, M3);
		LeadModuleChartCal.perMTS_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTS, EMP_TRAN_MTS, M4);
		LeadModuleChartCal.perMTS_EffectivenessChart(filePath, EMP_TRAN_N_FULL_MTS, EMP_TRAN_MTS, M5);


		//Code to calculate Release Non Compliance
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|========== Workforce => Release Non Compliance ==========|");
		LeadModuleChartCal.releaseNonComplianceChart(filePath, EMP_NOT_ROTColumnName, EMP_ROT_DUEColumnName, M1);
		LeadModuleChartCal.releaseNonComplianceChart(filePath, EMP_NOT_ROTColumnName, EMP_ROT_DUEColumnName, M2);
		LeadModuleChartCal.releaseNonComplianceChart(filePath, EMP_NOT_ROTColumnName, EMP_ROT_DUEColumnName, M3);
		LeadModuleChartCal.releaseNonComplianceChart(filePath, EMP_NOT_ROTColumnName, EMP_ROT_DUEColumnName, M4);
		LeadModuleChartCal.releaseNonComplianceChart(filePath, EMP_NOT_ROTColumnName, EMP_ROT_DUEColumnName, M5);
		
		

		//Code to calculate Forecasted SO Cancellation %
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("|======Process => Forecasting => Forecasted SO Cancellation % =======|");
		LeadModuleChartCal.forecastSOCancellationChart(filePath, FSO_CColumnName, FSORColumn, M1);
		LeadModuleChartCal.forecastSOCancellationChart(filePath, FSO_CColumnName, FSORColumn, M2);
		LeadModuleChartCal.forecastSOCancellationChart(filePath, FSO_CColumnName, FSORColumn, M3);
		LeadModuleChartCal.forecastSOCancellationChart(filePath, FSO_CColumnName, FSORColumn, M4);
		LeadModuleChartCal.forecastSOCancellationChart(filePath, FSO_CColumnName, FSORColumn, M5);

		//Code to calculate Average lead time (in working days)
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|======== Average lead time (in working days) ============|");
		LeadModuleChartCal.averageLeadTimeChart(filePath, SO_ALT, M1);
		LeadModuleChartCal.averageLeadTimeChart(filePath, SO_ALT, M2);
		LeadModuleChartCal.averageLeadTimeChart(filePath, SO_ALT, M3);
		LeadModuleChartCal.averageLeadTimeChart(filePath, SO_ALT, M4);
		LeadModuleChartCal.averageLeadTimeChart(filePath, SO_ALT, M5);

		//Code to calculate Forecasted SO Cancellation %
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|========= SO Ordering => SO Cancellation % ===============|");
		LeadModuleChartCal.SOCancellationChart(filePath, SOC_Column, SORColumn, M1);
		LeadModuleChartCal.SOCancellationChart(filePath, SOC_Column, SORColumn, M2);
		LeadModuleChartCal.SOCancellationChart(filePath, SOC_Column, SORColumn, M3);
		LeadModuleChartCal.SOCancellationChart(filePath, SOC_Column, SORColumn, M4);
		LeadModuleChartCal.SOCancellationChart(filePath, SOC_Column, SORColumn, M5);




		//Code to calculate SO Modified %
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|========= Process =>SO Ordering =>SO Modified % =========|");
		LeadModuleChartCal.perSOModifiedChart(filePath, SO_M, SORColumn, M1);
		LeadModuleChartCal.perSOModifiedChart(filePath, SO_M, SORColumn, M2);
		LeadModuleChartCal.perSOModifiedChart(filePath, SO_M, SORColumn, M3);
		LeadModuleChartCal.perSOModifiedChart(filePath, SO_M, SORColumn, M4);
		LeadModuleChartCal.perSOModifiedChart(filePath, SO_M, SORColumn, M5);

		//Code to calculate SO Modified Significantly %
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|== Process =>SO Ordering =>SO Modified Significantly % ==|");
		LeadModuleChartCal.perSOModifiedSignificantlyChart(filePath, SO_MS, SORColumn, M1);
		LeadModuleChartCal.perSOModifiedSignificantlyChart(filePath, SO_MS, SORColumn, M2);
		LeadModuleChartCal.perSOModifiedSignificantlyChart(filePath, SO_MS, SORColumn, M3);
		LeadModuleChartCal.perSOModifiedSignificantlyChart(filePath, SO_MS, SORColumn, M4);
		LeadModuleChartCal.perSOModifiedSignificantlyChart(filePath, SO_MS, SORColumn, M5);

		//Code to calculate Strength of Internal Capacity
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|==== Process =>Match=>Strength of Internal Capacity =====|");
		LeadModuleChartCal.perStrengthInternalChart(filePath, SO_FIColumn, SO_FColumnName, M1);
		LeadModuleChartCal.perStrengthInternalChart(filePath, SO_FIColumn, SO_FColumnName, M2);
		LeadModuleChartCal.perStrengthInternalChart(filePath, SO_FIColumn, SO_FColumnName, M3);
		LeadModuleChartCal.perStrengthInternalChart(filePath, SO_FIColumn, SO_FColumnName, M4);
		LeadModuleChartCal.perStrengthInternalChart(filePath, SO_FIColumn, SO_FColumnName, M5);

		//Code to calculate Strength of Timeline Adherence
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|========== Process =>Match=>Timeline Adherence ==========|");
		LeadModuleChartCal.perTimeAdherenceChart(filePath, SO_FT, SO_FColumnName, M1);
		LeadModuleChartCal.perTimeAdherenceChart(filePath, SO_FT, SO_FColumnName, M2);
		LeadModuleChartCal.perTimeAdherenceChart(filePath, SO_FT, SO_FColumnName, M3);
		LeadModuleChartCal.perTimeAdherenceChart(filePath, SO_FT, SO_FColumnName, M4);
		LeadModuleChartCal.perTimeAdherenceChart(filePath, SO_FT, SO_FColumnName, M5);


		//Code to calculate Strength of Demand Aging
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|============ Process =>Match=>Demand Aging ==============|");
		LeadModuleChartCal.perDemandAgingChart(filePath, SO_UF, SO_FB2WBSD, SORColumn, M1);
		LeadModuleChartCal.perDemandAgingChart(filePath, SO_UF, SO_FB2WBSD, SORColumn, M2);
		LeadModuleChartCal.perDemandAgingChart(filePath, SO_UF, SO_FB2WBSD, SORColumn, M3);
		LeadModuleChartCal.perDemandAgingChart(filePath, SO_UF, SO_FB2WBSD, SORColumn, M4);
		LeadModuleChartCal.perDemandAgingChart(filePath, SO_UF, SO_FB2WBSD, SORColumn, M5);


		//==============================================================================================









		//Code to calculate Into Talent Pool
		System.out.println("|-----------------------------------------------------------------------|");
		System.out.println("|===Process => Matching - Internal Fulfillment => Into Talent Pool =====|");		
		LeadModuleChartCal.talentPoolChart(filePath, IFLT_CTC, M1);
		LeadModuleChartCal.talentPoolChart(filePath, IFLT_CTC, M2);
		LeadModuleChartCal.talentPoolChart(filePath, IFLT_CTC, M3);
		LeadModuleChartCal.talentPoolChart(filePath, IFLT_CTC, M4);
		LeadModuleChartCal.talentPoolChart(filePath, IFLT_CTC, M5);



		//Need some clarification MisMatch data
		//Code to calculate Process =>Lateral Hiring => Sub Con
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println("|============ Process =>Lateral Hiring => Sub Con (MisMatch)======================|");
		LeadModuleChartCal.subConChart(filePath, SUBCON_HIRING_TAT, M1);
		LeadModuleChartCal.subConChart(filePath, SUBCON_HIRING_TAT, M2);
		LeadModuleChartCal.subConChart(filePath, SUBCON_HIRING_TAT, M3);
		LeadModuleChartCal.subConChart(filePath, SUBCON_HIRING_TAT, M4);
		LeadModuleChartCal.subConChart(filePath, SUBCON_HIRING_TAT, M5);

		//Code to calculate Process =>Lateral Hiring => Sub Con Aging
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println("|============ Process =>Lateral Hiring => Sub Con Aging (MisMatch)======================|");
		LeadModuleChartCal.subConChart(filePath, AVGSUBCON_AGE_IM, M1);
		LeadModuleChartCal.subConChart(filePath, AVGSUBCON_AGE_IM, M2);
		LeadModuleChartCal.subConChart(filePath, AVGSUBCON_AGE_IM, M3);
		LeadModuleChartCal.subConChart(filePath, AVGSUBCON_AGE_IM, M4);
		LeadModuleChartCal.subConChart(filePath, AVGSUBCON_AGE_IM, M5);
		
		

		//Code to calculate % Marked to External
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|=====Process =>Lateral Hiring => % Marked to External =========|");
		LeadModuleChartCal.perMarkedExternalChart(filePath, SO_MTEColumnName, SORColumn, M1);
		LeadModuleChartCal.perMarkedExternalChart(filePath, SO_MTEColumnName, SORColumn, M2);
		LeadModuleChartCal.perMarkedExternalChart(filePath, SO_MTEColumnName, SORColumn, M3);
		LeadModuleChartCal.perMarkedExternalChart(filePath, SO_MTEColumnName, SORColumn, M4);
		LeadModuleChartCal.perMarkedExternalChart(filePath, SO_MTEColumnName, SORColumn, M5);

		//Code to calculate Sourced By Internal
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|======= Process =>Lateral Hiring => Sourced By Internal ===========|");
		LeadModuleChartCal.perSourcedInternalChart(filePath, SO_FIColumn, SO_FColumnName, M1);
		LeadModuleChartCal.perSourcedInternalChart(filePath, SO_FIColumn, SO_FColumnName, M2);
		LeadModuleChartCal.perSourcedInternalChart(filePath, SO_FIColumn, SO_FColumnName, M3);
		LeadModuleChartCal.perSourcedInternalChart(filePath, SO_FIColumn, SO_FColumnName, M4);
		LeadModuleChartCal.perSourcedInternalChart(filePath, SO_FIColumn, SO_FColumnName, M5);

		//Code to calculate Sourced By External
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|======= Process =>Lateral Hiring => Sourced By External ===========|");
		LeadModuleChartCal.sourceByExternalChart(filePath, SO_FEColumnName, SO_FColumnName, M1);
		LeadModuleChartCal.sourceByExternalChart(filePath, SO_FEColumnName, SO_FColumnName, M2);
		LeadModuleChartCal.sourceByExternalChart(filePath, SO_FEColumnName, SO_FColumnName, M3);
		LeadModuleChartCal.sourceByExternalChart(filePath, SO_FEColumnName, SO_FColumnName, M4);
		LeadModuleChartCal.sourceByExternalChart(filePath, SO_FEColumnName, SO_FColumnName, M5);


	}

}
