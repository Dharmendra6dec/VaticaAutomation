package com.vaticahealth.vatica.tests;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.utils.CommonCode;

public class Try extends TestAnnotation{

	LoginTest loginTest = new LoginTest();
	PHPTest phpTest = new PHPTest();
	CommonCode common = new CommonCode();
	CreateHraTest createHra = new CreateHraTest();
	HraTest hra = new HraTest();
	TestsTest test = new TestsTest();
	DiagnosisTest diagTest = new DiagnosisTest();
	

	@Test
	public void tryIt() throws Throwable {
		
		loginTest.tc_Login_1();
		Thread.sleep(5000);
	//	phpTest.verifyOneRowOnPhp();
		phpTest.logout();
		
	//	home.logoCheck();
		
		
		/*phpTest.php_doubleClickHRA();
		if(driver.findElement(By.xpath("//button[text()='Close']")).isEnabled()) {
			driver.findElement(By.xpath("//button[text()='Close']")).click();
		}
		//hra.tTabClick();
		//test.tc_tt_1();
		hra.dTabClick();
		//diagTest.tc_dt_1();
		Thread.sleep(10000);
		diag.SaveNextBtn.click();
		Thread.sleep(10000);
		diag.clickSignHra();*/
		System.out.println("Done");
		
		
	}
}
