package headlessmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Test {
	@Test
	public  void Browser() {
		
		FirefoxOptions option = new FirefoxOptions();

		option.addArguments("--headless");

		WebDriverManager.firefoxdriver().setup();



		WebDriver driver = new FirefoxDriver(option);

		driver.get("https://www.google.com/");
		System.out.println("Title is :" + driver.getTitle());

		
		WebElement sarch = driver.findElement(By.name("q"));
		
		sarch.sendKeys("India Gate");
		sarch.sendKeys(Keys.ENTER);
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	System.out.print("Title is before :" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.close();
	}

}
