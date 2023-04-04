package TakesScreenshotWebpage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigercrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
       // driver.findElement(By.id("username")).sendKeys("admin");
        //driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        
        File tempFile = ts.getScreenshotAs(OutputType.FILE);
       // System.out.println(tempFile.getAbsolutePath());
        File destfile = new File("./ScreenshotWebpage/vtigercrm.png");
        tempFile.renameTo(destfile);


	}

}
