package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        
        driver.get("https://www.google.com/doodles");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for(;;)
        {
        	try {
        		driver.findElement(By.linkText("Mother's Day 2022 (August 15)")).click();
        		break;
        	}
        	catch(Exception e)
        	{
        		jse.executeScript("window.scrollBy(0,500)");
        	}
        }
        	

	}

}
