package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scenario_4 {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Scenario_4(WebDriver driver) {
		this.driver=driver;
	}
		
	    By username = By.id("user-name");
		//Locator for password field
	    By password = By.id("password");

		//Locator for login button
	    By loginbtn = By.id("login-button");
	    
	    By Drop_down = By.className("product_sort_container");
	    
	    By Selectedoption = By.xpath("//option[@value = \"lohi\"]");

	    By addtocart = By.xpath("//button[@id = \"add-to-cart-sauce-labs-onesie\"]");
	    
	    By addtocart_1 = By.xpath("//button[@id = \"add-to-cart-sauce-labs-bike-light\"]");
	    
	    By addtocart_2 = By.xpath("//button[@id = \"add-to-cart-sauce-labs-fleece-jacket\"]");
	    
	    By cartIcon = By.className("shopping_cart_link");
	    
	    By Checkout = By.xpath("//button[@id = \"checkout\"]");
	    
	    By firstname = By.xpath("//input[@id = \"first-name\"]");
	    
	    By lastname = By.xpath("//input[@id = \"last-name\"]");
	    
	    By postalcode = By.xpath("//input[@id = \"postal-code\"]");
	    
	    By Continue = By.xpath("//input[@id = \"continue\"]");
	    
	    By Finish = By.xpath("//button[@id = \"finish\"]");
	    
	    By Orderplaced = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
	    
	    By BacktoHome = By.xpath("//button [@id = \"back-to-products\"]");
	    
	    
		public WebElement enterUsername() {
			return driver.findElement(username);//.sendKeys("standard_user");
			
		}
		public WebElement enterPassword() {
			return driver.findElement(password);//.sendKeys("secret_sauce");
			
		}
		public WebElement ClickLogin() {
			return driver.findElement(loginbtn);//.click();
		}
		public void Dropdown() {
			WebElement courseElement = driver.findElement(Drop_down);
			Select s = new Select(courseElement);
			s.selectByVisibleText("Price (low to high)");
    }
		 public WebElement selectedoption() {
				return driver.findElement(Selectedoption);
				
			}
        
        public WebElement addtocart() {
			return driver.findElement(addtocart);
			
		}
        public WebElement addtocart_1() {
			return driver.findElement(addtocart_1);
			
		}
        public WebElement addtocart_2() {
			return driver.findElement(addtocart_2);
			
		}
        public WebElement cartIcon() {
			return driver.findElement(cartIcon);
}

        public WebElement checkout() {
			return driver.findElement(Checkout);
  }
        public WebElement firstname() {
			return driver.findElement(firstname);
  }
        public WebElement lastname() {
			return driver.findElement(lastname);
  }
        public WebElement postalcode() {
			return driver.findElement(postalcode);
  }
        public WebElement Continue() {
			return driver.findElement(Continue);
  }
        public WebElement finish() {
			return driver.findElement(Finish);
		
  }

        public WebElement Orderplaced() {
			return driver.findElement(Orderplaced);
		
  }
        public WebElement BacktoHome() {
			return driver.findElement(BacktoHome);
		
  }

}