package ActionsClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   // driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://demoqa.com/browser-windows");
    driver.findElement(By.id("windowButton")).click();
    
    Set<String> element = driver.getWindowHandles();
    
    System.out.println(element);
	}
}
//o/p=[CDwindow-7B367143C3600A5127B320BBA317A8FB, CDwindow-CE52870A8D58892F805BC92E434D2511]
