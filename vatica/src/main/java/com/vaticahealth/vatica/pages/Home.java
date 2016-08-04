package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.Elements;

public class Home {
 WebDriver driver= Configuration.driver;
	
	@FindBy(xpath=Elements.logOut)
	public WebElement logOut;
	
	public Home()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logOut()
	{
		logOut.click();
	}

}
