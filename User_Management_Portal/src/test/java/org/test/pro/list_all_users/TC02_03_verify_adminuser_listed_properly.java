package org.test.pro.list_all_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : Check if the "Prolaborate Admin" users are listed properly in "List of Prolaborate Users" page or not & usertype



public class TC02_03_verify_adminuser_listed_properly extends BaseClass {
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "List_All_User";
	@Test
	public void verify_added_user_list() throws InterruptedException, IOException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 5));
		sleep();
		po.getAdminbutton().click();// admin button on
		sleep();
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 3, 1);
        String n = XLdata.getStringCellData(path, sheet1, 3, 5);
		boolean username = driver.getPageSource().contains(n);
		if (username == true) 
		{
			System.out.println("TC02 - admin user listed properly in user management portal");
			XLdata.pass(path, sheet2, 2, 2);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			if (usertype.getText().equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 3, 3))) {
				System.out.println("TC03 - Admin user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 3, 2);
			}
			else {
				System.out.println("TC03 - Admin user type is listed not properly");
				XLdata.fail(path, sheet2, 3, 2);
			}
			
		} 
		else 
		{
			System.out.println("TC02 - Added user is listed not properly");
			XLdata.fail(path, sheet2, 2, 2);
		}	
		
		sleep();
		
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
	
	@Test
	public void verify_added_user_list1() throws InterruptedException, IOException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 5));
		sleep();
		po.getAdminbutton().click();// admin button on
		sleep();
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 3, 1);
		String n = XLdata.getStringCellData(path, sheet1, 3, 5);
		boolean username = driver.getPageSource().contains(n);
		if (username == true) 
		{
			System.out.println("TC02 - admin user listed properly in user management portal");
			XLdata.pass(path, sheet2, 2, 3);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			if (usertype.getText().equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 3, 3))) {
				System.out.println("TC03 - Admin user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 3, 3);
			}
			else {
				System.out.println("TC03 - Admin user type is listed not properly");
				XLdata.fail(path, sheet2, 3, 3);
			}
			
		} 
		else 
		{
			System.out.println("TC02 - Added user is listed not properly");
			XLdata.fail(path, sheet2, 2, 3);
		}	
		
		sleep();
		
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
	
	@Test
	public void verify_added_user_list2() throws InterruptedException, IOException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 3, 5));
		sleep();
		po.getAdminbutton().click();// admin button on
		sleep();
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 3, 1);
		String n = XLdata.getStringCellData(path, sheet1, 3, 4);
		boolean username = driver.getPageSource().contains(n);
		if (username == true) 
		{
			System.out.println("TC02 - admin user listed properly in user management portal");
			XLdata.pass(path, sheet2, 2, 4);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			if (usertype.getText().equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 3, 3))) {
				System.out.println("TC03 - Admin user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 3, 4);
			}
			else {
				System.out.println("TC03 - Admin user type is listed not properly");
				XLdata.fail(path, sheet2, 3, 4);
			}
			
		} 
		else 
		{
			System.out.println("TC02 - Added user is listed not properly");
			XLdata.fail(path, sheet2, 2, 4);
		}	
		
		sleep();
		
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
}

