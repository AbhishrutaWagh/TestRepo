package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectByValue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup");
		WebElement element = driver.findElement(By.id("month"));

		Select s = new Select(element);
		//  s.selectByVisibleText("Aug");
		List<WebElement> alloptions = s.getOptions();

		for(WebElement ele :alloptions )
		{
			s.selectByValue(ele.getAttribute("value"));

		}

		driver.quit();


	}

}
