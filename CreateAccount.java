package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		//Launching browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Login Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		//Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		//Creating account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("LocalName");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("SiteName");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("//a[text(),'Create Account Ignoring Duplicates']")).click();
		System.out.println("Successfully completed the account creation");
		driver.close();
			
		
	}

}
