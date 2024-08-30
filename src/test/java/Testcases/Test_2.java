package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Scenario_2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {
	@SuppressWarnings("deprecation")
	@Test

	public void Scenario2() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			Scenario_2 lg = new Scenario_2(driver);
			
			Thread.sleep(5000);
			//lg.Username("standard_user");
			lg.enterUsername().sendKeys("standard_user");
			Thread.sleep(5000);
			lg.enterPassword().sendKeys("secret_sauce");
			Thread.sleep(5000);
			lg.ClickLogin().click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 250)");  
	        Thread.sleep(5000);
			lg.addtocart().click();
			Thread.sleep(5000);
			lg.cartIcon().click();
			Thread.sleep(5000);
			System.out.println(lg.gettitle().isDisplayed());
			System.out.println(lg.getprice().isDisplayed());
			Thread.sleep(5000);
			lg.ContinueShopping().click();
			Thread.sleep(5000);
			String my_homepage= driver.getTitle();
			System.out.println("homepage title is "+my_homepage);
			String expected_homepage="Swag Labs";
	        Assert.assertTrue(my_homepage.contains("Swag Labs"));	
	   }
	}

