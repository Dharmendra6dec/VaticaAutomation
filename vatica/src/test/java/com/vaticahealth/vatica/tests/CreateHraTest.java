package com.vaticahealth.vatica.tests;

import org.openqa.selenium.Keys;

import com.vaticahealth.vatica.utils.CommonCode;

public class CreateHraTest extends TestAnnotation{
	CommonCode common = new CommonCode();
	
	// Creating a Hra and filling the necessary information till HRA page
	public void tc_CreateHra_1 () throws InterruptedException {
		
		common.implictWait(10);
		Thread.sleep(15000);
		createHra.MedicareNumber.sendKeys(common.tenDigitNumberGenerator());
		createHra.FirstName.sendKeys(common.firstNameGenerator());
		createHra.LastName.sendKeys(common.LastNameGenerator());
		createHra.DOB.sendKeys(common.readExcel("hra", "DOB"));
		createHra.DOB.sendKeys(Keys.TAB);
		createHra.NextBtn.click();
		
		
		// Click on confirm button
		Thread.sleep(5000);
		createHra.selectByValue(createHra.ConfirmPatientInsurance, Integer.parseInt(common.readExcel("hra", "Insurance")));
		createHra.ConfirmPatientInsurance.sendKeys(Keys.TAB);
		createHra.ConfirmPatientBtn.click();
		Thread.sleep(5000);
		createHra.ConfirmNewHraBtn.click();
	}

}
