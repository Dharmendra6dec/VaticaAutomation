package com.vaticahealth.vatica.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.text.Position;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.Locator;

import com.google.common.base.Function;
import com.vaticahealth.vatica.config.Configuration;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
//import vatica_util.TestConfig;
//import vatica_util.monitoringMail.SMTPAuthenticator;

public class CommonCode {
	Configuration c = new Configuration();
	WebDriver driver= c.driver;
	String parentWindow;
	int row, column, adjRow, adjCol;
	
	public static String value;
	public static String filename = "C:/Users/Lakshya Grover/Desktop/jin.xls";

	public String readExcel(String sheetName, String searchedString) {
		try {

			Workbook book = Workbook.getWorkbook(new File(filename));
			Sheet sh = book.getSheet(sheetName);
			Cell c = sh.findCell(searchedString);
			row = c.getRow();
			column = c.getColumn();
			Cell adjCell = sh.getCell(++column, row);
			String value = adjCell.getContents();
			return value;

		} catch (BiffException e) {
			System.out.println("catch1");

		} catch (IOException e) {
			System.out.println("catch2");
		}
		return value;
	}

	public void writeExcel(String header, String value, String sheetName) {
		try {
			Workbook book = Workbook.getWorkbook(new File(filename));
			WritableWorkbook writeBoook = Workbook.createWorkbook(new File(filename), book);
			WritableSheet writeSheet = writeBoook.getSheet(sheetName);
			int row = writeSheet.getRows();
			Label lb = new Label(0, row, header);
			Label lb1 = new Label(1, row, value);

			writeSheet.addCell(lb);
			writeSheet.addCell(lb1);
			writeBoook.write();
			writeBoook.close();

		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void implictWait(Long timeInSeconds)
	{
	driver.manage().timeouts().implicitlyWait(timeInSeconds,TimeUnit.SECONDS );	
	}
	public void explictWait(int i,String element,By by)
	{
		WebDriverWait wait= new WebDriverWait(driver,i);
		WebElement j=driver.findElement(By.id("hh"));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public void windowHandler(String windowTitle)
	{
		parentWindow= driver.getWindowHandle();
		Set<String> handles= driver.getWindowHandles();
		for (String tempHandle:handles)
		{
			driver.switchTo().window(tempHandle);
			String title=driver.getTitle();
			if (title.equalsIgnoreCase(windowTitle))
			{
				break;
			}
		}
		
	}
	public void mainwindow()
	{
		driver.switchTo().window(parentWindow);
	}
	/*public void email()
	{
		String to = "lakshg07@gmail.com";
		String from ="l.akshg07@gmail.com";
	String host ="smtp.journaldev.com";
	try {
	Properties pro=System.getProperties();
	pro.setProperty("mail.smtp.host",host );
	Session session=Session.getDefaultInstance(pro);
	MimeMessage message = new MimeMessage(session);
	message.setFrom(new InternetAddress(from));
	message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	message.setSubject("hi this is header");
	BodyPart bodyMessage=new MimeBodyPart();
	bodyMessage.setText("hi this is text");
	MimeBodyPart attchment=new MimeBodyPart();
	String filePath= "C:/Users/Lakshya Grover/Desktop/view-bill.pdf";
	DataSource fileSource=new FileDataSource(filePath);
	attchment.setDataHandler(new DataHandler(fileSource));
	attchment.setFileName(filePath);
	
	Multipart multi = new MimeMultipart();
	multi.addBodyPart(bodyMessage);
	multi.addBodyPart(attchment);
	
	message.setContent(multi);
	
	Transport.send(message);
	System.out.println("send");
	
	
	
	
	
	
	
	} catch (AddressException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}
	*/
	
	
	public void sendMail(String mailServer, String from, String[] to, String subject, String messageBody, String attachmentPath, String attachmentName) throws MessagingException, AddressException
	{
		boolean debug = false;
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable","true");
		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.debug", "true");
		
	     props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
	     props.setProperty("mail.smtp.socketFactory.fallback", "false");   
	     props.setProperty("mail.smtp.port", "465");   
	     props.setProperty("mail.smtp.socketFactory.port", "465"); 

		
		  Authenticator auth = new SMTPAuthenticator();
		    Session session = Session.getDefaultInstance(props, auth);

		    session.setDebug(debug);
		
		try
		{
			
			
			Transport bus = session.getTransport("smtp");
			bus.connect();
            Message message = new MimeMessage(session);
        
         //X-Priority values are generally numbers like 1 (for highest priority), 3 (normal) and 5 (lowest).
            
             message.addHeader("X-Priority", "1");
             message.setFrom(new InternetAddress("lakshg07@gmail.com"));
             InternetAddress[] addressTo = new InternetAddress[to.length];
             for (int i = 0; i < to.length; i++)
      		 addressTo[i] = new InternetAddress("laksh.g07@gmail.com");
             message.setRecipients(Message.RecipientType .TO, addressTo);
             message.setSubject(subject);
                  
             
             BodyPart body = new MimeBodyPart();

            // body.setText(messageBody);
            body.setContent(messageBody,"text/html");

             BodyPart attachment = new MimeBodyPart();
             DataSource source = new FileDataSource("C:/Users/Lakshya Grover/Desktop");
             attachment.setDataHandler(new DataHandler(source));
             attachment.setFileName("view-bill.pdf");
             MimeMultipart multipart = new MimeMultipart();
             multipart.addBodyPart(body);
             multipart.addBodyPart(attachment);
             message.setContent(multipart);
             Transport.send(message);
             System.out.println("Successfully Sent mail to All Users");
         	 bus.close();
    		
		}
		catch (MessagingException mex)
		{
            mex.printStackTrace();
        }		
	} 
	
	private class SMTPAuthenticator extends javax.mail.Authenticator
	{

	    public PasswordAuthentication getPasswordAuthentication()
	    {
	        String username = "lakshg07@gmail.com";
	        String password = "vasundhara344";
	        return new PasswordAuthentication(username, password);
	    }
	}
	
	
}

	


