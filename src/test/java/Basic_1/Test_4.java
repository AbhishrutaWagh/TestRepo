package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
