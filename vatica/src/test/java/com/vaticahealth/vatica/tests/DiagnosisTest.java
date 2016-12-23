package com.vaticahealth.vatica.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.vaticahealth.vatica.utils.CommonCode;

public class DiagnosisTest extends TestAnnotation {

	CommonCode common = new CommonCode();

	// Filling the Diagnosis Sheet Completely
	public void tc_dt_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		diag.Disease6Reject.click();
		Thread.sleep(5000);
		diag.ConditionsNotExist.click();
		diag.RejectComments.sendKeys("Incorrect Disease");
		diag.ConfirmRejectButton.click();

		diag.Disease5Reject.click();
		Thread.sleep(5000);
		diag.ConditionsNotExist.click();
		diag.RejectComments.sendKeys("Incorrect Disease");
		diag.ConfirmRejectButton.click();

		diag.Disease4Reject.click();
		Thread.sleep(5000);
		diag.ConditionsNotExist.click();
		diag.RejectComments.sendKeys("Incorrect Disease");
		diag.ConfirmRejectButton.click();

		diag.Disease3Accept.click();
		Thread.sleep(5000);
		diag.FirstIcdCodeSelect.click();
		diag.AcceptNextBtn.click();
		Thread.sleep(5000);
		diag.ContinueToMonitorCB.click();
		diag.EkgCB.click();
		diag.EkgDate.sendKeys("11 11 2016");
		diag.EkgDate.sendKeys(Keys.TAB);
		diag.InRemissionCB.click();
		diag.ContinueCurrentTreatmentCB.click();
		diag.MeatMedicationCB.click();
		diag.MeatComments.sendKeys("This is a test comment.");
		diag.MeatSaveChangesBtn.click();

		diag.Disease2Accept.click();
		Thread.sleep(5000);
		diag.FirstIcdCodeSelect.click();
		diag.AcceptNextBtn.click();
		Thread.sleep(5000);
		diag.ContinueToMonitorCB.click();
		diag.EkgCB.click();
		diag.EkgDate.sendKeys("11 11 2016");
		diag.EkgDate.sendKeys(Keys.TAB);
		diag.InRemissionCB.click();
		diag.ContinueCurrentTreatmentCB.click();
		diag.MeatMedicationCB.click();
		diag.MeatComments.sendKeys("This is a test comment.");
		diag.MeatSaveChangesBtn.click();

		diag.Disease1Accept.click();
		Thread.sleep(5000);
		diag.FirstIcdCodeSelect.click();
		diag.AcceptNextBtn.click();
		Thread.sleep(5000);
		diag.ContinueToMonitorCB.click();
		diag.EkgCB.click();
		diag.EkgDate.sendKeys("11 11 2016");
		diag.EkgDate.sendKeys(Keys.TAB);
		diag.InRemissionCB.click();
		diag.ContinueCurrentTreatmentCB.click();
		diag.MeatMedicationCB.click();
		diag.MeatComments.sendKeys("This is a test comment.");
		diag.MeatSaveChangesBtn.click();
		try {
			Assert.assertTrue(diag.AcceptedCount.getText().equals("Accepted - 3"), "Accept count is incorrect");
			Assert.assertTrue(diag.RejectedCount.getText().equals("Rejected - 3"), "Reject count is incorrect");
			Assert.assertTrue(diag.HomeCount.getText().equals("Home - 0"), "Home count is incorrect");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something wrong happened with the count.");
		}

	}

	// Sign a HRA and confirmation to the PHP
	public void tc_td_2() throws InterruptedException {
		common.implictWait(20);
		Thread.sleep(10000);
		diag.SaveNextBtn.click();
		Thread.sleep(15000);
		diag.clickSignHra();
		Thread.sleep(15000);
		Assert.assertTrue(diag.EsignSuccessMsg.getText().equals("Electronically signed by Demo Test."),
				"The Esign success message is different");
		common.explictWaitClickable(20, diag.EsignSuccessOk);
	//	diag.EsignSuccessOk.click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().toString().equals("Vatica Health"), "Incorrect page has been rendered.");
	}

}
