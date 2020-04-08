package newTours.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CruiseBookingApp {
	@Test(priority=3)
	public void CruiseBooking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\EdurekaMavenDev\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Crise booking process started", true);
		driver.findElement(By.xpath("//a[text()='Cruises']")).click();		
		driver.findElement(By.xpath("//img[@alt='Reservations Open']")).click();		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");		
		driver.findElement(By.xpath("//input[@name='login']")).click();		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("TestMember1");		
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Test");		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(5000);
		Reporter.log("Cruise booking is successful",true);
		System.out.println("Cruise booking is successful");	
		driver.close();
	}
}
