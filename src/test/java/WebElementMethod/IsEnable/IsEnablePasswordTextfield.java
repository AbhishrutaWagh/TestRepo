package WebElementMethod.IsEnable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnablePasswordTextfield {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement ele = driver.findElement(By.name("pwd"));
	    
	    if(ele.isEnabled())
	    {
	    	System.out.println("password textfield is enable");
	    }
	    else
	    {
	    	System.out.println("password textfield is disable");
	    }
	}
	

}
