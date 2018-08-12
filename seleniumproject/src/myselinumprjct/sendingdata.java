package myselinumprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sendingdata {
  @Test
	
	public void enterText() {
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("Webdriver.chrome.driver", " D:\\selinum\\drivers\\chrome2.exe");
   //driver = new ChromeDriver();
   driver.get("https://www.actitime.com/");
  /* driver.findElement(By.xpath("//*[@id='email']")).sendKeys("2020vamsi@gmail.com");
   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("656565");
   driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("fdhg");
   driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("hcvjhv");
   driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("gfch");*/
	WebElement features =(WebElement) driver.findElements(By.xpath("html/body/header/div/nav/ul/li[2]"));
	Actions action = new Actions(driver);
	action.moveToElement(features).build().perform();
	}
}
