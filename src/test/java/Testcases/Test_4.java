package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.Scenario_4;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	@Test

	public void Scenario4() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			Scenario_4 lg = new Scenario_4(driver);
			Thread.sleep(5000);
			//lg.Username("standard_user");
			lg.enterUsername().sendKeys("standard_user");
			Thread.sleep(5000);
			//lg.Password("secret_sauce");
			lg.enterPassword().sendKeys("secret_sauce");
			Thread.sleep(5000);
			lg.ClickLogin().click();
			Thread.sleep(5000);
			lg.Dropdown();
			Thread.sleep(5000);
			boolean S=lg.selectedoption().isEnabled();
		    System.out.println("Products are displayed in low to high is " +S);
			lg.addtocart().click();
			Thread.sleep(5000);
			lg.addtocart_1().click();
			Thread.sleep(5000);
			lg.addtocart_2().click();
			Thread.sleep(5000);
			lg.cartIcon().click();
			Thread.sleep(5000);
			lg.checkout().click();
			Thread.sleep(5000);
			lg.firstname().sendKeys("Akhila");
			Thread.sleep(5000);
			lg.lastname().sendKeys("Muniganti");
			Thread.sleep(5000);
			lg.postalcode().sendKeys("506376");
			Thread.sleep(5000);
			lg.Continue().click();
			Thread.sleep(5000);
			lg.finish().click();
			Thread.sleep(5000);
			System.out.println(lg.Orderplaced().isDisplayed());
			//System.out.println("orders are displayed" +S);
			lg.BacktoHome().click();
			
   }
}
