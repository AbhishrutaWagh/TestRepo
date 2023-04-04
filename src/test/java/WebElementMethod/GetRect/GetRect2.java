package WebElementMethod.GetRect;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	   Rectangle ele = driver.findElement(By.name("pwd")).getRect();
	  System.out.println("StartX="+ele.getX());
	  System.out.println("StartY="+ele.getY());
	  System.out.println("width="+ele.getWidth());
	  System.out.println("Heigth="+ele.getHeight());


	}

}
