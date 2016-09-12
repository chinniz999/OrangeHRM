package pack;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpaths {
	
	WebDriver driver;
	
	@Test
	public void checkXpath() throws InterruptedException{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.jabong.com/men/shoes/sports-shoes/?sort=price&dir=asc&tt=spo&s=1&rank=1&qc=sports%20shoes%20men");
		Thread.sleep(60000L);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='h4']//span[contains(text(),'Black')]"));
		for (int i = 0; i < ele.size(); i++) {
			String text=ele.get(i).getText();
			System.out.println(text);
		}
	}

}
