package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	    
	   driver.findElement(By.linkText("jdk-11.0.16_linux-aarch64_bin.deb")).click();
	   System.out.println("click on link");
	   Thread.sleep(2000);
	  
	    WebElement ele = driver.findElement(By.linkText("Download jdk-11.0.16_linux-aarch64_bin.deb"));
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    
	    jse.executeScript("arguments[0].click()",ele);
	}

}
