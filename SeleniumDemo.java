//Facebook.java

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("solkarshraddha@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("****");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String at = driver.getTitle();
	String et = "Facebook";
	driver.close();
	if(at.equalsIgnoreCase(et))
	{
		System.out.println("Test Successful");
	}
	else
	{
		System.out.println("Test Failure");
	}
}

}

//Gmail.java

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("solkarshraddha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failuer");
		}
	}


}


//SwagLabs.java

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("product_sort_container")).click();
		Thread.sleep(2000);
		Select drpoptions = new Select(driver.findElement(By.className("product_sort_container")));
		drpoptions.selectByVisibleText("Name (Z to A)");
	
		
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("first-name")).sendKeys("Shraddha");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Solkar");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("411041");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	
		String at = driver.getTitle();
		String et = "Swag Labs";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
		
	}

}

