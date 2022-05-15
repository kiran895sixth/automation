package org.test.pro.list_all_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;


//Project prepared by  : Kirankumar
//project purpose :  Check if the added users is listed properly in "List of Prolaborate Users" page or not.

public class TC01_verify_addeduser_is_properly_listed extends BaseClass{
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		boolean username = driver.getPageSource().contains(u);
		if (username == true) {
			System.out.println("username showed properly");
			String n = XLdata.getStringCellData(path, sheet1, 2, 5);
			WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
			sleep();
			boolean display = usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 2, 1));
			if (display == true) {
				System.out.println("Added user is listed  properly");
				XLdata.pass(path, sheet2, 1, 2);
			}
			else {
				System.out.println("Added user is listed not properly");
				XLdata.fail(path, sheet2, 1, 2);
			}
			
		} 
		else 
		{
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 1, 2);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		boolean username = driver.getPageSource().contains(u);
		if (username == true) {
			System.out.println("username showed properly");
			String n = XLdata.getStringCellData(path, sheet1, 2, 5);
			WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
			sleep();
			boolean display = usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 2, 1));
			if (display == true) {
				System.out.println("Added user is listed  properly");
				XLdata.pass(path, sheet2, 1, 3);
			}
			else {
				System.out.println("Added user is listed not properly");
				XLdata.fail(path, sheet2, 1, 3);
			}
			
		} 
		else 
		{
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 1, 3);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		boolean username = driver.getPageSource().contains(u);
		if (username == true) {
			System.out.println("username showed properly");
			String n = XLdata.getStringCellData(path, sheet1, 2, 5);
			WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
			sleep();
			boolean display = usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 2, 1));
			if (display == true) {
				System.out.println("Added user is listed  properly");
				XLdata.pass(path, sheet2, 1, 4);
			}
			else {
				System.out.println("Added user is listed not properly");
				XLdata.fail(path, sheet2, 1, 4);
			}
			
		} 
		else 
		{
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 1, 4);
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
