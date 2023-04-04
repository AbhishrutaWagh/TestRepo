package WebElementMethod.IsEnable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable4 {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	   driver.findElement(By.linkText("jdk-11.0.16_linux-aarch64_bin.deb")).click();
	   Thread.sleep(2000);
	  WebElement ele = driver.findElement(By.linkText("Download jdk-11.0.16_linux-aarch64_bin.deb"));
	    
	    if(ele.isEnabled())
	    {
	    	System.out.println("fail:element is not enabled");
	    }
	    else
	    {
	    	System.out.println("pass:element is enabled");
	    }

	}

}





