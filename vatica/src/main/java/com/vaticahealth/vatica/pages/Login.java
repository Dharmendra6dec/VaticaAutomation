package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Login {
	CommonCode common = new CommonCode();
	WebDriver driver = Configuration.broswer();
	String url = Configuration.invokeUrl();
	
	@FindBy(xpath=Elements.loginId)
	public WebElement loginId;
	
	@FindBy(xpath=Elements.loginPassword)
	public WebElement loginPassword;
	
	@FindBy(xpath=Elements.loginButton)
	public WebElement loginbutton;
	
	@FindBy(xpath=Elements.webSiteOption)
	public WebElement webSiteOption;
	
	@FindBy(xpath=Elements.websiteSubmission)
	public WebElement websiteSubmission;
	
	@FindBy(xpath=Elements.resetButton)
	public WebElement resetButton;
	
	public void logging(String Id,String password)
	{
		loginId.sendKeys(Id);
		loginPassword.sendKeys(password);
	}
	public void loginButton()
	{
		loginbutton.click();
	}
	public void resetbutton()
	{
		resetButton.click();
	}
	public void websiteDropDown(String optionValue)
	{
		
		webSiteOption.click();
		Select selecting = new Select(webSiteOption);
		selecting.selectByVisibleText(optionValue);
		
	}
	public void selectWebsiteButton()
	{
		websiteSubmission.click();
	}
	
}
