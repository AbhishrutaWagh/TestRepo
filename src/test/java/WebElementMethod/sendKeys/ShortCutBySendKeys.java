package WebElementMethod.sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortCutBySendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
         WebElement userText = driver.findElement(By.id("username"));
         
        userText.sendKeys("admin");
        Thread.sleep(2000);
        
        userText.sendKeys(Keys.CONTROL+"a");   //admin get select
       System.out.println("admin get select");
        Thread.sleep(2000);
        
        userText.sendKeys(Keys.CONTROL+"c");    //admin get copy
        System.out.println("admin get copy");
        Thread.sleep(2000);
        
        WebElement passwordtext = driver.findElement(By.name("pwd"));  
        passwordtext.sendKeys(Keys.CONTROL+"v");   //admin get paste in password textfield
        System.out.println(" admin get paste in password textfield ");
	}

}
