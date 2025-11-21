package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
	   //initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/ 
		
	    driver.get("https://en-gb.facebook.com/");
		
	    //Maximize the browser
	    
	    driver.manage().window().maximize();
	    
	    //Add an implicit wait to ensure the web page elements are fully loaded 
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	    
	    //Click on the Create new account button. 
	    
	    driver.findElement(By.linkText("Create new account")).click();
	    
	    //Enter the First name. 
	    
	    driver.findElement(By.name("firstname")).sendKeys("Nila");
	    
        //Enter the Surname. 
	    
	    driver.findElement(By.name("lastname")).sendKeys("S");
	    
	    //Enter the Mobile number or email address. 
	    
	    driver.findElement(By.name("reg_email__")).sendKeys("987654311");
	    
	    //Enter the New password. 
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Veni@1234");
	    
	    //Handle all three drop downs in Date of birth 
	    
	    //1.Find the element
	    
	    WebElement DayDropdown =  driver.findElement(By.id("day"));
	    WebElement MonthDropdown  =  driver.findElement(By.id("month"));
	    WebElement YearDropdown =  driver.findElement(By.id("year"));
	    
	    //create an object for select class
	    
	    Select dropDownDate = new Select (DayDropdown);
	    Select dropDownMonth = new Select (MonthDropdown);
	    Select dropDownYear = new Select (YearDropdown);
	    
	    //use the method to select by index
	    
	    dropDownDate.selectByIndex(25);
	    dropDownMonth.selectByValue("2");
	    dropDownYear.selectByVisibleText("2000");
	    
	    //Select the radio button in Gender
	    
	    driver.findElement(By.cssSelector("label._58mt:nth-of-type(1)")).click(); 
	    
	    driver.close();
	    
	    
	    

	}

}
