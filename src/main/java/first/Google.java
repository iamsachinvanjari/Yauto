package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {

	static WebDriver driver;
	
	@BeforeTest
	public void m1() {
		System.setProperty("geckodriver", "/home/sachin/Downloads/Selenium/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
/*		driver.findElement(By.name("q")).sendKeys("selenium hq");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());*/
		
	}
	
	@Test
	public void m2() {
	
		driver.findElement(By.name("q")).sendKeys("selenium hq");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		
	}

}
