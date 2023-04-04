package Autosuggestion.DefaultRelatedSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLInktextInActitimeWebpage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	 List<WebElement> elements = driver.findElements(By.tagName("a"));
	    
        for(WebElement ele:elements)
        {
        	System.out.println(ele.getText());
        }
	}

}
// 0/p=Login
//		 Forgot your password?
//
//
//
//
//				 actiTIME Inc.

