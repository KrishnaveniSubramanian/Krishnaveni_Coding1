package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		
		
		//Step1 - Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
	    
		//Step2 - Load the url
		
		driver.get("https://www.facebook.com/");
		//Step-3 - Maximize the browser
		driver.manage().window().maximize();
	
		//Step-4 - Enter Username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Step-5 - Enter Password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Step-6 - Click login
		driver.findElement(By.name("login")).click();
		

	}

}
