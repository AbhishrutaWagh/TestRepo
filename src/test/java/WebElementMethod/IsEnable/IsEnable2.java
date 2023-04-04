package WebElementMethod.IsEnable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement ele = driver.findElement(By.id("username"));
	    
	    if(ele.isEnabled())
	    {
	    	System.out.println("username textfield is enable");
	    }
	    else
	    {
	    	System.out.println("username textfield is disable");
	    }

	}

}
