package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicsAssignment {

	public static void main(String[] args) {
	
				//Driver setup
				WebDriverManager.chromedriver().setup();
				//Opening Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				//Loading the URL
				driver.get("https://acme-test.uipath.com/login");
				//Maximizing the browser
				driver.manage().window().maximize();
				//Login Credentials
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
				String test3 = driver.findElement(By.xpath("//div[@class='main-container']/h1")).getText();
				System.out.println(test3);
								
	}

}
