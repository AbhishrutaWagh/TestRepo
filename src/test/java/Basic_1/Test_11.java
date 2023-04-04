package Basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_11 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhilasha Anil Wagh\\\\eclipse-workspace\\\\Qspider_Automation\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.linkText("Forgotten password?")).click();
	
	driver.findElement(By.partialLinkText("Forgotten")).clear();
	
	
	
	


   
	
	
	
	
	
	
	}

}
