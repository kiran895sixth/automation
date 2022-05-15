package org.test.pro.add_system_users;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;


//Project prepared by  : Kirankumar
//project purpose :  Check whether the In active user can able to login or not


public class TC16_check_inactive_user_able_to_login extends BaseClass {
	public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Add_System_User";
	
	@Test(enabled = true)
	public void add_system_user() throws IOException, InterruptedException {
		chrome();// chrome browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		po.getAdduser().click();//add user button
		sleep();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 2));//password field
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getStatusbutton().click();//status change to inactive
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		String status = driver.findElement(By.xpath("//span[text()='"+u+"']/following::label[1]")).getText();
		if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 12, 6))) 
		{
			signout();
			sleep();
			po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 1));//user mail
			po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 2));//user password
			po.getSigninbutton().click();
			sleep();
			if (driver.findElement(By.xpath("//li[contains(text(),'This user is inactive')]")) != null) 
			{
				System.out.println("user is Inactive");
				System.out.println("TC15 - Inactive user can't able login ");
				XLdata.pass(path, sheet2, 16, 2);
			} 
			else 
			{
				System.out.println("Inactive user can  able login ");
				XLdata.fail(path, sheet2, 16, 2);
			}
		} 
		else 
		{
			System.out.println("user is active");
		}
		
	}
	
	@Test(enabled = true)
	public void add_system_user1() throws IOException, InterruptedException {
		firefox();// firefox browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		po.getAdduser().click();//add user button
		sleep();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 2));//password field
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getStatusbutton().click();//status change to inactive
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 10, 1);
		String status = driver.findElement(By.xpath("//span[text()='"+u+"']/following::label[1]")).getText();
		if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 12, 6))) 
		{
			signout();
			sleep();
			po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 1));//user mail
			po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 2));//user password
			po.getSigninbutton().click();
			sleep();
			if (driver.findElement(By.xpath("//li[contains(text(),'This user is inactive')]")) != null) 
			{
				System.out.println("user is Inactive");
				System.out.println("TC15 - Inactive user can't able login ");
				XLdata.pass(path, sheet2, 16, 3);
			} 
			else 
			{
				System.out.println("Inactive user can  able login ");
				XLdata.fail(path, sheet2, 16, 3);
			}
		} 
		else 
		{
			System.out.println("user is active");
		}
		
	}
	
	@Test(enabled = true)
	public void add_system_user2() throws IOException, InterruptedException {
		edge();// edge browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		waits();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		po.getAdduser().click();//add user button
		sleep();
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 2));//password field
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getStatusbutton().click();//status change to inactive
		po.getSavebutton().click();// save button
		sleep();
		String umail = XLdata.getStringCellData(path, sheet1, 11, 1);
		String status = driver.findElement(By.xpath("//span[text()='"+umail+"']/following::label[1]")).getText();
		if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 12, 6))) 
		{
			signout();
			sleep();
			po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 1));//user mail
			po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 2));//user password
			po.getSigninbutton().click();
			sleep();
			if (driver.findElement(By.xpath("//li[contains(text(),'This user is inactive')]")) != null) 
			{
				System.out.println("user is Inactive");
				System.out.println("TC15 - Inactive user can't able login ");
				XLdata.pass(path, sheet2, 16, 4);
			} 
			else 
			{
				System.out.println("Inactive user can  able login ");
				XLdata.fail(path, sheet2, 16, 4);
			}
		} 
		else 
		{
			System.out.println("user is active");
		}
		sleep();
		backward();
//		refresh();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		String u1 = XLdata.getStringCellData(path, sheet1, 10, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		String u2 = XLdata.getStringCellData(path, sheet1, 11, 1);
		driver.findElement(By.xpath("//span[text()='"+u2+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}


}
