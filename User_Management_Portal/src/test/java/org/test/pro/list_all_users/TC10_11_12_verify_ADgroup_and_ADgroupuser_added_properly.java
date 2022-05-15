package org.test.pro.list_all_users;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;


//Project prepared by  : Kirankumar
//project purpose :  TC10 Check if the "Active Directory Group" users are listed properly in "List of Prolaborate Users" page or not
//					 TC11 Add the "Active Directory Group users" from repository and check whether it is listed properly in "List of prolaborate Users" page or not.
//					 TC12 Check if the "Active Directory Group Users" type is displayed as "Active Directory Group User" in List of Prolaborate Users page or not


public class TC10_11_12_verify_ADgroup_and_ADgroupuser_added_properly extends BaseClass {
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "List_All_User";
	@Test(enabled = true)
	public void add_ADuser() throws InterruptedException, IOException {
		chrome();
		sleep();
		PojoClass po = new PojoClass();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
		po.getSigninbutton().click();
		waits();
//		po.getHeadlogo().click();
//		driver.findElement(By.xpath("//span[text()='DemoModel']")).click();
		sleep();
		po.getMenu().click();
		po.getUsersmanagement().click();
		sleep();
		po.getAdduser().click();//add user button
		driver.findElement(By.xpath("//span[text()='Add Active Directory User']")).click();//aduser add link
		driver.navigate().refresh();
		waits();
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();//ad domain select field
		driver.findElement(By.xpath("//span[text()='AD']")).click();
		sleep();
		driver.findElement(By.id("ad-user-group")).click();// select group
		driver.findElement(By.xpath("//span[text()='Users']")).click();//select user from browser
		driver.findElement(By.xpath("//span[text()='AdGroup101']/preceding::div[1]")).click();// adgroup select
		driver.findElement(By.xpath("//span[text()='Add Groups']")).click();//add group button
		po.getMenu().click();
		sleep();
		po.getUsersmanagement().click();
		driver.findElement(By.xpath("//span[text()='Active Directory Groups']")).click();
		sleep();
		if (driver.getPageSource().contains("AdGroup101")) 
		{
			System.out.println("ADgroup added  user management Adgroup list");
			XLdata.pass(path, sheet2, 10, 2);
		} 
		else 
		{
			System.out.println("ADgroup NOT added  user management Adgroup list");
			XLdata.fail(path, sheet2, 10, 2);
		}
		
		driver.findElement(By.xpath("//span[text()='AdGroup101']/following::a[1]")).click();
		waits();
		WebElement user = driver.findElement(By.xpath("(//span[@class='d-table-cell align-middle pt-1 pb-1 pr-2 pl-2'])[1]"));
		sleep();
		String username = user.getText();
		System.out.println(username);
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		signout();
		waits();
		po.getTextEmail().sendKeys(username);
		po.getTextpassword().sendKeys("Welcome@123");
		po.getSigninbutton().click();
		sleep();
		signout();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();
		po.getUsersmanagement().click();
		sleep();
		if (driver.getPageSource().contains(username)) 
		{
			System.out.println("ADgroup user added in user management Adgroup list");
			XLdata.pass(path, sheet2, 11, 2);
		} 
		else 
		{
			System.out.println("ADgroup user NOT added in user management Adgroup list");
			XLdata.fail(path, sheet2, 11, 2);
		}
//		List<WebElement> usertype = driver.findElements(By.xpath("//span[@class='d-inline-block align-bottom overflow-hidden line-h-20']/following::span[4]"));
//		int size = usertype.size();
//		for (int i = 0; i <size; i++) {
//			String display = usertype.get(i).getText();
//			if (display.equals("Active Directory Group User")) 
//			{
//				System.out.println("user name is matched within the list");
//				break;
//			}
//			else {
//				System.out.println("user name is NOT matched within the list");
//			}		
//		}
		String usertype = driver.findElement(By.xpath("//span[contains(text(),'"+username+"')]/following::span[4]")).getText();
		if (usertype.contains("Active Directory Group User")) 
		{
			System.out.println("ADgroup user added in user management Adgroup list");
			XLdata.pass(path, sheet2, 12, 2);
		} 
		else 
		{
			System.out.println("ADgroup user NOT added in user management Adgroup list");
			XLdata.fail(path, sheet2, 12, 2);
		}
			
	}
}
