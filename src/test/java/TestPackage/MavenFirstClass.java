package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class MavenFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
