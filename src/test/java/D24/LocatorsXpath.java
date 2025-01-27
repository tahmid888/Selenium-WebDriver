package D24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/");
		driver.manage().window().maximize();
		
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Tshirt");
	
		//XPath with multiple attribute
		//driver.findElement(By.xpath("//*[@id=\"search\"][@name=\"search\"]")).sendKeys("Tshirt");
	
		//XPath with 'and' operator 
		//driver.findElement(By.xpath("//*[@id='search' and @placeholder='Search']")).sendKeys("Tshirt");

		//XPath with 'or' operator
		//driver.findElement(By.xpath("//*[@id='search' or @name='seeeee']")).sendKeys("Tshirt");

		//XPath with text()- inner text
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		// inner text without link-> <a>
	    //boolean displayText = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displayText);
		
		//String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		
		//XPath with contains()--> starting text, middle text, last text all approved
		//driver.findElement(By.xpath("//*[contains(@id, 'Sea')]")).sendKeys("t-SHIRT");

		//XPath with starts-with()--> Only starting text
		//driver.findElement(By.xpath("//*[starts-with(@id, 'Sea')]")).sendKeys("t-SHIRT");

		//chained XPath--> mixed of absolute and relative XPath-> looking for parent element which have attributes
		//boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		//System.out.println(status);
		
		
	}

}
