package WebElementMethod.GetTagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
  // String element = driver.findElement(By.cssSelector("*[alt='Google']")).getTagName();//cssSelector=*
   String element = driver.findElement(By.xpath("//*[@alt='Google']")).getTagName(); //XpathByAttribute=//*
   
        System.out.println("Tagname is :"+element);
        

	}
	

}
