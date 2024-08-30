package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario_2 {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Scenario_2(WebDriver driver) {
		this.driver=driver;
	}
	    //Locator for username field
	    By username = By.id("user-name");
		//Locator for password field
	    By password = By.id("password");

		//Locator for login button
	    By loginbtn = By.id("login-button");
	
		//locator for add to cart
	    By addtocart = By.xpath("//button[@id = \"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	    //locator for cartIcon
		By cartIcon = By.className("shopping_cart_link");
		
		By gettitle = By.xpath("//*[@id=\"item_1_title_link\"]/div");
		
		By getprice = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div");
		//locator for Continue Shopping
		By ContinueShopping = By.xpath("//button[@id = \"continue-shopping\"]");
		
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
		public WebElement cartIcon() {
			return driver.findElement(cartIcon);
			
	}

		public WebElement gettitle() {
			return driver.findElement(gettitle);
			
	}
		public WebElement getprice() {
			return driver.findElement(getprice);
			
	}
		public WebElement ContinueShopping() {
			return driver.findElement(ContinueShopping);
			//System.out.println("Successfully navigated to the Homepage");
		}
	
	}
