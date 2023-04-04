package ByAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     
        driver.manage().window().maximize();
        driver.get("https://demo.vtiger.com/vtigercrm/");
        
        WebElement element = driver.findElement(By.id("username"));
        element.clear();
        
        Thread.sleep(2000);
        
        element.sendKeys("abhishruta");
        
        WebElement psw = driver.findElement(By.id("password"));
        psw.clear();
        
        Thread.sleep(2000);
        
        psw.sendKeys("9359706223");
         driver.quit();
       
		
	}

}
