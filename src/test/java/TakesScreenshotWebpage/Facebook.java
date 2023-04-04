package TakesScreenshotWebpage;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
       // driver.findElement(By.xpath("//button[text()='Log in']")).click();

         TakesScreenshot ts = (TakesScreenshot)driver;
         
         File tempFile = ts.getScreenshotAs(OutputType.FILE);
        // System.out.println(tempFile.getAbsolutePath());
         File destfile = new File("./ScreenshotWebpage/facebook.png");
         tempFile.renameTo(destfile);

	}

}
