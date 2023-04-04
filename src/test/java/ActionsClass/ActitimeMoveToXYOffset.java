package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeMoveToXYOffset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.actitime.com/");
	    Thread.sleep(2000);
       
       
        WebElement element = driver.findElement(By.linkText("Pricing"));
        
        Actions actions = new Actions(driver);  //we have to pass WebDriver's reference variable inside Actions() constructor
        
        actions.moveToElement(element,100,0); //pass targeted element(Pricing),Xoffset,Yoffset
                                              //o/p=Help Center(Right of Pricing)
       
       // actions.moveToElement(element,-100,0); //o/p=Clients(Left of Pricing)
        actions.perform();
        

	}

}
