package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {

	
	@Test
	public void tc01() {
		System.setProperty("webdriver.chrome.driver", "./Driverexecutable/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.id("query")).sendKeys("abcd");
		driver.close();
		
	}
	
}
