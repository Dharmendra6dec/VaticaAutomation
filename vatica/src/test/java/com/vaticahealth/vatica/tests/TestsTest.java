package com.vaticahealth.vatica.tests;

import com.vaticahealth.vatica.utils.CommonCode;

public class TestsTest extends TestAnnotation{
	
	CommonCode common = new CommonCode();
	
	// Filling the Test Page correctly
	public void tc_tt_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(5000);
		test.IppeRadioButton.click();
		test.PreventiveServiceSelectAll.click();
		test.OtherClinicalTestSelectAll.click();
		test.AddTest.click();
		test.VitaminDTest.click();
		test.AddSelectedTest.click();
		System.out.println(test.RejectTab.getText().toString());
		if((test.RejectTab.getText().toString()).equalsIgnoreCase("Rejected (0)")) {
			hra.Save_NextBtn.click();
		}
	}
	
	
	// Filling the 

}
