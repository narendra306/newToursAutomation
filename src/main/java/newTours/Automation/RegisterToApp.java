package newTours.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterToApp {
	@Test(priority=0)
	public void Register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\EdurekaMavenDev\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Registartion process started", true);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Narendra");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kudumula");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Narendra@test.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Test2");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560066");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("naren1234");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(6000);
		Reporter.log("Registration successful",true);
		System.out.println("Registration is successful!");
		driver.close();
	}

}
