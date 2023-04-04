package JavaScriptExecuiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataInDisabledTextfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://live.skillrary.com/testing-app/");
	    
	   
	  
	    WebElement ele = driver.findElement(By.cssSelector("input[class='form-control']"));
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    
	    jse.executeScript("arguments[0].value='PUNE'",ele);

	}

}
