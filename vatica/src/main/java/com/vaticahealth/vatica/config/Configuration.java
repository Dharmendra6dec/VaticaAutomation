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
	public static String filepath;
	public static String currentDirec = System.getProperty("user.dir");
	public static WebDriver driver;
	public static FileInputStream in;
	public static String URL;
	public static String broswer;
	public static String env;
	public static String emailId;
	public static String emailPassword;
	public static String excelFilePath = currentDirec+"/src/test/resources/inputExcel.xls";

	// intializing the broswer driver
	public static WebDriver broswer() {

		// invoking mozilla firefox
		if (broswer.equalsIgnoreCase("mozilla")) {

			driver = new FirefoxDriver();
			Reporter.log("Mozilla is envoked");
			System.out.println("hereMozill");
			//return driver;
		}
		// Invoking Internet Explorer Broswer
		else if (broswer.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "/src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("I.E is invoked");
			System.out.println("heereIEEE");
			//return driver;
		}
		// Invoking the Google Chrome Broswer
		else if (broswer.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Chrome driver is invoked");
			System.out.println("chromein");
			//return driver;
		}
		// Invoking the Safari Broswer
		else if (broswer.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
			Reporter.log("Safari broswer is invoked");
			//eturn driver;

		}
		// return driver;
		return driver;

	}

	static {

		try {
			// getting the default Enviornment
			if (System.getProperty("env") == null) {
				filepath = "/src/test/resources/QA-Environment.properties";
				in = new FileInputStream(System.getProperty("user.dir") + filepath);
				properties.load(in);
			}

			// Getting the QA specific Enviornment
			else if (env.equalsIgnoreCase("qa")) {
				filepath = "/src/test/resources/QA-Environment.properties";
				in = new FileInputStream(System.getProperty("user.dir") + filepath);
				properties.load(in);
				env = properties.getProperty("env");

			}
			// getting the developer Specific Enviornment
			else if (env.equalsIgnoreCase("dev")) {
				filepath = "/src/test/resources/Dev-Environment.properties";
				in = new FileInputStream(System.getProperty("user.dir") + filepath);
				properties.load(in);
				env = properties.getProperty("env");

			}

			env = properties.getProperty("env"); // Env value from the
													// properties files
			URL = properties.getProperty("URL"); // URL from the properties
													// files
			broswer = properties.getProperty("broswer"); // Broswer from the
															// Properties files
			emailId = properties.getProperty("emailId");
			emailPassword = properties.getProperty("emailPassword");

			// System.out.println(URL);
			// System.out.println(broswer);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	// function would return the website URL
	public static String invokeUrl() {
		Reporter.log("URL is " + URL);
		return URL;
	}

}
