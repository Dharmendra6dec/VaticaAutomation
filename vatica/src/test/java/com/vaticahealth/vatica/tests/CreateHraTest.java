package com.vaticahealth.vatica.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.vaticahealth.vatica.utils.CommonCode;

public class CreateHraTest extends TestAnnotation{
	CommonCode common = new CommonCode();

	// Creating a Hra and filling the necessary information till HRA page
	public void tc_CreateHra_1 () throws InterruptedException {
		
		common.implictWait(10);
		Thread.sleep(15000);
		String MedicareNumber = common.tenDigitNumberGenerator();
	//	common.writeExcel("Medicare Number", MedicareNumber, "hra");
		String FirstName = common.firstNameGenerator();
	//	common.writeExcel("First Name", FirstName, "hra");
		String LastName = 	common.LastNameGenerator();	
	//	common.writeExcel("Last Name", LastName, "hra");
		String DOB = common.readExcel("hra", "DOB");
		
		createHra.MedicareNumber.sendKeys(MedicareNumber);
		createHra.FirstName.sendKeys(FirstName);
		createHra.LastName.sendKeys(LastName);
		createHra.DOB.sendKeys(DOB);
		createHra.DOB.sendKeys(Keys.TAB);
		createHra.NextBtn.click();
		
		
		// Click on confirm button and confirming details (first, last name, DOB and Medicare number)
		Thread.sleep(5000);
		Assert.assertTrue(FirstName.equalsIgnoreCase(createHra.FirstNameValue.getText().toString()), "First Name is different");
		Assert.assertTrue(LastName.equalsIgnoreCase(createHra.LastNameValue.getText().toString()), "Last Name is different");
		Assert.assertTrue(MedicareNumber.equalsIgnoreCase(createHra.MedicareValue.getText().toString()), "Medicare number is different");
		Assert.assertTrue(DOB.equalsIgnoreCase(createHra.DobValue.getText().toString()), "DOB is different");
		
		createHra.selectByValue(createHra.ConfirmPatientInsurance, Integer.parseInt(common.readExcel("hra", "Insurance")));
		createHra.ConfirmPatientInsurance.sendKeys(Keys.TAB);
		createHra.ConfirmPatientBtn.click();
		Thread.sleep(5000);
		createHra.ConfirmNewHraBtn.click();
		Thread.sleep(15000);
	}

}
