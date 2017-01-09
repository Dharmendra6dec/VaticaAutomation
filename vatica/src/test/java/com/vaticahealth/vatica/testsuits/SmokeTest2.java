package com.vaticahealth.vatica.testsuits;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.TestAnnotation;
import com.vaticahealth.vatica.config.VaticaInterface;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.MailConfig;
import com.vaticahealth.vatica.utils.MonitoringMail;

public class SmokeTest2 extends TestAnnotation implements VaticaInterface {

	@Test(priority = 1)
	public void test1() throws Exception {
		common.implictWait(40);
		loginTest.tc_Login_1();
		home.searchHraWithFirstName("Goku");

		home.GridPppBtn.click();
	
		pppTest.verifyHeaderOf_PPPTab();
		pppTest.verifyTextOfLinksOnPPP();
		pppTest.verifyDataOn_Introduction_TabOnPPP();
		pppTest.verifyDataOn_CurrentHealthAnalysis_TabOnPPP();
		pppTest.verifyDataOn_PersonalisedHealthAdvice_TabOnPPP();
		pppTest.verifyDataOn_ScreeningSchedule_TabOnPPP();
		pppTest.verifyDataOn_CommunityBasedResources_TabOnPPP();
	
		pppTest.verifyPPP_Report_TabOnPPP();

	}
	
	@Test(priority = 2)
	public void QuitDriver() throws AddressException, MessagingException{
		
		//send mail
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(MailConfig.server, MailConfig.from, MailConfig.to, MailConfig.subject, MailConfig.messageBody, MailConfig.attachmentPath, MailConfig.attachmentName);
		//driver.quit();
		
	}
}
