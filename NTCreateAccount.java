package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		//Driver setup
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximizing the browser
		driver.manage().window().maximize();
		//Login Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Navigating to next page using text locator
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		//Creating account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//Using selectByValue
		Select Currency = new Select(driver.findElement(By.id("currencyUomId")));
		Currency.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("LocalName");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LocalName");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Error Message
		String ErrorMessage = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println("Error Message is: "+ErrorMessage);
		driver.close();
		
	}

}
