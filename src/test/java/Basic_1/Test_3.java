package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualurl = driver.getCurrentUrl();
		
		System.out.println("Acual url is "+actualurl);
		
		String expectedurl = "https://www.facebook.com/";
		
		if(actualurl.equals(expectedurl))
		{
			System.out.println("Pass: url is same");
		
		}
		else
		{
			System.out.println("Fail: url is different");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
