package D31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestDropDownGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// use selectorHub debugger for inspect dynamic search list 
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium"); // search box
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));// dynamic list
		
		System.out.println(list.size());
		  
		  
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//			
//			if(list.get(i).getText().equals("selenium")) {
//				
//				list.get(i).click();
//				break;
//			}
//		}
		
		
	}

}
