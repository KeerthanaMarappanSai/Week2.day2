package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
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
				//Finding account
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Find Accounts')]")).click();
				driver.findElement(By.id("ext-gen27")).sendKeys("Credit Limited Account");
				driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
				Thread.sleep(10000);
				//driver.findElement(By.xpath("(//a[contains(text(),'Credit Limited Account')])[3]")).click();
				driver.findElement(By.linkText("accountlimit100")).click();
				Thread.sleep(10000);
				String AccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
				System.out.println("Account name is: "+AccountName);
				String Description = driver.findElement(By.xpath("(//td[@class='tabletext'])[1]")).getText();
				System.out.println("Description is: "+Description);
				driver.close();
				
	}

}
