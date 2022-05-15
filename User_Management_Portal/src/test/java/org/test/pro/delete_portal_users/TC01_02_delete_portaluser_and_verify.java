package org.test.pro.delete_portal_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : 1.Delete the user from portal user management and check whether it is fully deleted from the Prolaborate application are not.
//					2.Delete the user from the portal user management and check if the confirmation model window occurs or not



public class TC01_02_delete_portaluser_and_verify extends BaseClass {
	public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet3 = "Delete_Portal_user";
	@Test
	public void delete_portal_user() throws IOException, InterruptedException {
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	po.getSavebutton().click();// save button
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();// user select
	sleep();
	driver.findElement(By.xpath("//span[text()='Delete']")).click();//delete button
	sleep();
	boolean text = driver.getPageSource().contains("Are you sure you want to delete this user?");
	System.out.println(text);
	if (text == true) 
	{
		System.out.println("TC02 - confirmation window is appeared before deleting the user");
		XLdata.pass(path, sheet3, 2, 2);
	} 
	else 
	{
		System.out.println("confirmation window is not appeared before deleting the user");
		XLdata.fail(path, sheet3, 2, 2);
	}
	driver.findElement(By.xpath("//span[text()='Delete Anyway']")).click();//delete anyway button
	sleep();
	boolean text1 = driver.getPageSource().contains(u);
	System.out.println(text1);
	if (text1 == false) 
	{
		System.out.println("TC01 - user is deleted successfully");
		XLdata.pass(path, sheet3, 1, 2);
	} 
	else 
	{
		System.out.println("user is NOT deleted successfully");
		XLdata.fail(path, sheet3, 1, 2);
	}
	}
	
	@Test
	public void delete_portal_user1() throws IOException, InterruptedException {
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	po.getSavebutton().click();// save button
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();// user select
	driver.findElement(By.xpath("//span[text()='Delete']")).click();//delete button
	sleep();
	boolean text = driver.getPageSource().contains("Are you sure you want to delete this user?");
	System.out.println(text);
	if (text == true) 
	{
		System.out.println("TC02 - confirmation window is appeared before deleting the user");
		XLdata.pass(path, sheet3, 2, 3);
	} 
	else 
	{
		System.out.println("confirmation window is not appeared before deleting the user");
		XLdata.fail(path, sheet3, 2, 3);
	}
	driver.findElement(By.xpath("//span[text()='Delete Anyway']")).click();//delete anyway button
	sleep();
	boolean text1 = driver.getPageSource().contains(u);
	System.out.println(text1);
	if (text1 == false) 
	{
		System.out.println("TC01 - user is deleted successfully");
		XLdata.pass(path, sheet3, 1, 3);
	} 
	else 
	{
		System.out.println("user is NOT deleted successfully");
		XLdata.fail(path, sheet3, 1, 3);
	}
	}
	
	@Test
	public void delete_portal_user2() throws IOException, InterruptedException {
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	po.getSavebutton().click();// save button
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();// user select
	sleep();
	driver.findElement(By.xpath("//span[text()='Delete']")).click();//delete button
	sleep();
	boolean text = driver.getPageSource().contains("Are you sure you want to delete this user?");
	System.out.println(text);
	if (text == true) 
	{
		System.out.println("TC02 - confirmation window is appeared before deleting the user");
		XLdata.pass(path, sheet3, 2, 4);
	} 
	else 
	{
		System.out.println("confirmation window is not appeared before deleting the user");
		XLdata.fail(path, sheet3, 2, 4);
	}
	driver.findElement(By.xpath("//span[text()='Delete Anyway']")).click();//delete anyway button
	sleep();
	boolean text1 = driver.getPageSource().contains(u);
	System.out.println(text1);
	if (text1 == false) 
	{
		System.out.println("TC01 - user is deleted successfully");
		XLdata.pass(path, sheet3, 1, 4);
	} 
	else 
	{
		System.out.println("user is NOT deleted successfully");
		XLdata.fail(path, sheet3, 1, 4);
	}
	}
}
