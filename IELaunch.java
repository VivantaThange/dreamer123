package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\GroupCNov20\\src\\selenium\\IEDriverServer.exe");  
		WebDriver driver=new InternetExplorerDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}

}
