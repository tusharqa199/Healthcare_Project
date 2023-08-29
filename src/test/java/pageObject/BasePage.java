package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver,this);
		
	}
	

}
