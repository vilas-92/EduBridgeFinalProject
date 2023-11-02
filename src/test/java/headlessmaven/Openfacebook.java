package headlessmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openfacebook {
WebDriver driver;
	

	//@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();
		driver =  (WebDriver) new ChromeDriver(option);
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		
		
	}
	
	
	@Test
	public void SearchOpration() throws Exception {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
		System.out.println("Title is  brfore test: "+ driver.getTitle() );
	}
	@Test
	public void VerifyFacebook() {
		
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.Clickfacebook();
		
		System.out.print("Title is arfore test: "+ driver.getTitle() );
		
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}


}
