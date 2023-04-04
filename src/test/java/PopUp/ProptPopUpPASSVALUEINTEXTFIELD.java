package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProptPopUpPASSVALUEINTEXTFIELD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://letcode.in/alert");
	    driver.findElement(By.id("prompt")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().sendKeys("Abhishruta Anil Wagh");
	    System.out.println("successfully pass value in text field");
	    driver.switchTo().alert().accept();
	    System.out.println("click on OK button");
	}

}
