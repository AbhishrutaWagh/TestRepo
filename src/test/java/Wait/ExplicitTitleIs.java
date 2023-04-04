package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTitleIs {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        
        driver.get("https://demo.actitime.com/login.do");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,20);
        
        driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	  
        String expectedTitle = "actiTIME - Enter Time-Track";
        System.out.println("expectedTitle :" + expectedTitle);
        
        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track")); //check complete title..ExpectedConditions is wrong then we get TimeOutException
     
        
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle :" + actualTitle);
        
        if(actualTitle.contains(expectedTitle))
        {
        	System.out.println("Pass:Title is same");
        }
        else
        {
        	System.out.println("Fail:Title is not same");
        }
}
}
