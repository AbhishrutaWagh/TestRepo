package WebElementMethod.GetLocation;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation1 {

	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		   // driver.manage().window().maximize();
		    driver.get("https://demo.actitime.com/login.do");
		  Point ele = driver.findElement(By.id("username")).getLocation();
		  System.out.println("StartX="+ele.getX());
		  System.out.println("StartY="+ele.getY());

	}

}
