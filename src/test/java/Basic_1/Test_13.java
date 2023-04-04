package Basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
 //clicking on cross button
       driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
       System.out.println("Click on pop up");
 //grocery
       driver.findElement(By.linkText("Grocery")).click();
       System.out.println("grocery");
       //Thread.sleep(3000);
       driver.navigate().back();
 //mobile
       driver.findElement(By.linkText("Mobiles")).click();
       System.out.println("mobile");
       //Thread.sleep(3000);
       driver.navigate().back();
 //Appliances
        driver.findElement(By.linkText("Appliances")).click();
        System.out.println("Appliances");
       // Thread.sleep(3000);
        driver.navigate().back();
 //Travel 
        driver.findElement(By.linkText("Travel")).click();
        System.out.println("Travel");
       // Thread.sleep(3000);
        driver.close();
       
       
       

	}



}
