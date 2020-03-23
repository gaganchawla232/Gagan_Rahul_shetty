package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test
	public void tc01() {
		System.setProperty("webdriver.chrome.driver", "./Driverexecutable/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//System.out.println("gagan");
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		driver.quit();
		
	}}