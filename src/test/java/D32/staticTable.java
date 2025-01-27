package D32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		driver.manage().window().maximize();
		
		//total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple table
		// int rows = driver.findElements(By.tagName("tr")).size();// single table in a webpage
		System.out.println("Number of rows: "+rows);
		
		
		//total number of columns in a table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();//multiple table
		// int cols = driver.findElements(By.tagName("th")).size();// single table in a webpage
		System.out.println("Number of cols: "+cols);
		
		
		//Read data from specific row and column (Ex- 5th row and 1st col)
		
		//String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		//System.out.println(bookname);
		
		
		// read data from all the rows and columns 
		
	/*	for(int r=2;r<=rows;r++) {
			
			for(int c=1;c<=cols;c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		
		
		// print book names whose author is mukesh
   /* for(int r=2;r<=rows;r++) {
			
	String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	if(authorName.equals("Mukesh"))
	{
	String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	System.out.println(bookName+"\t"+authorName);
	}
			
		}
		*/
    
    // total prices of all books
		
		int total =0;
        for(int r=2;r<=rows;r++) {
		
    	String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
    	total = total + Integer.parseInt(price);	
    		}
        System.out.println("total price: "+total);
		
		
	}

}
