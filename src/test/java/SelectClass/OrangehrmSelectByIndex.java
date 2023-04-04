package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmSelectByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
        WebElement element = driver.findElement(By.id("Form_getForm_Country"));
        Select s = new Select(element);
        
       List<WebElement> alloptions = s.getOptions();
       
       for(int i= 0; i<= alloptions.size()-1; i++)
       {
    	   s.selectByIndex(i);
       }
       
//       for(WebElement ele :alloptions )
//       {
//    	   s.selectByVisibleText( ele.getText());
//    	   
//    	   System.out.println(ele.isSelected());
//    	   
//       }
//        

	}

}
