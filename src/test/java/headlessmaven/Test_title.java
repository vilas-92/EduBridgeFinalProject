package headlessmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test_title {

	WebDriver driver;


	@BeforeTest
	public void BeforeOpen() {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(option);
		driver.get("https://www.google.com/");
		System.out.print("Title is brfore test "+ driver.getTitle() );
	}



	@Test
	public void test() {


		WebElement sarch = driver.findElement(By.name("q"));

		sarch.sendKeys("taj hotel");
		sarch.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));




	}

	@AfterTest
	public void AfterOpen() {

		System.out.println("Title is Before :" + driver.getTitle());

		driver.close();
	}

}
