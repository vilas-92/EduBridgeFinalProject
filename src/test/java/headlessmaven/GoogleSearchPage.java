package headlessmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		
	}
	By searchbox = By.xpath("//textarea[@id='APjFqb']");
	By btnclick = By.name("btnK");
	By facelink = By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]");
	
	
	public void searchgoogle( String Searchinput){
	
		
		
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(3000);
			driver.findElement(btnclick).click();
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("Exception caught"+ e.getMessage());
			
		}	
	}
	public void Clickfacebook() {
		try {
			driver.findElement(facelink).click();
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("Exception caught"+ e.getMessage());
		}
		
	}
	
	
	

}
