package newTours.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginToApp {
	@Test(priority=1)
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\EdurekaMavenDev\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Login process started", true);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("naren1234");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");	
		driver.findElement(By.xpath("//input[@name='login']")).click();	
		Thread.sleep(5000);
		Reporter.log("Login is successful",true);
		System.out.println("Login successful");
		driver.close();
	}

}
