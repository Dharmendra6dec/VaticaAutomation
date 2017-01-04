package com.vaticahealth.vatica.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.utils.CommonCode;

public class SmokeTest2 extends TestAnnotation {

	LoginTest loginTest = new LoginTest();
	PHPTest phpTest = new PHPTest();
	HraTest hraTest = new HraTest();
	CommonCode common = new CommonCode();

	@Test(priority = 1)
	public void test1() throws Exception {
		common.implictWait(20);
		loginTest.tc_Login_1();

//		phpTest.searchNewHraAndVerifyHraStatus();

		// phpTest.colorcheck();

//		phpTest.checkFirstNameSortingonPHPGrid();
//		phpTest.checkLastNameSortingonPHPGrid();
//		phpTest.checkVisitDateSortingonPHPGrid();
	}

	@Test(priority = 2)
	public void test2() throws Exception {
		common.implictWait(20);
		phpTest.differentSiteSelection();
		phpTest.openRequiredHRA();
		hraTest.upgradeHRA();
		phpTest.searchNewHraAndVerifyHraDetails();
		phpTest.restoreRecord();

		phpTest.searchNewHraAndVerifyHraStatus();

		// phpTest.colorcheck();

		/*
		 * phpTest.checkFirstNameSortingonPHPGrid();
		 * phpTest.checkLastNameSortingonPHPGrid();
		 * phpTest.checkVisitDateSortingonPHPGrid();
		 * 
		 * phpTest.differentSiteSelection(); phpTest.openRequiredHRA();
		 * hraTest.upgradeHRA(); phpTest.searchNewHraAndVerifyHraDetails();
		 * phpTest.restoreRecord();
		 */
	}
}
