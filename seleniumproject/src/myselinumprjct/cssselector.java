package myselinumprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cssselector {
@Test
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
	driver.findElement(By.cssSelector("#login1")).sendKeys("vamsikrishna");
	driver.findElement(By.cssSelector("#password")).sendKeys("1234214");
	driver.findElement(By.cssSelector("div[class='login-form'] input[type='submit']")).click();
	}

}
