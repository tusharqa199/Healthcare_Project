package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.WelcomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDatadrivenTest extends BaseClass{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String Username,String password) {
		logger.info("*** Starting TC_003_LoginDatadrivenTest *** ");
		try
		{
		WelcomePage wp=new WelcomePage(driver);
		wp.acceptCookies();
		wp.moveToCountry();
		wp.selectEnglish();
		wp.clickOnLoginBtn();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(Username);
		lp.enterPassword(password);
		lp.clickOnContinueBtn();
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*** Finish TC_003_LoginDatadrivenTest *** ");
		
	}

}
