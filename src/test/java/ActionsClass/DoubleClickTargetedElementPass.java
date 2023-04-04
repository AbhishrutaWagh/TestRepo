package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTargetedElementPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
	    
	   
       WebElement element = driver.findElement(By.id("add"));
       
        Actions actions = new Actions(driver);  //we have to pass WebDriver's reference variable inside Actions() constructor
        
       actions.doubleClick(element).perform();//also use perform directly
       // actions.perform();                 //instead of this

	}

}
