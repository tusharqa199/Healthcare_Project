package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
		
	}
	//Element
	@FindBy(xpath="//ul[@class='languagepicker']")
	WebElement country;
	
	@FindBy(xpath="//img[@option-code='en']")
	WebElement english;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@class='btn-landing']")
	WebElement startButton;
	
	@FindBy(id="gdpr-cookie-accept")
	WebElement cookies;
	
	
	//Action
	
	public void acceptCookies() {
		cookies.click();
	}
	
	public void moveToCountry() {
	Actions act=new Actions(driver);
	act.moveToElement(country).build().perform();
	}
	
	public void selectEnglish() {
		english.click();
	}
	
	public void goToCareProvider() {
		startButton.click();
	}
	
	public void clickOnLoginBtn() {
		loginButton.click();
		
	}
	
	

}
