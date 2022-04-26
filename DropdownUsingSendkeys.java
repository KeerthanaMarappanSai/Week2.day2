package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("username")).sendKeys("Test");;
		driver.findElement(By.name("firstname")).sendKeys("Keerthana");
		driver.findElement(By.id("lastname")).sendKeys("Marappan");
		driver.findElement(By.name("country_id")).sendKeys("India");
			
		
	}
}
