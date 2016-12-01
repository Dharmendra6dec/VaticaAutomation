package com.vaticahealth.vatica.tests;

import com.vaticahealth.vatica.utils.CommonCode;

public class TestsTest extends TestAnnotation{
	
	CommonCode common = new CommonCode();
	
	// Filling the Test Page correctly
	public void tc_tt_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(20000);
		test.IppeRadioButton.click();
		test.Hgb1acTestReject.click();
		System.out.println("HgB1AC test rejected");
		test.LipidProfileTestReject.click();
		System.out.println("Lipid profile test rejected");
		test.PreventiveServiceSelectAll.click();
		test.OtherClinicalTestSelectAll.click();
		test.AddTest.click();
		test.VitaminDTest.click();
		test.AddSelectedTest.click();
	}
	
	

}
