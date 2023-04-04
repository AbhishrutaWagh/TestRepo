package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitUrlContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,30);
        
        
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);
        
        String expectedUrl = "https://demo.actitime.com/user/submit_tt.do";
        wait.until(ExpectedConditions.urlContains("https://demo"));
        
        String actualUrl = driver.getCurrentUrl();
        
        System.out.println(actualUrl);
       
        
        if(actualUrl.contains(expectedUrl))
        {
        	System.out.println("Pass:Url is same");
        }
        else
        {
        	System.out.println("Fail:Url is not same");
        }
        
	}

}
