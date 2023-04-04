package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_8 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhilasha Anil Wagh\\\\eclipse-workspace\\\\Qspider_Automation\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		
		//driver.get("https://www.facebook.com/");
	//driver.quit();
		
		driver.close();
	}

}
