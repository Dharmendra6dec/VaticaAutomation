package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Tests {
	CommonCode common = new CommonCode();
	WebDriver driver = Configuration.driver;
	PHP home = new PHP();
	// String url = Configuration.invokeUrl();

	/*@FindBy(xpath = Elements.)
	public WebElement ;*/

	public Tests() {
		PageFactory.initElements(driver, this);
	}
}