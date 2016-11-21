package com.vaticahealth.vatica.tests;

import org.openqa.selenium.Keys;

import com.vaticahealth.vatica.utils.CommonCode;

public class CreateHraTest extends TestAnnotation{
	CommonCode common = new CommonCode();
	
	
	public void tc_CreateHra_1 () throws InterruptedException {
		
		common.implictWait(10);
		Thread.sleep(15000);
		createHra.MedicareNumber.sendKeys(common.readExcel("hra", "Medicare Number"));
		createHra.FirstName.sendKeys(common.readExcel("hra", "First Name"));
		createHra.LastName.sendKeys(common.readExcel("hra", "Last Name"));
		createHra.DOB.sendKeys(common.readExcel("hra", "DOB"));
		createHra.DOB.sendKeys(Keys.TAB);
		createHra.NextBtn.click();
		
		
		// Click on confirm button
		Thread.sleep(5000);
		createHra.ConfirmPatientBtn.click();
		Thread.sleep(5000);
		createHra.ConfirmNewHraBtn.click();
	}

}
