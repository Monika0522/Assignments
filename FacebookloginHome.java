package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookloginHome {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/"); //Load URL
		
		driver.manage().window().maximize(); //Maximaze the webpage
		
		
		driver.findElement(By.partialLinkText("Create new account")).click(); //Click on create new account
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Monika"); // Locate and  enter the username
		
		driver.findElement(By.name("lastname")).sendKeys("Sundhar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9445646785");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Mon@123");

//	Select DOB = new Select(WebElement);
			
		WebElement Dob = driver.findElement(By.id("day"));
		Select DD = new Select(Dob);
		DD.selectByIndex(12);
		 Thread.sleep(3000);
		
		 WebElement Month = driver.findElement(By.id("month"));
		 Select mm = new Select(Month);
		 mm.selectByVisibleText("Mar");
		 Thread.sleep(30000);
		 
		 WebElement Yr = driver.findElement(By.id("year"));
		 Select kk = new Select (Yr);
		 kk.selectByValue("1998");
		 Thread.sleep(3000);	
		         
		
		
	}

}
