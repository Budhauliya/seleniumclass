package test_package;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	ChromeDriver driver;
	@Before
	public void login()
	{
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 
		
	}
	
	@Test
	 public void page1() throws InterruptedException
	 {
		 WebElement FirstName= driver.findElementById("u_0_m");
		 FirstName.sendKeys("akanksha");
		 Thread.sleep(2000);
			WebElement surname=driver.findElement(By.name("lastname"));
			surname.sendKeys("Budhauliya");
			//Thread.sleep(2000);
			
			WebElement mobile=driver.findElement(By.id("u_0_r"));
			mobile.sendKeys("1234567890");
			//Thread.sleep(6000);
			
			WebElement Password=driver.findElement(By.id("u_0_w"));
			Password.sendKeys("1234");
			
			//Thread.sleep(8000);

			WebElement day=driver.findElement(By.id("day"));
			Select dy=new Select(day);
			dy.selectByIndex(6);

			WebElement month=driver.findElement(By.id("month"));
			Select mnth=new Select(month);
			mnth.selectByIndex(8);

			WebElement year=driver.findElement(By.id("year"));
			Select yr=new Select(year);
			yr.selectByIndex(29);
			
			WebElement gender= driver.findElement(By.id("u_0_6"));
			gender.click();
			
			WebElement signup=driver.findElement(By.id("u_0_13"));
			signup.click();
			
	 }
		
	 @After
	 public  void page2() throws InterruptedException
	 {
		 Thread.sleep(7000);
		 driver.close();
	 } 
}
