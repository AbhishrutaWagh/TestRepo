package Autosuggestion.DefaultRelatedSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultSuggestions_2Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).click();
	    List<WebElement> elements = driver.findElements(By.xpath("//li[(@role='presentation') and not (@id='YMXe')]"));
        for(WebElement ele:elements)
        {
        	System.out.println(ele.getText());
        }
	}
	}
// o/p=  salaar prithviraj sukumaran
//		 Salaar — 2023 film
//		 byjus layoff
//		 virat kohli run out today
//		 ibm client innovation center bhubaneswar
//		 hrms jk gov in
//		 apple ipad pro 2022 release date
//		 reliance jio 5g
//		 avinash sable half marathon
//		 gpsc deputy section officer answer key
//		 karnataka kcet option entry



