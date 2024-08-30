package Testcases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Pages.Scenario_1;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test_1 {

	@Test

public void Scenario1() throws InterruptedException, IOException, TesseractException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		Scenario_1 lg = new Scenario_1(driver);
		Thread.sleep(5000);
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
//		System.out.println("image OCR done");
//		
//		System.out.println("str");
	
		
   }
}
