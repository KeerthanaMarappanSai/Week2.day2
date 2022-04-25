package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsBasicsXpath {

	public static void main(String[] args) {
		//Driver setup
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximizing the browser
		driver.manage().window().maximize();
		//Login Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Naviagting to next page using linktext locator
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		//Creating new Lead 
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//Providing Lead Details
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Keerthana");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Marappan");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Displaying LeadDetails
		String companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(companyName);
		String firstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(firstName);
		String lastName = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		System.out.println(lastName);
		
		
	}

}
