package com.vaticahealth.vatica.pages;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;



/**
 * Hello world!
 *
 */
public class App 

{
	Configuration c = new Configuration();
	public WebDriver driver = Configuration.broswer();
	String url = Configuration.invokeUrl();
	CommonCode cc = new CommonCode();
	public App()
	{

	PageFactory.initElements(driver, this);
	
	}
	@Test
	public void pro() throws AddressException, MessagingException
	{
		cc.sendMail();
	}
	
    
}
