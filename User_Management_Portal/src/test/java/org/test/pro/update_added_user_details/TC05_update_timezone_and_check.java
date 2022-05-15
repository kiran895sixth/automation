package org.test.pro.update_added_user_details;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

public class TC05_update_timezone_and_check extends BaseClass{
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Update_Added_User_Details";
	
	@Test(enabled = true)
	public void update_user_details() throws IOException, InterruptedException {
		chrome();
		sleep();
		PojoClass po = new PojoClass();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();
		po.getUsersmanagement().click();
		sleep();
		po.getAdduser().click();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 6, 1);
//		WebElement user = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]"));//edit button
//		user.click();
//		sleep();
////		WebElement status = driver.findElement(By.id("userStatus")); //status button
////		status.click();// status change to active
//		po.getSavebutton().click();	
//		sleep();
		po.getHeadlogo().click();
		sleep();
		driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//repository select
		sleep();
		po.getMenu().click();
		sleep();
		po.getUsers().click();
		sleep();
		po.getAdduser().click();
		driver.findElement(By.xpath("//span[text()='Add Existing Users']")).click();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getAdduser().click();
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 2));
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 6,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 6,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		driver.findElement(By.xpath("//img[@class='d-inline-block rounded-circle user-icon']")).click();//click profile
		driver.findElement(By.xpath("//span[text()='My Profile']")).click();
		waits();
		driver.findElement(By.xpath("//fa-icon[@class='ng-fa-icon text-lg ng-star-inserted']")).click();//edit button
		driver.findElement(By.xpath("//label[text()='Time Zone *']/following::div[1]")).click();
		sleep();
		WebElement timezone = driver.findElement(By.xpath("//div[contains(text(),' (UTC-10:00) Hawaii')]"));
		timezone.click();
		po.getSavebutton().click();
		sleep();
		String zonename = driver.findElement(By.xpath("//span[text()='Time Zone']/following::td[1]")).getText();
		if (zonename.equalsIgnoreCase("Hawaiian Standard Time")) 
		{
			System.out.println("TC05 - updated time zone is properly changed in user profile");
			XLdata.pass(path, sheet2, 5, 2);
		} 
		else 
		{
			System.out.println("TC05 - updated time zone is NOT changed in user profile");
			XLdata.fail(path, sheet2, 5, 2);
		}
		
	}

	@Test(enabled = true)
	public void update_user_details1() throws IOException, InterruptedException {
		firefox();
		sleep();
		PojoClass po = new PojoClass();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();
		po.getUsersmanagement().click();
		sleep();
		po.getAdduser().click();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 7, 1);
		po.getHeadlogo().click();
		sleep();
		driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//repository select
		sleep();
		po.getMenu().click();
		sleep();
		po.getUsers().click();
		sleep();
		po.getAdduser().click();
		driver.findElement(By.xpath("//span[text()='Add Existing Users']")).click();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getAdduser().click();
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 2));
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 7,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 7,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		driver.findElement(By.xpath("//img[@class='d-inline-block rounded-circle user-icon']")).click();//click profile
		driver.findElement(By.xpath("//span[text()='My Profile']")).click();
		waits();
		driver.findElement(By.xpath("//h3[text()='Personal Details']/following::a")).click();//edit button
		driver.findElement(By.xpath("//label[text()='Time Zone *']/following::div[1]")).click();
		sleep();
		WebElement timezone = driver.findElement(By.xpath("//div[contains(text(),'Alaska')]"));
		timezone.click();
		po.getSavebutton().click();
		sleep();
		String zonename = driver.findElement(By.xpath("//span[text()='Time Zone']/following::td[1]")).getText();
		if (zonename.contains("Alaska")) 
		{
			System.out.println("TC05 - updated time zone is properly changed in user profile");
			XLdata.pass(path, sheet2, 5, 3);
		} 
		else 
		{
			System.out.println("TC05 - updated time zone is NOT changed in user profile");
			XLdata.fail(path, sheet2, 5, 3);
		}
		
	}
	
	@Test(enabled = true)
	public void update_user_details2() throws IOException, InterruptedException {
		edge();
		sleep();
		PojoClass po = new PojoClass();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();
		po.getUsersmanagement().click();
		sleep();
		po.getAdduser().click();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 8, 1);
		po.getHeadlogo().click();
		sleep();
		driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//repository select
		sleep();
		po.getMenu().click();
		sleep();
		po.getUsers().click();
		sleep();
		po.getAdduser().click();
		driver.findElement(By.xpath("//span[text()='Add Existing Users']")).click();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getAdduser().click();
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 2));
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 8,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 8,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		driver.findElement(By.xpath("//img[@class='d-inline-block rounded-circle user-icon']")).click();//click profile
		driver.findElement(By.xpath("//span[text()='My Profile']")).click();
		waits();
		driver.findElement(By.xpath("//h3[text()='Personal Details']/following::a")).click();//edit button
		driver.findElement(By.xpath("//label[text()='Time Zone *']/following::div[1]")).click();
		sleep();
		WebElement timezone = driver.findElement(By.xpath("//div[contains(text(),'Alaska')]"));
		timezone.click();
		po.getSavebutton().click();
		sleep();
		String zonename = driver.findElement(By.xpath("//span[text()='Time Zone']/following::td[1]")).getText();
		if (zonename.contains("Alaska")) 
		{
			System.out.println("TC05 - updated time zone is properly changed in user profile");
			XLdata.pass(path, sheet2, 5, 4);
		} 
		else 
		{
			System.out.println("TC05 - updated time zone is NOT changed in user profile");
			XLdata.fail(path, sheet2, 5, 4);
		}
		
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 6, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		String u2 = XLdata.getStringCellData(path, sheet1, 7, 1);
		driver.findElement(By.xpath("//span[text()='"+u2+"']/preceding::div[2]")).click();
		String u3 = XLdata.getStringCellData(path, sheet1, 8, 1);
		driver.findElement(By.xpath("//span[text()='"+u3+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
}
