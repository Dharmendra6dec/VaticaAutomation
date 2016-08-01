package com.vaticahealth.vatica;
import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.pages.App;
import com.vaticahealth.vatica.utils.CommonCode;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



public class test {
	Configuration c = new Configuration();
	WebDriver driver = Configuration.broswer();
	String url = Configuration.invokeUrl();
	CommonCode obj=new CommonCode();
	
	@Test
	public void pro()
	{
		App k = new App();
		k.pro();
		System.out.println("ram");
		System.out.println(obj.readExcel("my","laksh"));
		obj.writeExcel("li", "vi","my");
		obj.explictWait(10, "jkj",By.xpath(""));
		
	}
	

}
