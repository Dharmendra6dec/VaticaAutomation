package com.vaticahealth.vatica.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import javax.sound.sampled.DataLine.Info;

import org.apache.commons.collections.map.StaticBucketMap;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class Configuration {
	public static Properties properties = new Properties();
	public static String filepath ;
	public static String currentDirec=System.getProperty("usr.dir");
	public static WebDriver driver;
	public static FileInputStream in;
	public static String URL;
	public static String broswer;
	public static String env;
	

	public static WebDriver broswer() {
		
		if (broswer.equalsIgnoreCase("mozilla"))
		{
			
			
			driver = new FirefoxDriver();
			Reporter.log("Mozilla is envoked");
			System.out.println("here");
			return driver;
		}
		else if (broswer.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.ie.driver",System.getProperty("usr.dir")+"/src/test/resources/IEDriverServer.exe" );
			driver= new InternetExplorerDriver();
			Reporter.log("I.E is invoked" );
			System.out.println("there");
			return driver;
		}
		else if (broswer.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("usr.dir")+"/src/test/resources/chromedriver.exe" );
			driver = new ChromeDriver();
			Reporter.log("Chrome driver is invoked");
			System.out.println("there");
			return driver;
		}
		else if (broswer.equalsIgnoreCase("Safari")) {
			driver=new SafariDriver();
			Reporter.log("Safari broswer is ivoked");
			System.out.println("there");
			return driver;
			
		}
		//return driver;
		return driver;
		
		
		
		
	}
	static
	{
		
		
		try {
			if(System.getProperty("env")==null)
			{
				filepath="/src/test/resources/QA-Environment.properties";
				in = new FileInputStream(System.getProperty("user.dir")+filepath);
				properties.load(in);
			}
			
			
			else if (env.equalsIgnoreCase("qa")) {
				filepath="/src/test/resources/QA-Environment.properties";
				in = new FileInputStream(System.getProperty("user.dir")+filepath);
				properties.load(in);
				System.out.println("I am Here 2");
				env= properties.getProperty("env");
				
			}
	
			 else if (env.equalsIgnoreCase("dev")) {
				filepath="/src/test/resources/Dev-Environment.properties";
				in= new FileInputStream(System.getProperty("user.dir")+filepath);
				properties.load(in);
				System.out.println("here3");
				env= properties.getProperty("env");
			
				
			}
			
			
			
			
			 
			env= properties.getProperty("env");
			URL= properties.getProperty("url");
			broswer = properties.getProperty("broswer");
			
			
			//System.out.println(URL);
			//System.out.println(broswer);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	public static String invokeUrl()
	{
		Reporter.log("URL is "+URL);
		return URL;
	}
	
		
		
		
	
	
	

}
