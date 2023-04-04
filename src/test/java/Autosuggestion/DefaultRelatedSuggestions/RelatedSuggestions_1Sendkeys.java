package Autosuggestion.DefaultRelatedSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelatedSuggestions_1Sendkeys {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		   // driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.google.com/");
		    driver.findElement(By.name("q")).sendKeys("Selenium");
		    List<WebElement> elements = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
	        for(WebElement ele:elements)
	        {
	        	System.out.println(ele.getText());
	        }
		}
}
	//o/p=selenium
//		selenium interview questions
//		selenium download
//		selenium dev
//		selenium ide
//		selenium webdriver
//		selenium webdriver download
//		selenium interview questions and answers
//		selenium testing
//		selenium rich foods

	

	


