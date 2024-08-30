package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Scenario_1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	 static WebDriver driver;
		public static void createDriver()
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    Scenario_1 lg = new Scenario_1(driver);
		}
		public static WebDriver getDriver()
		{
			if(driver==null) {
			createDriver();
			}
			return driver;
		}
}