package D33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//close window if it is available
	/*	if(driver.findElement(By.xpath("//button[class='btn-close']")).isDisplayed()) {
			
			driver.findElement(By.xpath("//button[class='btn-close']")).click();
		}
	*/
		
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//ul[@id='menu']/li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']")).click();
	
		
	
	//Showing 1 to 10 of 12697 (1270 Pages)
	String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	
	int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
	
	//repeating pages
	
	for(int p=1;p<=6;p++) {
		if(p>1) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
		    active_page.click();
		}
	}
	
	
	
	// reading data from the page
	Thread.sleep(10000);
	int numRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	
		for(int r=1;r<=numRows;r++) {
		String customerName =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
		String email =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
		
		System.out.println(customerName+"\t"+email+"\t");
		}
	}

}
