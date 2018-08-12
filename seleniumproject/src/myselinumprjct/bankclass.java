package myselinumprjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bankclass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://corp.onlinesbi.com/khata/login.htm");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='phishing_banner']/div/a")).click();
		driver.close();

	}

}
