package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost:81/Account/Login");//url hit
		System.out.println("Chrome browser opened");
	}
	
	public static void firefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost:81/Account/Login");//url hit
		System.out.println("firefox browser opened");
	}
	
	public static void edge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:81/Account/Login");
		System.out.println("Edge browser opened");
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		driver.close();
		System.out.println("browser close");
	}
	
	public static void signout() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@class='d-inline-block rounded-circle user-icon']")).click();//profile image
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Sign Out']")).click();//click sign out
	}
	
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public static void backward() {
		driver.navigate().back();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
}
