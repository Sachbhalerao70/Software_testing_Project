package selenium_webdriver_first;

import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.WebDriver;
/*
 Test Case 
 -----------
 1.lunch Browser
 2.open URL https://demo.opencart.com/
 3.validate title should be "Your Store"
 4. close browser
 */

public class First_test_case_project {

	public static void main(String[] args) {
		// 1.lunch Browser 
		// create chorme driver class for connecting our project 
		//ChromeDriver driver=new ChromeDriver();
		// this chorme driver automatically lunch url  this obj have defualt constructore
		WebDriver driver=new ChromeDriver();
		// 2.open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		// get method used for lunch this url on that browser
		// 3.validate title should be "Your Store"
		// first we matching actual title with our test case title 
		
		String Actual_title=driver.getTitle();
		if(Actual_title.equals("Your Store"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case failed");
		}
		//4. close browser 
		//driver.close();
		driver.quit();
		
	} 

}
