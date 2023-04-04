package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolling {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        
        driver.get("https://www.naukri.com/");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
      //  jse.executeScript("window.alert('Enter Your Name')");
         jse.executeScript("window.scrollBy(0,500)"); //vertically down
         
         Thread.sleep(2000);
        // jse.executeScript("window.scrollBy(500,0)"); //horizontal right
         jse.executeScript("window.scrollBy(0,-500)");  //vertically up
         
        
	}

}
