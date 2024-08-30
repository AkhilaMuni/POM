package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import Testcases.BasePage;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Scenario_1{
WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Scenario_1(WebDriver driver) {
		this.driver=driver;
	}
		
	  By username = By.id("user-name");
			//Locator for password field
		    By password = By.id("password");

			//Locator for login button
		    By loginbtn = By.id("login-button");
		
			//locator for add to cart
		    By addtocart = By.xpath("//button[@id = \"add-to-cart-sauce-labs-bolt-t-shirt\"]");
		   

		//Methods
		    public WebElement enterUsername() {
				return driver.findElement(username);
				
			}
			public WebElement enterPassword() {
				//driver.findElement(password).sendKeys("secret_sauce");
				return driver.findElement(password);
				
			}
			public WebElement ClickLogin() {
				return driver.findElement(loginbtn);
				
			}
			public WebElement addtocart() {
				return driver.findElement(addtocart);
				
	
		
			}
}
