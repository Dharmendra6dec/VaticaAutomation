package com.vaticahealth.vatica.tests;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;

public class SmokeTest extends TestAnnotation {

	LoginTest loginTest = new LoginTest();
	PHPTest phpTest = new PHPTest();
	CommonCode common = new CommonCode();
	CreateHraTest createHraTest = new CreateHraTest();
	HraTest hraTest = new HraTest();
	TestsTest testTest = new TestsTest();
	
	// Smoke Suite 
	@Test
	public void smokeTest() throws InvocationTargetException, InterruptedException {
		
	//loginTest.tc_Login_2();
	//loginTest.tc_Login_3();
	loginTest.tc_Login_4();
	
	/*
	loginTest.tc_Login_1();
	phpTest.tc_PHP_1();	
	createHraTest.tc_CreateHra_1();
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
	hraTest.tTabClick();
	testTest.tc_tt_1();
	*/
	
	}
	
/*	
	
	
	
	
	
	
	@Test(alwaysRun = true, description = "")
	public void (){


	}
	
	@Test(alwaysRun = true, description = "")
	public void () throws InterruptedException, InvocationTargetException {


	} */
	
	
}
