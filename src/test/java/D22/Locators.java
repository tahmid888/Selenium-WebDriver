package D22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/");
		driver.manage().window().maximize();
		
		//Name
		//driver.findElement(By.name("search")).sendKeys("Mac");
	
		//id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
	
		//LinkedText & PartialLinkedText
		//driver.findElement(By.linkText("Tablets")).click();
	    //driver.findElement(By.partialLinkText("Table")).click();
	
		//className
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total Number of Links: "+headerLinks.size());
	
		//tagName
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of Links: "+links.size());
	
	
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    System.out.println("Total Number of Images: "+images.size());
	}

}
