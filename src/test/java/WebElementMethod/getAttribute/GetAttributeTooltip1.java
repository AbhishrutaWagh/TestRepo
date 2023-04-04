package WebElementMethod.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeTooltip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        String expectedToolTip = "Do not select if this computer is shared";
       String actualToolTip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
       System.out.println(actualToolTip);
    if(actualToolTip!=null)
     {
       if(actualToolTip.contains(expectedToolTip))
       {
    	   System.out.println("pass:Tooltip is same");
       }
       else
       {
    	   System.out.println("pass:Tooltip is not same"); 
       }

	}
    else
    {
    	System.out.println("fail:actualToolTip attribute is not in source code");
    }
       

}
}
