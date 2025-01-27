package D34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePickerDemo2 {

	
	//user defined method for converting month from string to month
	static Month convertMonth(String month) {
		HashMap<String,Month> monthMap = new HashMap<String,Month>();
	
		 monthMap.put("January", Month.JANUARY);
	        monthMap.put("February", Month.FEBRUARY);
	        monthMap.put("March", Month.MARCH);
	        monthMap.put("April", Month.APRIL);
	        monthMap.put("May", Month.MAY);
	        monthMap.put("June", Month.JUNE);
	        monthMap.put("July", Month.JULY);
	        monthMap.put("August", Month.AUGUST);
	        monthMap.put("September", Month.SEPTEMBER);
	        monthMap.put("October", Month.OCTOBER);
	        monthMap.put("November", Month.NOVEMBER);
	        monthMap.put("December", Month.DECEMBER);

	
	Month vmonth = monthMap.get(month);
	if(vmonth == null ) {
		System.out.println("Invalid");
	}
	return vmonth;
	
	}
	
	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) {
		//select year
				WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectYear = new Select(yearDropDown);
				selectYear.selectByVisibleText(requiredYear);
				
				//select month
				while(true) {
					String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					
					//convert requireMonth & displayMonth in to Month Objects
					Month expectedMonth = convertMonth(requiredMonth);
					Month currentMonth = convertMonth(displayMonth);
				
				   //compare
					int result = expectedMonth.compareTo(currentMonth);
					// 0 months are equal
					//>0 future
					//<0 past
					
					if(result<0) { //past
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
						
					}
					else if(result>0) { //future
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						
					}
					else {
						break;
					}
				
				}
				// dates
				
				List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement dt:allDates) {
					if(dt.getText().equals(requiredDate)) {
						dt.click();
						break;
					}
				}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String requiredYear = "2022";
		String requiredMonth = "January";
		String requiredDate = "20";
		
		
		//switch to frame
		//driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		selectDate(driver,requiredYear,requiredMonth,requiredDate);
	}

}
