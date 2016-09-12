package pack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUser extends LoginHRM {

	@Test
	public void deleteFollowing() throws InterruptedException {
		
		System.out.println(LoginHRM.userid1);
		
		String x="//a[contains(text(),"+LoginHRM.userid1+")"+"]";
		System.out.println(x);
		Thread.sleep(5000L);
		driver.findElement(By.xpath(x+"/preceding::input[1]")).click();
		driver.findElement(By.xpath("//input[@name='btnDelete']")).click();
		driver.findElement(By.xpath("//*[@id='dialogDeleteBtn']")).click();
		boolean b = driver.findElements(By.xpath(x)).size() != 0;
		Assert.assertFalse(b);
	}
}
