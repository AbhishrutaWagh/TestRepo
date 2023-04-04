package Basic_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhilasha Anil Wagh\\\\eclipse-workspace\\\\Qspider_Automation\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualtitle = driver.getTitle();
		
		System.out.println("Actual title is "+actualtitle);
		
		 String expectedtitle = "Facebook – log in or sign up";
		 
		 if(actualtitle.equals(expectedtitle))
		 {
			 System.out.println("Pass: Title is same as  actual title");
		 }
		 else
		 {
			 System.out.println("Fail: Title is same as  actual title");
		 }
		
	}

}
