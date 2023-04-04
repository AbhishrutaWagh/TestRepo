package WebElementMethod.GetTagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
       // String element = driver.findElement(By.id("username")).getTagName();
        String element = driver.findElement(By.id("loginButton")).getTagName();
        
        System.out.println("Tagname is :"+element);
	}

}
