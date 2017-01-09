package com.vaticahealth.vatica.testsuits;

import java.awt.AWTException;
import java.lang.reflect.InvocationTargetException;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.TestAnnotation;
import com.vaticahealth.vatica.config.VaticaInterface;
import com.vaticahealth.vatica.utils.CommonCode;

public class SmokeTest extends TestAnnotation implements VaticaInterface {

	@Test(priority = 1, description = "login")
	public void smokeTest_login() throws Exception {
		common.implictWait(20);
		loginTest.tc_Login_1();
		phpTest.loginConf();
		phpTest.logoCheck();
		phpTest.siteCheck();
		phpTest.verifySiteOptions();
		phpTest.columnsOnGridCheck();
		phpTest.tc_PHP_1();

	}

	@Test(priority = 2, description = "hra creation ")
	public void smokeTest_hra_creation() throws InvocationTargetException, InterruptedException {
		common.implictWait(20);
		createHraTest.tc_CreateHra_1();
	}

	@Test(priority = 3, description = "hra completion ")
	public void smokeTest_hra_completion() throws InvocationTargetException, InterruptedException {
		common.implictWait(20);
		hraTest.tc_Hra_Bi_1();
		hraTest.tc_Hra_Pwl_1();
		hraTest.tc_Hra_Sh_1();
		hraTest.tc_Hra_fh_1();
		hraTest.tc_Hra_MedicalConditions_1();
		hraTest.tc_Hra_ROS_1();
		hraTest.tc_Hra_SelfAssessment_1();
		hraTest.tc_Hra_FallRisk_1();
		hraTest.tc_Hra_Biometrics_1();
		hraTest.tc_Hra_CognitiveAssessment_1();
	}

	@Test(priority = 4, description = "T tab completion ")
	public void smokeTest_ttab_completion() throws InvocationTargetException, InterruptedException {
		common.implictWait(20);
		hraTest.tTabClick();
		testTest.tc_tt_1();
	}

	@Test(priority = 5, description = "D tab completion")
	public void smokeTest_dtab_completion() throws InvocationTargetException, InterruptedException {
		common.implictWait(20);
		hraTest.dTabClick();
		diagTest.tc_dt_1();
		diagTest.tc_td_2();

	}

	@Test(priority = 6, description = "PHP Test cases")
	public void smokeTest_home_tcs() throws InvocationTargetException, InterruptedException, AWTException {
		common.implictWait(20);
		phpTest.verifyOneRowOnPhp();
		home.pdfReport();
		home.plainTextReport();
		phpTest.logout();

	}

}
