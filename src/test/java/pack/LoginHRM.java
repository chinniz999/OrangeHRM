package pack;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LoginHRM {

	public WebDriver driver;

	public static String userid1;
	
	@BeforeSuite
	public void randomGenerator(){
		
		Random rand = new Random();
		int num = rand.nextInt(50);

		String string = String.valueOf(num);
		String userid = "user" + string;
		userid1 = "'" + userid + "'";
		System.out.println(userid1);
	}

	@BeforeTest
	public void logintoHRM() {

		

		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
