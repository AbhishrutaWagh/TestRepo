package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
     //   driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
     //   driver.findElement(By.xpath("//div[text()='Grocery']")).click();
     //   driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
    //    driver.findElement(By.xpath("//div[text()='Appliances']")).click();
    //    driver.findElement(By.xpath("//div[text()='Travel']")).click();
        driver.findElement(By.xpath("//div[text()='Electric 2-Wheelers']")).click();

	}

}
