package com.edgenetworks.excelvalues;

import org.testng.annotations.Test;

public class ExecutiveDashBoard 
{
	String YTDColumnName = "YTD_ATTR";
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
@Test
public void Employee() throws Exception
{
	//Code to calculate YTD_ATTR
			System.out.println("|---------------------------------------------------------|");
			System.out.println("|=====================YTD Attrition=======================|");
			LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M1);
			LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M2);
			LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M3);
			LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M4);
			LeadModuleChartCal.YTD_Attr(YTDColumnName, filePath,M5);

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
}
}
