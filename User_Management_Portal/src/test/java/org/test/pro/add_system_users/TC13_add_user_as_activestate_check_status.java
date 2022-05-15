package org.test.pro.add_system_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;
//Project prepared by  : Kirankumar
//project purpose : Add system user as a "Active" user and check whether the added user is in active state or not.

public class TC13_add_user_as_activestate_check_status extends BaseClass {
	public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Add_System_User";
	
	@Test
	public void add_system_user() throws IOException, InterruptedException {
		chrome();// chrome browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
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
		po.getSavebutton().click();// save button
//		backward();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		boolean mail = driver.getPageSource().contains(u);
		System.out.println(mail);
		if (mail == true) 
		{
			String status = driver.findElement(By.xpath("//span[text()='"+u+"']/following::label[1]")).getText();
			if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 9, 6))) 
			{
				System.out.println("TC13 - Active user state properly showed Active");
				XLdata.pass(path, sheet2, 13, 2);
			} 
			else 
			{
				System.out.println("TC13 - Active user state NOT properly showed Active");
				XLdata.fail(path, sheet2, 13, 2);
			}
		} 
		else 
		{
			System.out.println("user is NOT added successfully");
			XLdata.fail(path, sheet2, 13, 2);
		}
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}
	
	@Test
	public void add_system_user1() throws IOException, InterruptedException {
		firefox();// firefox browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
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
		po.getSavebutton().click();// save button
//		backward();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		boolean mail = driver.getPageSource().contains(u);
		System.out.println(mail);
		if (mail == true) 
		{
			String status = driver.findElement(By.xpath("//span[text()='"+u+"']/following::label[1]")).getText();
			if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 9, 6))) 
			{
				System.out.println("TC13 - Active user state properly showed Active");
				XLdata.pass(path, sheet2, 13, 3);
			} 
			else 
			{
				System.out.println("TC13 - Active user state NOT properly showed Active");
				XLdata.fail(path, sheet2, 13, 3);
			}
		} 
		else 
		{
			System.out.println("user is NOT added successfully");
			XLdata.fail(path, sheet2, 13, 3);
		}
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}
	
	@Test
	public void add_system_user2() throws IOException, InterruptedException {
		edge();// edge browser
		PojoClass po = new PojoClass();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
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
		po.getSavebutton().click();// save button

		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		boolean mail = driver.getPageSource().contains(u);
		System.out.println(mail);
		if (mail == true) 
		{
			String status = driver.findElement(By.xpath("//span[text()='"+u+"']/following::label[1]")).getText();
			if (status.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 9, 6))) 
			{
				System.out.println("TC13 - Active user state properly showed Active");
				XLdata.pass(path, sheet2, 13, 4);
			} 
			else 
			{
				System.out.println("TC13 - Active user state NOT properly showed Active");
				XLdata.fail(path, sheet2, 13, 4);
			}
		} 
		else 
		{
			System.out.println("user is NOT added successfully");
			XLdata.fail(path, sheet2, 13, 4);
		}
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}
}
