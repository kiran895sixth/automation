package org.test.pro.list_all_users;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : TC08 Add the "Active Directory users" from repository and check whether it is listed properly in "List of prolaborate Users" page or not.
//					TC09 Check if the "Active Directory users" type is displayed as "Active Directory User" in List of Prolaborate Users page or not


public class TC08_09_verify_ADuser_add_from_rep extends BaseClass{
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
		po.getHeadlogo().click();
		driver.findElement(By.xpath("//span[text()='DemoModel']")).click();
		sleep();
		po.getMenu().click();
		po.getUsers().click();
		sleep();
		po.getAdduser().click();
		driver.findElement(By.xpath("//span[text()='Add Active Directory User']")).click();//aduser add link
		driver.navigate().refresh();
		waits();
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();//ad domain select field
		driver.findElement(By.xpath("//span[text()='AD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Users ']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();//choose by user
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='AD1001']/preceding::div[1]")).click();// selecting user
		driver.findElement(By.xpath("//span[text()='Add Users']")).click();// add button
		po.getMenu().click();
		sleep();
		po.getUsersmanagement().click();
		sleep();
		if (driver.getPageSource().contains("AD1001")) 
		{
			System.out.println("ADuser added from repository is showed user management users list");
			XLdata.pass(path, sheet2, 8, 2);
		} 
		else 
		{
			System.out.println("ADuser added from repository is NOT showed user management users list");
			XLdata.fail(path, sheet2, 8, 2);
		}
		
		String usertype = driver.findElement(By.xpath("//span[text()='  AD1001']/following::span[4]")).getText();
	
		if (usertype.equals("Active Directory User")) 
		{
			System.out.println("usertype is showed properly -- "+ usertype);
			XLdata.pass(path, sheet2, 9, 2);
		} 
		else 
		{
			System.out.println("usertype is NOT showed properly -- "+ usertype);
			XLdata.fail(path, sheet2, 9, 2);
		}
	}
}
