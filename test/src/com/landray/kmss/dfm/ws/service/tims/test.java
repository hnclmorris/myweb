package com.landray.kmss.dfm.ws.service.tims;

public class test {
	public static void main(String[] args) throws Exception_Exception {
		IDfmEsbTimsServiceService services = new IDfmEsbTimsServiceService();
		IDfmEsbTimsService service = services.getIDfmEsbTimsServicePort();
		String tims = "[{\"baseCreator\":\"8114947\",\"baseDept\":\"1224.152000\",\"bills\":[{\"billNo\":\"BWJ20141216001\",\"billNumber\":\"1\",\"billPriceNoTax\":\"203.5\",\"billRemark\":\"\",\"billTaxPrice\":\"34.6\",\"billTotalPrice\":\"0\",\"billTypeName\":\"试制零件\"}],\"busType\":\"试制费\",\"contractNo\":\"HT14010704\",\"contractPrice\":\"238.1\",\"costCenterDept\":\"1224.152000\",\"docCreator\":\"8114947\",\"docStatus\":\"10\",\"docSubject\":\"胡海波报销试制费费用\",\"keyword\":\"FP141224009\",\"projectName\":\"猛士民用型--测试\",\"projectNo\":\"K13G0Y22\",\"supplierNo\":\"DFGPV0390\",\"supplierPayType\":\"249\",\"supplierType\":\"2\",\"templateId\":\"149265841751ea00c477ba74a4d86168\"}]";
		System.out.println(service.addOtherFlow(tims));
	}
}
