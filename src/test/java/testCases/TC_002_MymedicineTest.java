package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MyMedicalPage;
import pageObject.WelcomePage;
import testBase.BaseClass;

public class TC_002_MymedicineTest extends BaseClass {
	
	@Test
	public void test_mymedicine() throws InterruptedException {
		logger.info("*** Starting TC_002_MymedicineTest  ***");
		WelcomePage wp=new WelcomePage(driver);
		wp.acceptCookies();
		wp.moveToCountry();
		wp.selectEnglish();
		wp.clickOnLoginBtn();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(rb.getString("email"));
		lp.enterPassword(rb.getString("password"));
		lp.clickOnContinueBtn();
		
		MyMedicalPage mp=new MyMedicalPage(driver);
		mp.clickOnAddvideo();
		mp.enterMedicineName(rb.getString("medicinename"));
		mp.clickOncontinuemp();
		mp.clickfeverradiobtn();
		mp.clickOncontinuebuttonm();
		System.out.println("video player displayed");
		//mp.switchToFrame();
		Thread.sleep(3000);
		mp.scroll();
		//expliit 
Thread.sleep(5000);
		mp.clickOnGoback();
		System.out.println("succesfully come back");
		
		logger.info("*** Finish mymedicalpage test ***");
		
	}

}
