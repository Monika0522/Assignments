package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); //import
		
		driver.get("https://www.testleaf.com/"); //load URL
		
		driver.manage().window().maximize(); //maximize
		
		Thread.sleep(60000000);
		
		driver.close();
	

	}

}
