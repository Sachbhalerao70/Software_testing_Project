
package validatingUserNameAndPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	
 
public class Validating_username_and_password{
	@Test
	public static void validate_user_pass()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		String actual_title=driver.getTitle();
		String Expected_title="ZERO - Account Summary";
		
		if (actual_title.equals(Expected_title))
		{
			System.out.println("test case pass");
			
		}
		else
		{
			System.out.println("test case Failed");
		}

		
		
	}
}