package com.vaticahealth.vatica.tests;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.utils.CommonCode;

public class LoginTest extends TestAnnotation{
	CommonCode common = new CommonCode();

	// Login in to the application with correct credentials and select the website 'Plus' from the dropdown of sites.
	public  void tc_Login_1() throws InterruptedException, InvocationTargetException {

		common.implictWait(20);
		log.logging(logIdSupp, logPassowrdSupp);
		log.loginButton();
		 Thread.sleep(5000);
		log.websiteDropDown(intff);
		//Thread.sleep(3000);
		log.selectWebsiteButton();

	}

	
	
}
