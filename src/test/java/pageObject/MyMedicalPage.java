package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyMedicalPage extends BasePage {
	
	public MyMedicalPage(WebDriver driver) {
		super(driver);
	}
		
		// Elements
		
		@FindBy(xpath="//a[@class='add-product']")
		WebElement addvideobtn;
		
		
		
		@FindBy(id="txtProductName")
		WebElement medicinenamebox;
		
		@FindBy(id="btnProductSubmit")
		WebElement continuebuttonmp; 
		
		@FindBy(xpath="//label[@for='Fever']")
		WebElement feverradiobtn;
		
		@FindBy(id="btnReasonSubmit")
		WebElement continuebuttonm;
		
		//@FindBy(id="video")
		//WebElement iframe;
		
		@FindBy(xpath="//path[@class='play']")
		WebElement playbtn;
		
		@FindBy(xpath="(//button[@id='btnVideoBack'])[1]")
		WebElement gobackbutton;
		

		
		//Action
		public void clickOnAddvideo() {
			addvideobtn.click();
			}
		public void enterMedicineName(String medicinename) {
			medicinenamebox.sendKeys(medicinename);
		}
		
		public void clickOncontinuemp() {
			continuebuttonmp.click();
		}
		public void clickfeverradiobtn() {
			feverradiobtn.click();
		}
		public void clickOncontinuebuttonm() {
			continuebuttonm.click();
		}
		//public void switchToFrame() {
			//driver.switchTo().frame(iframe);
		public void scroll(){
			js.executeScript("window.scrollBy(0,300)");//}
		
		}
			public void clickOnGoback() {
			gobackbutton.click();
		}

			
			
			
			
			
			
			
			
		
		
	}


