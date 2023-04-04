package TakesScreenshotWebpage.Webelement;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
	    String timestamp = ldt.toString().replace(":", "-");
	    
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
        WebElement ts = driver.findElement(By.id("email"));

        // TakesScreenshot ts = (TakesScreenshot)driver;
          File tempFile = ts.getScreenshotAs(OutputType.FILE);
        // System.out.println(tempFile.getAbsolutePath());
          
         File destfile = new File("./errorshots/facebookUser"+timestamp+".png");
        // tempFile.renameTo(destfile);
         FileUtils.copyFile(tempFile, destfile); //automatic folder create



	}

}
