package Facebookbagesignin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Akanksha\\.eclipse\\chromedriver.exe");
  
 ChromeDriver driver = new ChromeDriver();
 
 driver.get("https://www.facebook.com");
 
 //driver.get("https://hi.truxapp.com/trux/home/?bypass=1");
 Options op= driver.manage();
Window w= op.window();
 w.maximize();
 
  WebElement FirstName= driver.findElementById("u_0_m");
 FirstName.sendKeys("akanksha");
 
 WebElement surname=driver.findElementByCssSelector("input#u_0_o" );
surname.sendKeys("Budhauliya");

WebElement mobile=driver.findElementById("u_0_r");
mobile.sendKeys("1234567890");

//WebElement Password=driver.findElementById("u_0_w");
//Password.sendkeys("abc");



//driver.findElementByCssSelector(using)
 
 
	}

}
