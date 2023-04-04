package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        
        driver.get("https://www.naukri.com/");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
              //vertical up and down
     /*   jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        Thread.sleep(2000);
        
        jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");*/
         //Horizontal right and left
       jse.executeScript("window.scrollBy(document.body.scrollWidth,0)");
        
        Thread.sleep(2000);
        
        jse.executeScript("window.scrollBy(-document.body.scrollWidth,0)");
        
        
        }

}
