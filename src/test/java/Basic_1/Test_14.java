package Basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		//Enter the username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// Click on login button
		driver.findElement(By.id("loginButton")).click();
		//view time tracker
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		System.out.println("view time tracker");
		//Thread.sleep(3000);
		//lock time tracker
		driver.findElement(By.cssSelector("div[id='container_reports']")).click();
		System.out.println("lock time tracker"); 
		//Thread.sleep(3000);
		//approve time trackercontent users
		driver.findElement(By.cssSelector("div[id='container_users']")).click();
		System.out.println("approve time tracker");
		driver.close();






	}

}
