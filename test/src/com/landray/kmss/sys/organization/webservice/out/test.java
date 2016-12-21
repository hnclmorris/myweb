package com.landray.kmss.sys.organization.webservice.out;

public class test {
	public static void main(String[] args) throws Exception_Exception {
		ISysSynchroGetOrgWebServiceService services = new ISysSynchroGetOrgWebServiceService();
		ISysSynchroGetOrgWebService service = services
				.getISysSynchroGetOrgWebServicePort();
		SysSynchroGetOrgBaseInfoContext baseInfo = new SysSynchroGetOrgBaseInfoContext();
		baseInfo.setReturnOrgType("[{\"type\":\"dept\"}]");
		baseInfo.setReturnType("");
		System.out.println(service.getElementsBaseInfo(baseInfo).getMessage());

		// String tims =
		// \\\"{\\\\"esbhead\\\\": {\\\\"tradeDescription\\\\":
		// \\\\"TIMS-EIP发票报销接口\\\\",\\\\"tradeTime\\\\": \\\\"2014-11-24
		// 14:11:10\\\\",\\\\"clientCode\\\\":
		// \\\\"TIMSSender\\\\",\\\\"reqSerialNo\\\\":
		// \\\\"esbbody\\\\",\\\\"tradeCode\\\\":
		// \\\\"MGR101\\\\",\\\\"version\\\\":
		// \\\\"1\\\\"},\\\\"esbbody\\\\": [{\\\\"BILLTAXPRICE\\\\":
		// \\\\"17\\\\",\\\\"FDKEYWORD\\\\":
		// \\\\"J120141113001\\\\",\\\\"CONTRACTPRICE\\\\":
		// \\\\"134002\\\\",\\\\"BASEDEPT\\\\":
		// \\\\"1520\\\\",\\\\"COSTCENTERDEPT\\\\":
		// \\\\"0031\\\\",\\\\"PROJECTNAME\\\\":
		// \\\\"BF三厢及备胎内置\\\\",\\\\"DOCSUBJECT\\\\":
		// \\\\"因为...试制某个车型\\\\",\\\\"BILLNO\\\\":
		// \\\\"JS0000000072\\\\",\\\\"BILLREMARK\\\\":
		// \\\\"测试\\\\",\\\\"CONTRACTNO\\\\":
		// \\\\"HT14111207\\\\",\\\\"SUPPLIERNO\\\\":
		// \\\\"DFGPV0005\\\\",\\\\"FDTEMPLATEID\\\\":
		// \\\\"149265841751ea00c477ba74a4d86168\\\\",\\\\"DOCSTATUS\\\\":
		// \\\\"10\\\\",\\\\"BILLTOTALPRICE\\\\":
		// \\\\"\\\\",\\\\"BASECREATOR\\\\":
		// \\\\"J02012\\\\",\\\\"SUPPLIERTYPE\\\\":
		// \\\\"2\\\\",\\\\"DOCCREATOR\\\\":
		// \\\\"J02012\\\\",\\\\"PROJECTNO\\\\":
		// \\\\"J15GGL01\\\\",\\\\"BILLNUMBER\\\\":
		// \\\\"1\\\\",\\\\"BUSTYPE\\\\": \\\\"试制费\\\\",\\\\"BILLTYPE\\\\":
		// \\\\"试制零件\\\\",\\\\"BILLPRICENOTAX\\\\": \\\\"4556\\\\"}]}\\\";
		// String tims =
		// \\\"[{\\\\"baseCreator\\\\":\\\\"J01328\\\\",\\\\"baseDept\\\\":\\\\"1Z21\\\\",\\\\"bills\\\\":[{\\\\"billNo\\\\":\\\\"CS1110001\\\\",\\\\"billNumber\\\\":\\\\"1\\\\",\\\\"billPriceNoTax\\\\":\\\\"20\\\\",\\\\"billRemark\\\\":\\\\"DB12040605:cs\\\\",\\\\"billTaxPrice\\\\":\\\\"3\\\\",\\\\"billTotalPrice\\\\":\\\\"4\\\\",\\\\"billTypeName\\\\":\\\\"试制零件\\\\"},{\\\\"billNo\\\\":\\\\"CS1110001\\\\",\\\\"billNumber\\\\":\\\\"1\\\\",\\\\"billPriceNoTax\\\\":\\\\"20\\\\",\\\\"billRemark\\\\":\\\\"DB12040605:cs\\\\",\\\\"billTaxPrice\\\\":\\\\"3\\\\",\\\\"billTotalPrice\\\\":\\\\"4\\\\",\\\\"billTypeName\\\\":\\\\"试制零件\\\\"}],\\\\"busType\\\\":\\\\"试制费\\\\",\\\\"contractNo\\\\":\\\\"HT14062501\\\\",\\\\"contractPrice\\\\":\\\\"20\\\\",\\\\"costCenterDept\\\\":\\\\"1Z30\\\\",\\\\"docCreator\\\\":\\\\"J01328\\\\",\\\\"docStatus\\\\":\\\\"10\\\\",\\\\"docSubject\\\\":\\\\"NB1P1(Y10G059H)试制费用\\\\",\\\\"keyword\\\\":\\\\"FP14110010\\\\",\\\\"projectName\\\\":\\\\"NB1P1\\\\",\\\\"projectNo\\\\":\\\\"Z15G0016\\\\",\\\\"supplierNo\\\\":\\\\"DFGPV0052\\\\",\\\\"supplierPayType\\\\":\\\\"249\\\\",\\\\"supplierType\\\\":\\\\"2\\\\",\\\\"templateId\\\\":\\\\"149265841751ea00c477ba74a4d86168\\\\"}]\\\";
		// String tims =
		// \\\"[{\\\\"baseCreator\\\\":\\\\"J02012\\\\",\\\\"baseDept\\\\":\\\\"1520\\\\",\\\\"bills\\\\":[{\\\\"billNo\\\\":\\\\"JS0000000073\\\\",\\\\"billNumber\\\\":\\\\"1\\\\",\\\\"billPriceNoTax\\\\":\\\\"4556\\\\",\\\\"billRemark\\\\":\\\\"测试\\\\",\\\\"billTaxPrice\\\\":\\\\"17\\\\",\\\\"billTotalPrice\\\\":\\\\"\\\\",\\\\"billTypeName\\\\":\\\\"试制零件\\\\"}],\\\\"busType\\\\":\\\\"试制费\\\\",\\\\"contractNo\\\\":\\\\"HT14111207\\\\",\\\\"contractPrice\\\\":\\\\"134002\\\\",\\\\"costCenterDept\\\\":\\\\"1520\\\\",\\\\"docCreator\\\\":\\\\"J02012\\\\",\\\\"docStatus\\\\":\\\\"10\\\\",\\\\"docSubject\\\\":\\\\"因为...试制某个车型\\\\",\\\\"keyword\\\\":\\\\"J120141113002\\\\",\\\\"projectName\\\\":\\\\"BF三厢及备胎内置\\\\",\\\\"projectNo\\\\":\\\\"J15GGL01\\\\",\\\\"supplierNo\\\\":\\\\"DFGPV0005\\\\",\\\\"supplierPayType\\\\":\\\\"\\\\",\\\\"supplierType\\\\":\\\\"2\\\\",\\\\"templateId\\\\":\\\\"149265841751ea00c477ba74a4d86168\\\\"},{\\\\"baseCreator\\\\":\\\\"J02012\\\\",\\\\"baseDept\\\\":\\\\"1520\\\\",\\\\"bills\\\\":[{\\\\"billNo\\\\":\\\\"JS0000000072\\\\",\\\\"billNumber\\\\":\\\\"1\\\\",\\\\"billPriceNoTax\\\\":\\\\"4556\\\\",\\\\"billRemark\\\\":\\\\"测试\\\\",\\\\"billTaxPrice\\\\":\\\\"17\\\\",\\\\"billTotalPrice\\\\":\\\\"\\\\",\\\\"billTypeName\\\\":\\\\"试制零件\\\\"}],\\\\"busType\\\\":\\\\"试制费\\\\",\\\\"contractNo\\\\":\\\\"HT14111207\\\\",\\\\"contractPrice\\\\":\\\\"134002\\\\",\\\\"costCenterDept\\\\":\\\\"0031\\\\",\\\\"docCreator\\\\":\\\\"J02012\\\\",\\\\"docStatus\\\\":\\\\"10\\\\",\\\\"docSubject\\\\":\\\\"因为...试制某个车型\\\\",\\\\"keyword\\\\":\\\\"J120141113001\\\\",\\\\"projectName\\\\":\\\\"BF三厢及备胎内置\\\\",\\\\"projectNo\\\\":\\\\"J15GGL01\\\\",\\\\"supplierNo\\\\":\\\\"DFGPV0005\\\\",\\\\"supplierPayType\\\\":\\\\"249\\\\",\\\\"supplierType\\\\":\\\\"2\\\\",\\\\"templateId\\\\":\\\\"149265841751ea00c477ba74a4d86168\\\\"}]\\\";
		// String tims =
		// \\"[{\\\"baseCreator\\\":\\\"J02012\\\",\\\"baseDept\\\":\\\"1520\\\",\\\"bills\\\":[{\\\"billNo\\\":\\\"JS0000000073\\\",\\\"billNumber\\\":\\\"1\\\",\\\"billPriceNoTax\\\":\\\"4556\\\",\\\"billRemark\\\":\\\"测试\\\",\\\"billTaxPrice\\\":\\\"17\\\",\\\"billTotalPrice\\\":\\\"\\\",\\\"billTypeName\\\":\\\"试制费\\\"}],\\\"busType\\\":\\\"试制费\\\",\\\"contractNo\\\":\\\"HT14111207\\\",\\\"contractPrice\\\":\\\"134002\\\",\\\"costCenterDept\\\":\\\"0031\\\",\\\"docCreator\\\":\\\"J02012\\\",\\\"docStatus\\\":\\\"10\\\",\\\"docSubject\\\":\\\"因为...试制某个车型\\\",\\\"keyword\\\":\\\"J120141113002\\\",\\\"projectName\\\":\\\"BF三厢及备胎内置\\\",\\\"projectNo\\\":\\\"J15GGL01\\\",\\\"supplierNo\\\":\\\"DFGPV0005\\\",\\\"supplierPayType\\\":\\\"\\\",\\\"supplierType\\\":\\\"2\\\",\\\"templateId\\\":\\\"149265841751ea00c477ba74a4d86168\\\"},{\\\"baseCreator\\\":\\\"J02012\\\",\\\"baseDept\\\":\\\"1520\\\",\\\"bills\\\":[{\\\"billNo\\\":\\\"JS0000000072\\\",\\\"billNumber\\\":\\\"1\\\",\\\"billPriceNoTax\\\":\\\"4556\\\",\\\"billRemark\\\":\\\"测试\\\",\\\"billTaxPrice\\\":\\\"17\\\",\\\"billTotalPrice\\\":\\\"\\\",\\\"billTypeName\\\":\\\"试制零件\\\"}],\\\"busType\\\":\\\"试制费\\\",\\\"contractNo\\\":\\\"HT14111207\\\",\\\"contractPrice\\\":\\\"134002\\\",\\\"costCenterDept\\\":\\\"0031\\\",\\\"docCreator\\\":\\\"J02012\\\",\\\"docStatus\\\":\\\"10\\\",\\\"docSubject\\\":\\\"因为...试制某个车型\\\",\\\"keyword\\\":\\\"J120141113001\\\",\\\"projectName\\\":\\\"BF三厢及备胎内置\\\",\\\"projectNo\\\":\\\"J15GGL01\\\",\\\"supplierNo\\\":\\\"DFGPV0005\\\",\\\"supplierPayType\\\":\\\"\\\",\\\"supplierType\\\":\\\"2\\\",\\\"templateId\\\":\\\"149265841751ea00c477ba74a4d86168\\\"}]\\";
		// String tims =
		// "[{\"baseCreator\":\"J01972\",\"docSubject\":\"LJ101（EJ02）(Y11G061D)试制费用\",\"supplierNo\":\"DFGPV0481\",\"busType\":\"试制费\",\"docStatus\":\"10\",\"docCreator\":\"J01972\",\"keyword\":\"FP14120019\",\"baseDept\":\"1520\",\"projectNo\":\"Y11G061D\",\"contractPrice\":\"73.48\",\"templateId\":\"149265841751ea00c477ba74a4d86168\",\"supplierType\":\"2\",\"supplierPayType\":\"249\",\"contractNo\":\"\",\"projectName\":\"LJ101（EJ02）\",\"costCenterDept\":\"1Z30\",\"bills\":[{\"billTaxPrice\":\"35\",\"billTotalPrice\":\"0\",\"billRemark\":\"\",\"billNo\":\"FP1412090901\",\"billNumber\":\"1\",\"billTypeName\":\"试制零件\",\"billPriceNoTax\":\"205.92\"},{\"billTaxPrice\":\"12.49\",\"billTotalPrice\":\"0\",\"billRemark\":\"\",\"billNo\":\"1412010501\",\"billNumber\":\"1\",\"billTypeName\":\"试制零件\",\"billPriceNoTax\":\"73.48\"},{\"billTaxPrice\":\"35\",\"billTotalPrice\":\"0\",\"billRemark\":\"\",\"billNo\":\"FP1412090901\",\"billNumber\":\"1\",\"billTypeName\":\"试制零件\",\"billPriceNoTax\":\"205.92\"},{\"billTaxPrice\":\"12.49\",\"billTotalPrice\":\"0\",\"billRemark\":\"\",\"billNo\":\"1412010501\",\"billNumber\":\"1\",\"billTypeName\":\"试制零件\",\"billPriceNoTax\":\"73.48\"}]}]";
		// System.out.println(service.addOtherFlow(tims));
	}
}
