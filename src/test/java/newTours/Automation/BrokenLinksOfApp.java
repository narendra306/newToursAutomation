package newTours.Automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BrokenLinksOfApp {
	@Test(priority = 4)
	public void BrokenLinks() {
		System.setProperty("webdriver.chrome.driver", "C:\\EdurekaMavenDev\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			verifyLink(url);
		}
		driver.close();
	}

	public static void verifyLink(String urlLink) {
		try {
			URL link = new URL(urlLink);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
			if (httpConn.getResponseCode() == 200) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
			}
			if (httpConn.getResponseCode() == 404) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

}
