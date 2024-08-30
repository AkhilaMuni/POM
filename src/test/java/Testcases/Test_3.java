package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Scenario_3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	@Test

	public void Scenario3() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			Scenario_3 lg = new Scenario_3(driver);
			
			Thread.sleep(5000);
			//lg.Username("standard_user");
			lg.enterUsername().sendKeys("standard_user");
			Thread.sleep(5000);
			//lg.Password("secret_sauce");
			lg.enterPassword().sendKeys("secret_sauce");
			Thread.sleep(5000);
			lg.ClickLogin().click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 250)");  
	        Thread.sleep(5000);
			lg.addtocart().click();
			Thread.sleep(5000);
			lg.addtocart_1().click();
			Thread.sleep(5000);
			lg.cartIcon().click();	
			//lg.ContinueShopping()
			System.out.println(lg.item3().isDisplayed());
		    System.out.println(lg.item1().isDisplayed());
		    Thread.sleep(5000);
		    String Remove=lg.item1().getText();
		    System.out.println("removed item is "+Remove);
			lg.remove().click();
		
	   }
	}

