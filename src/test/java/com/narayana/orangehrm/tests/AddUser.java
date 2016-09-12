package com.narayana.orangehrm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.narayana.orangehrm.utils.SelectBox;

public class AddUser extends LoginHRM {

	
	
	@Test
	public void addSystemUser() {
		
		

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/admin/saveSystemUser");
		
		//Select UserRole
		
		WebElement userRole=driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
		SelectBox.selectElementUsingVisibleText(userRole, "ESS");
		
		//Choose Employee Name Auto DropDown
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Robert Craig");

		//Enter Username baes on Random userName Generator
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(userid1);
		
		
		WebElement status=driver.findElement(By.xpath("//select[@name='systemUser[status]']"));
		SelectBox.selectElementUsingIndex(status, 0);
		
		
		//Select Password
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys(userid1);
		
		//Confirm Password
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys(userid1);
		
		//Click on Save
		driver.findElement(By.xpath("//*[contains(@id,'btnSave')]")).click();
		
		/*boolean b = driver.findElements(By.xpath("//a[contains(text(),"+LoginHRM.userid1+")"+"]")).size()!= 0;
		Assert.assertTrue(b);*/

	}

}
