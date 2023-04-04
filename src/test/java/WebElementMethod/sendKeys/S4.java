package WebElementMethod.sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop-global.malaicha.com/login");
        //driver.findElement(By.name("username")).sendKeys(args);
       // driver.findElement(By.name("pin")).sendKeys(args);
        driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
	}

}
