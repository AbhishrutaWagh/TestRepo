package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnInsideDropdownElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
       
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
     
        
        driver.findElement(By.cssSelector("img[alt='Mobiles & Tablets']")).click();
        driver.findElement(By.xpath("//span[text()='Electronics']")).click();
     //driver.findElement(By.cssSelector("a[title='Apple']")).click();
        
       driver.findElement(By.linkText("Apple")).click();
	}
          // we hve to use Actions class to keep cursor on 
}         // Electronics targeted element

