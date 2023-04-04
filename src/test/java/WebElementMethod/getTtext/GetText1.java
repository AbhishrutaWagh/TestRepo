package WebElementMethod.getTtext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhilasha Anil Wagh\\\\eclipse-workspace\\\\Qspider_Automation\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	    String actualText = driver.findElement(By.id("headerContainer")).getText();
	    System.out.println(actualText);
	    
	    String expectedText = "Please identify yourself";
	    
	    if(actualText.contains(expectedText))
	    {
	    	System.out.println("actualText is same as expectedText");
	    }
	    else
	    {
	    	System.out.println("actualText is not same as expectedText");
	    }
	    		
	    		
	    
	   
		
		
		

	}

}
