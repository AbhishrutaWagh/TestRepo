package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;


public class Test_1 {


	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://www.facebook.com/");
		
		 //To print url in o/p use getTitle()method
		 
	  /*    String element = driver.getTitle();
	        System.out.println(element);   */
		
	}
	
	
	

}
