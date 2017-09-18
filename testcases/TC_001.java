package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 {
	public WebDriver driver;
	@BeforeTest
	public void beforetest(){
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");
			}

	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("harimhks@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chithraanbu");
		driver.findElement(By.id("u_0_2")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='2n_9']"));
		// Alert imp = driver.switchTo().alert();
		// imp.accept();
	}
	@AfterTest
	public void aftertest(){
		driver.quit();
	}
}
