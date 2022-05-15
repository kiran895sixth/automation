package org.test.pro.list_all_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : TC04 Check if the "Registered" users are listed properly in "List of Prolaborate Users" page or not & usertype
//					TC06 Check if the "Registered" users type is displayed as "Registered User" in List of Prolaborate Users page or not


public class TC04_06_verify_registered_user_listed_properly extends BaseClass {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 5));
		po.getSavebutton().click();
		String u = XLdata.getStringCellData(path, sheet1, 4, 1);
		String n = XLdata.getStringCellData(path, sheet1, 4, 4);
		sleep();
		boolean username = driver.getPageSource().contains(n);
		if (username == true) {
			System.out.println("TC04 - Registered user listed  properly in UserManagement Portal");
			XLdata.pass(path, sheet2, 4, 2);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			boolean display = usertype.getText().contains(XLdata.getStringCellData(path, sheet1, 4, 3));
			if (display == true) {
				System.out.println("TC06 -Registered user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 6, 2);
			} else {
				System.out.println("TC06 -Registered user type is NOT listed  properly ");
				XLdata.fail(path, sheet2, 6, 2);
			}

		} else {
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 4, 2);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 5));
		po.getSavebutton().click();
		String u = XLdata.getStringCellData(path, sheet1, 4, 1);
		String n = XLdata.getStringCellData(path, sheet1, 4, 4);
		sleep();
		boolean username = driver.getPageSource().contains(n);
		if (username == true) {
			System.out.println("TC04 - Registered user listed  properly in UserManagement Portal");
			XLdata.pass(path, sheet2, 4, 3);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			boolean display = usertype.getText().contains(XLdata.getStringCellData(path, sheet1, 4, 3));
			if (display == true) {
				System.out.println("TC06 -Registered user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 6, 3);
			} else {
				System.out.println("TC06 -Registered user type is NOT listed  properly ");
				XLdata.fail(path, sheet2, 6, 3);
			}

		} else {
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 4, 3);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 4, 5));
		po.getSavebutton().click();
		String u = XLdata.getStringCellData(path, sheet1, 4, 1);
		String n = XLdata.getStringCellData(path, sheet1, 4, 4);
		sleep();
		boolean username = driver.getPageSource().contains(n);
		if (username == true) {
			System.out.println("TC04 - Registered user listed  properly in UserManagement Portal");
			XLdata.pass(path, sheet2, 4, 4);
			WebElement usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]"));
			sleep();
			boolean display = usertype.getText().contains(XLdata.getStringCellData(path, sheet1, 4, 3));
			if (display == true) {
				System.out.println("TC06 -Registered user type is listed  properly --- "+ usertype.getText());
				XLdata.pass(path, sheet2, 6, 4);
			} else {
				System.out.println("TC06 -Registered user type is NOT listed  properly ");
				XLdata.fail(path, sheet2, 6, 4);
			}

		} else {
			System.out.println("Added user is listed not properly");
			XLdata.fail(path, sheet2, 4, 4);
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
