package com.vaticahealth.vatica.tests;

import com.vaticahealth.vatica.utils.CommonCode;

public class PHPTest extends TestAnnotation {

	CommonCode common = new CommonCode();

	// Clicking on 'Add New Visit' from the PHP
	public void tc_PHP_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.AddNewVisitBtn.click();

	}

	// Clicking on John Doe HRA from the PHP
	public void pHP_doubleClickHRA() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.doubleClick(driver, home.DoeHra);

	}

}
