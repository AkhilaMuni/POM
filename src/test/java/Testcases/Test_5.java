package Testcases;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.Scenario_4;
import Pages.Scenario_5;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {


	@Test

	public void Scenario5() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			Scenario_5 lg = new Scenario_5(driver);
			Thread.sleep(5000);
			//lg.Username("standard_user");
			lg.enterUsername().sendKeys("standard_user");
			Thread.sleep(5000);
			//lg.Password("secret_sauce");
			lg.enterPassword().sendKeys("secret_sauce");
			Thread.sleep(5000);
			lg.ClickLogin().click();
			Thread.sleep(5000);
	        lg.dropdown();
	        Thread.sleep(5000);
			lg.addtocart().click();
			lg.addtocart_1().click();
			Thread.sleep(5000);
			lg.addtocart_2().click();
			Thread.sleep(5000);
			lg.cartIcon().click();
            Thread.sleep(5000);
            lg.productNum();
            Thread.sleep(5000);
            lg.burgermenu().click();
            Thread.sleep(5000);
            lg.resetappstate().click();
            Thread.sleep(5000);
            lg.exit().click();
            Thread.sleep(5000);
            lg.cartIcon_1().click();
            Thread.sleep(5000);
            lg.cartIcon1();
            Thread.sleep(5000);
            lg.burgermenu().click();
            Thread.sleep(5000);
            lg.Logout().click();
			
   }
}


