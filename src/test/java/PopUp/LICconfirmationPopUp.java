package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICconfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://licindia.in/");
	    driver.findElement(By.xpath("//a[text()='Pay Premium through ']")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();//click on OK button
	    System.out.println("click on OK button");//it give new webpage(window) after clicking on OK

	    
	 //   driver.switchTo().alert().dismiss();//click on cancel button
                                          
	}

}
