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
	CreateHraTest createHra = new CreateHraTest();
	HraTest hra = new HraTest();
	
	// Smoke Suite 
	@Test
	public void smokeTest() throws InvocationTargetException, InterruptedException {
		
	loginTest.tc_Login_1();
	phpTest.tc_PHP_1();	
	createHra.tc_CreateHra_1();
	hra.tc_Hra_Bi_1();
	hra.tc_Hra_Pwl_1();
	hra.tc_Hra_Sh_1();
	hra.tc_Hra_fh_1();
	hra.tc_Hra_MedicalConditions_1();
	hra.tc_Hra_ROS_1();
	hra.tc_Hra_SelfAssessment_1();
	hra.tc_Hra_FallRisk_1();
	hra.tc_Hra_Biometrics_1();
	hra.tc_Hra_CognitiveAssessment_1();
	
	
	}
	
/*	
	
	
	
	
	
	
	@Test(alwaysRun = true, description = "")
	public void (){


	}
	
	@Test(alwaysRun = true, description = "")
	public void () throws InterruptedException, InvocationTargetException {


	} */
	
	
}
