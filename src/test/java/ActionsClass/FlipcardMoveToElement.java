package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcardMoveToElement {

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
        WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
        
        Actions actions = new Actions(driver);  //we have to pass WebDriver's reference variable inside Actions() constructor
        
        actions.moveToElement(element);  //pass targeted element
        actions.perform(); //we have to always write perform()method while using Actions class

	}

}
