package D29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
	/*	//Normal alert with Ok button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		*/
		
		
	/*	//Confirmation alert with Ok & Cancel button
				driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
				Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
*/
		
		//Prompt alert with input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("welcome");
		myAlert.accept();
	}

}
