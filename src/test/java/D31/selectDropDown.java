package D31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
			
		  driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		  driver.manage().window().maximize();
		  
		  
		  
		  
		  // Handle drop-down when Select tag...
		  
		  WebElement drpCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
		  Select drpCountry = new Select(drpCountryElement);
		  
		  //drpCountry.selectByVisibleText("France");
		  //drpCountry.selectByValue("japan");
		  //drpCountry.selectByIndex(2);
		  
		  
		  // capture the options from the dropdown
		  
		  List<WebElement> options = drpCountry.getOptions() ;
	      System.out.println("Number of total opotions: "+options.size());
	      
	      
	      // printing the options
	      
	     /* for(int i=0;i<options.size();i++) {
	    	  System.out.println(options.get(i).getText());
	      }
	      */
	      for(WebElement op:options) {
	    	  System.out.println(op.getText());
	      }
	      
		
		
	}

}
