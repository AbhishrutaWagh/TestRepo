package WebElementMethod.IsDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement ele = driver.findElement(By.id("username"));
	    
	    if(ele.isDisplayed())
	    {
	    	System.out.println("true:element is visible");
	    }
	    else
	    {

	    	System.out.println("false:element is not visible");
	    }

	}

}
