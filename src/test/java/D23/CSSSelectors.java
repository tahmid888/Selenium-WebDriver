package D23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	
	    //tag className
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
	
	    // tag attribute 
		//driver.findElement(By.cssSelector("input[placeholder = 'Search store']")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector("[placeholder = 'Search store']")).sendKeys("T-Shirt");
	
		// tag class attribute
		// driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirt");
		// driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirt"); 
	}

}
