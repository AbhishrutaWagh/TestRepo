package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        
        //click on login button by xpath by text
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
       /* click on login button by id
        driver.findElement(By.id("loginButton")).click(); */  
        
        //text having partial dynamic value(2020)so text function not support
       // driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']"));
   
	}

}
