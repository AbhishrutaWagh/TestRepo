package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_10 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhilasha Anil Wagh\\\\eclipse-workspace\\\\Qspider_Automation\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualPageSource = driver.getPageSource();
		
		/*String expectedPageSource = "Please" or "P"
		  also it get o/p as Pass:text is present in html */
		 
		String expectedPageSource = "Please identify yourself";
		
		
		if(actualPageSource.contains(expectedPageSource)) {
			
			System.out.println("Pass:text is present in html");
		}
		else {
			System.out.println("Fail:text is not present in html");
		}
		
		
		
		
	}



	}


