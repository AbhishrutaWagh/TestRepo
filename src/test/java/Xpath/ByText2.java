package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://irctc.com/contact.html");
          
          //dropdown(+)
          driver.findElement(By.xpath("//a[@role='button']")).click();
          
          /* in DOM =//td[text()="Maharajas' Express"](double quotes) and in program=//td[text()='Maharajas' Express'](single quote)
          driver.findElement(By.xpath("//td[text()='Maharajas' Express']"));*/
          
		
		
		
		
		
		
		
		
	}

}
