package JavaScriptExecuiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownNotWorking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(2000);
	  
	     driver.findElement(By.name("firstname")).sendKeys("ABHI");
	     driver.findElement(By.name("lastname")).sendKeys("WAGH");
	     driver.findElement(By.name("reg_email__")).sendKeys("1234569825");
	     driver.findElement(By.name("reg_passwd__")).sendKeys("ABHIWAGH");
	     
	   
	    
	     driver.findElement(By.name("sex")).click();
	     
	     driver.findElement(By.id("day")).click(); //it cannot work
	     
	     

	    

	}

}
