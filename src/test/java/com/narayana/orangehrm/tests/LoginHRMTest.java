package com.narayana.orangehrm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginHRMTest {

	WebDriver driver;

	@Test
	@Parameters({ "uName", "pswd" })
	public void logintoHRM(@Optional String uName, @Optional String pswd) {
		
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys(uName);
		driver.findElement(By.xpath(".//*[@value='LOGIN']/preceding::input[1]")).sendKeys(pswd);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
