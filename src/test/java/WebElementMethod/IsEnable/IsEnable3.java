package WebElementMethod.IsEnable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://live.skillrary.com/testing-app/");
	    WebElement ele = driver.findElement(By.xpath("//input[@class='form-control']"));
	    
	    if(ele.isEnabled())
	    {
	    	System.out.println("textfield is enabled");
	    }
	    else
	    {
	    	System.out.println("textfield is disabled");
	    }
	}

	}


