package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario_3 {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Scenario_3(WebDriver driver) {
		this.driver=driver;
	}
		
	    By username = By.id("user-name");
		//Locator for password field
	    By password = By.id("password");

		//Locator for login button
	    By loginbtn = By.id("login-button");
	
		//locator for add to cart
	    By addtocart = By.xpath("//button[@id = \"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	    
	    By addtocart_1 = By.xpath("//button[@id = \"add-to-cart-sauce-labs-backpack\"]");
	    //locator for cartIcon
		By cartIcon = By.className("shopping_cart_link");
		
		By item3 = By.xpath("//*[@id=\"item_1_title_link\"]/div");
		
		By item1 = By.xpath("//*[@id=\"item_4_title_link\"]/div");
		
		//locator for remove
		 By remove = By.xpath("//button[@id = \"remove-sauce-labs-backpack\"]");
		 
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
			public WebElement addtocart_1() {
				return driver.findElement(addtocart_1);
				
			}
			public WebElement cartIcon() {
				return driver.findElement(cartIcon);
				
		}
			public WebElement remove() {
				return driver.findElement(remove);
				//System.out.println("Successfully navigated to the Homepage");
			}
			public WebElement item3() {
				return driver.findElement(item3);
				
		}
			public WebElement item1() {
				return driver.findElement(item1);
				
		}
}
