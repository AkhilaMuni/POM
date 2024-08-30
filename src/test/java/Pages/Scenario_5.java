package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scenario_5 {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Scenario_5(WebDriver driver) {
		this.driver=driver;
	}
		
	    By username = By.id("user-name");
		//Locator for password field
	    By password = By.id("password");

		//Locator for login button
	    By loginbtn = By.id("login-button");
	    
	    By Dropdown = By.xpath("//select[@class = \"product_sort_container\"]");
	    
	    By addtocart = By.xpath("//button[@id = \"add-to-cart-sauce-labs-onesie\"]");
	    
	    By addtocart_1 = By.xpath("//button[@id = \"add-to-cart-sauce-labs-bike-light\"]");
	    
	    By addtocart_2 = By.xpath("//button[@id = \"add-to-cart-sauce-labs-fleece-jacket\"]");
	  
	    By cartIcon = By.className("shopping_cart_link");
	    
	    By BurgerMenu = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	    
	    By ResetAppState = By.xpath("//*[@id=\"reset_sidebar_link\"]");
	    
	    By Exit = By.xpath("//*[@id=\"react-burger-cross-btn\"]");
	    
	    By cartIcon_1 = By.className("shopping_cart_link");
	    
	    By Logout = By.id("logout_sidebar_link");
	    
	    
		public WebElement enterUsername() {
			return driver.findElement(username);
			
		}
		public WebElement enterPassword() {
			return driver.findElement(password);
			
		}
		public WebElement ClickLogin() {
			return driver.findElement(loginbtn);
		}
		public void dropdown() {
			WebElement courseElement = driver.findElement(Dropdown);
			Select s = new Select(courseElement);
			s.selectByVisibleText("Name (Z to A)");        	
        
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
        public void productNum() {
        	 String Cartcount=driver.findElement(cartIcon).getText();
             System.out.println("The number of products are added to the cart is: " +Cartcount);
  }


        public WebElement burgermenu() {
        	return driver.findElement(BurgerMenu);
  }
        public WebElement resetappstate() {
        	return driver.findElement(ResetAppState);
        }
        public WebElement exit() {
        	return driver.findElement(Exit);
        }
        public WebElement cartIcon_1() {
        	return driver.findElement(cartIcon_1);
        }
        public void cartIcon1() {
        	 String Cartcount=driver.findElement(cartIcon_1).getText();
        	 System.out.println(Cartcount);
        	 
             if (Cartcount == "") {
            	 
                 System.out.println("Cart is empty") ;   
             }
             else
             {
                 System.out.println("Cart is not empty");
             }
 }
        public WebElement Logout() {
        	
        	return driver.findElement(Logout);
        }
}
