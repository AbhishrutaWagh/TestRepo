package WebElementMethod.IsSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
	  
	    if(ele.isSelected())
	    {
	    	System.out.println("true:checkbox is selected");
	    }
	    else
	    {

	    	System.out.println("false:checkbox is not selected");
	    }
	    ele.click();
	    
	    if(ele.isSelected())
	    {
	    	System.out.println("true:checkbox is selected");
	    }
	    else
	    {

	    	System.out.println("false:checkbox is not selected");
	    }

}
}
