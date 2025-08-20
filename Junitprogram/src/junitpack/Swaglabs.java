package junitpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglabs {
	WebDriver driver;
	@Test 
	public void test1() throws InterruptedException
	{
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	      Thread.sleep(2000);
	      driver.findElement(By.id("login-button")).click();
	      Thread.sleep(2000);
	}
	@Before
	public void start() throws InterruptedException
	{
		 System.setProperty("webdriver.edge.driver","C:\\selenium\\Edge\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 driver.get("https://www.saucedemo.com/");
	     Thread.sleep(2000);
	     String URL=driver.getCurrentUrl();
	     System.out.println("Current URL"+URL);
//	     driver.manage().window().minimize();
//	     Thread.sleep(2000);
//	     System.out.println("Window minimized");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     System.out.println("Window maximizes");
//	     driver.manage().window().fullscreen();
//	     Thread.sleep(2000);
//	     System.out.println("Window in fullscreen");
	}
	
	@After
	public void end()
	{
			driver.quit();
	}
}
