package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.flipkart.com/");
           driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        //   driver.findElement(By.xpath("//img[@alt='Top Offers']")).click();
      //   driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
     //      driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
       //  driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
       //    driver.findElement(By.xpath("//img[@alt='Travel']")).click();
        driver.findElement(By.xpath("//img[@alt='Electric 2-Wheelers']")).click();
                 
                
                
                
                
	}

}
