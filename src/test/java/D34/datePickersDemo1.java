package D34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickersDemo1 {

	
	static void selectFutureDates(WebDriver driver, String month, String year, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		    if(currentMonth.equals(month) && currentYear.equals(year)) {
		    	break;
		    }
		    
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
		  //  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous
		}
		
		 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			
			for(WebElement dt:allDates) {
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
	}
	static void selectPastDates(WebDriver driver, String month, String year, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		    if(currentMonth.equals(month) && currentYear.equals(year)) {
		    	break;
		    }
		    
		   // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous
		}
		
		 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			
			for(WebElement dt:allDates) {
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method-1: using sendKeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/05/2024");
		
		
		// method-2: using date picker
		String year = "2025";
		String month = "May";
		String date = "20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
		
		selectFutureDates( driver,  month,  year, date);
		//selectPastDates( driver,  month,  year, date);
		
		
	
	}

}
