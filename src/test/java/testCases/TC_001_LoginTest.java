package testCases;


import org.testng.annotations.Test;


import pageObject.LoginPage;
import pageObject.WelcomePage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {
	
	
	
	
	@Test
	void test_login()
	{
		logger.info("*** Starting TC_001_LoginTest ***");
		//try
		//{
		WelcomePage wp=new WelcomePage(driver);
		wp.acceptCookies();
		wp.moveToCountry();
		wp.selectEnglish();
		wp.clickOnLoginBtn();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(rb.getString("email"));
		lp.enterPassword(rb.getString("password"));
		lp.clickOnContinueBtn();
		logger.info("Clicked on continue");
		
		//}
		
		//catch(Exception e)
		//{
		//	Assert.fail();
		//}
		logger.info("Finish loggin test");
	}
	

}
