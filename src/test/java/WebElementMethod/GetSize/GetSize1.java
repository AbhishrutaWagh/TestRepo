package WebElementMethod.GetSize;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	  Dimension ele = driver.findElement(By.id("username")).getSize();
	  System.out.println("width="+ele.getWidth());
	  System.out.println("Heigth="+ele.getHeight());


	}

}
