package WebElementMethod.sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        //driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys(args);
        //driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(args);
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).sendKeys(Keys.ENTER);

	}

}
