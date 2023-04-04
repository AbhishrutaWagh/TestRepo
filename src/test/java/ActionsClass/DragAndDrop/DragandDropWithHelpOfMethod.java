package ActionsClass.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropWithHelpOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	    
	   
       WebElement element = driver.findElement(By.xpath("//h1[text()='Block 1']"));
       WebElement designation = driver.findElement(By.id("block-3"));
        Actions actions = new Actions(driver);  //we have to pass WebDriver's reference variable inside Actions() constructor
        
       actions.dragAndDrop(element, designation);
        actions.perform();

	}

}
