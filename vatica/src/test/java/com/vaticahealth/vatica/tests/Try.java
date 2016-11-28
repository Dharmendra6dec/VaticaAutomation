package com.vaticahealth.vatica.tests;

import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import com.vaticahealth.vatica.utils.CommonCode;

public class Try extends TestAnnotation{

	LoginTest loginTest = new LoginTest();
	PHPTest phpTest = new PHPTest();
	CommonCode common = new CommonCode();
	CreateHraTest createHra = new CreateHraTest();
	HraTest hra = new HraTest();
	TestsTest test = new TestsTest();
	
	@Test
	public void tryIt() throws InvocationTargetException, InterruptedException {
		
		loginTest.tc_Login_1();
		phpTest.pHP_doubleClickHRA();
		hra.tTabClick();
		test.tc_tt_1();
		
	}
}
