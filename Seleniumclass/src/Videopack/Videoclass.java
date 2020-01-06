package Videopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.youtube.com");
		 driver.manage().window().maximize();
		 List<WebElement> all= driver.findElements(By.id("thumbnail"));
		 System.out.println("All Video count "+all.size());
		 
		 for(WebElement e: all)
		 {
			 e.click();
			 Thread.sleep(8000);
			 driver.navigate().back();
			 Thread.sleep(9000);
			 
		 }
		 
		 //Play all videos
		 
		 

	}

}
