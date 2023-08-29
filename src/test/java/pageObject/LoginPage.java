package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Element
	
	@FindBy(xpath="//input[@id='txtLpEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='txtLpPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	WebElement continueButton;
	
	
	
	//Actions
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
		
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnContinueBtn() {
		continueButton.click();
		
	}
	
	
	
	
	
}
