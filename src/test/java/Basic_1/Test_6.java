package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_6 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://licindia.in/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://licindia.in/Products/Insurance-Plan");
		
		/* or whit help of Navigation
		
		Navigation nav = driver.navigate();
		
		nav.to("https://licindia.in/Products/Insurance-Plan"); */

	}

}
