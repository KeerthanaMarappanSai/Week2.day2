package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAllMethods {

	public static void main(String[] args) {
		//Driver setup
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
		driver.get("http://leafground.com/pages/Edit.html");
		//Maximizing the browser
		driver.manage().window().maximize();
		//Method getTitle
		System.out.println("The title of this page is: "+driver.getTitle());
		//Method getCurrentURL
		System.out.println("The Current URL is: "+driver.getCurrentUrl());
		//Method getPageSource
		System.out.println("The Page source is: "+driver.getPageSource());
		//Method getAttribute
		WebElement Username = driver.findElement(By.name("username"));
		System.out.println("The Attribute of Get default text entered is "+Username.getAttribute("value"));
		//Method isDisplayed
		System.out.println((driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"))).isDisplayed());
		//Method isEnabled
		System.out.println((driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"))).isEnabled());
		System.out.println((driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"))).isEnabled());
		driver.close();
		
		
		//New Driver
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver1 = new ChromeDriver();
		//Loading the URL
		driver1.get("http://leafground.com/pages/Button.html");
		//Maximizing the browser
		driver1.manage().window().maximize();
		//Method getCssValue
		System.out.println((driver1.findElement(By.id("color"))).getCssValue("color"));
		//Method getText
		System.out.println("The text in Click button to travel home page field is: "+(driver1.findElement(By.id("home"))).getText());
		//Method getSize
		System.out.println("The sixe of Find the height and width field is: "+(driver1.findElement(By.id("size"))).getSize().getWidth());
		driver1.close();
		
		
		
		//New Driver
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver2 = new ChromeDriver();
		//Loading the URL
		driver2.get("http://leafground.com/pages/Image.html");
		//Maximizing the browser
		driver2.manage().window().maximize();
		//Method getLocation
		System.out.println("Location of AM I Broken Imaage is: "+(driver2.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label"))).getLocation().getX());
		//Method getTagName
		System.out.println("TagName of AM I Broken Imaage is: "+(driver2.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label"))).getTagName());
		driver2.close();
		
		//New Driver
		WebDriverManager.chromedriver().setup();
		//Opening Chrome Browser
		ChromeDriver driver3 = new ChromeDriver();
		//Loading the URL
		driver3.get("http://leafground.com/pages/checkbox.html");
		//Maximizing the browser
		driver3.manage().window().maximize();
		//Method isSelected
		System.out.println("Is Option 3 Checked or not: "+(driver3.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"))).isSelected());
		System.out.println("Is I am Selected Checked or not: "+(driver3.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"))).isSelected());
		driver3.close();
		
	}

}
