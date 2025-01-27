package D29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		//select specific checkboxes
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		
		//select all the checkboxes
		List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
	    /*	for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}*/
		
		
		
		// last 3 checkboxes (7-3)=4-> Starting index
	   /*	for(int i=4;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
	   }*/
		
		
	   // first 3 checkboxes
			/*	for(int i=0;i<3;i++) {
				checkboxes.get(i).click();
			}*/
		
				
		// unselect checkboxes if they are selected
				for(int i=0;i<3;i++) {
					checkboxes.get(i).click();
				}
				
				Thread.sleep(5000);
				
				for(int i=0;i<checkboxes.size();i++) {
				    if(checkboxes.get(i).isSelected()) {
				    	checkboxes.get(i).click();
				    }
				}
		
	}

}
