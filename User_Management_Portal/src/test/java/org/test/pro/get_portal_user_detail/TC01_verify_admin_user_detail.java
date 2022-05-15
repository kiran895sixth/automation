package org.test.pro.get_portal_user_detail;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : Click on View Details and check if the user details are displaying properly.

public class TC01_verify_admin_user_detail extends BaseClass {
	public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Get_Portal_User_Detail";
	
@Test
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	driver.findElement(By.xpath("//input[@id='userIsAdmin']")).click();
	sleep();
	po.getSavebutton().click();
	waits();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	//		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username+
	WebElement username1 = driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]"));// click username
	if (username1.isDisplayed())
	{
		username1.click();
		String firstname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[1]")).getAttribute("value");
		String usermail = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[2]")).getAttribute("value");
		String timezone = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[3]")).getAttribute("value");
		String lastname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[4]")).getAttribute("value");
		String status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]")).getText();
		String admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]")).getText();
		if (firstname.equals(XLdata.getStringCellData(path, sheet1, 2, 4)) && lastname.equals(XLdata.getStringCellData(path, sheet1, 2, 5)) 
				&& usermail.equals(u) && timezone.equals("UTC") && status.equalsIgnoreCase("active")&& admin.equals("Yes")) {

			XLdata.pass(path, sheet2, 1, 2);

		} 
		else 
		{
			XLdata.fail(path, sheet2, 1, 2);
		}
		sleep();
		backward();
		sleep();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
}
}

@Test
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	driver.findElement(By.xpath("//input[@id='userIsAdmin']")).click();
	sleep();
	po.getSavebutton().click();
	waits();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	//		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username+
	WebElement username1 = driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]"));// click username
	if (username1.isDisplayed())
	{
		username1.click();
		String firstname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[1]")).getAttribute("value");
		String usermail = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[2]")).getAttribute("value");
		String timezone = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[3]")).getAttribute("value");
		String lastname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[4]")).getAttribute("value");
		String status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]")).getText();
		String admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]")).getText();
		if (firstname.equals(XLdata.getStringCellData(path, sheet1, 2, 4)) && lastname.equals(XLdata.getStringCellData(path, sheet1, 2, 5)) 
				&& usermail.equals(u) && timezone.equals("UTC") && status.equalsIgnoreCase("active")&& admin.equals("Yes")) {

			XLdata.pass(path, sheet2, 1, 3);

		} 
		else 
		{
			XLdata.fail(path, sheet2, 1, 3);
		}
		sleep();
		backward();
		sleep();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
}
}

@Test
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
	driver.findElement(By.xpath("//input[@id='userIsAdmin']")).click();
	sleep();
	po.getSavebutton().click();
	waits();
	String u = XLdata.getStringCellData(path, sheet1, 2, 1);
	//		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username+
	WebElement username1 = driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]"));// click username
	if (username1.isDisplayed())
	{
		username1.click();
		String firstname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[1]")).getAttribute("value");
		String usermail = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[2]")).getAttribute("value");
		String timezone = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[3]")).getAttribute("value");
		String lastname = driver.findElement(By.xpath("//span[text()='Edit User']/following::input[4]")).getAttribute("value");
		String status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]")).getText();
		String admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]")).getText();
		if (firstname.equals(XLdata.getStringCellData(path, sheet1, 2, 4)) && lastname.equals(XLdata.getStringCellData(path, sheet1, 2, 5)) 
				&& usermail.equals(u) && timezone.equals("UTC") && status.equalsIgnoreCase("active")&& admin.equals("Yes")) {

			XLdata.pass(path, sheet2, 1, 4);

		} 
		else 
		{
			XLdata.fail(path, sheet2, 1, 4);
		}
		sleep();
		backward();
		sleep();
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
}
}
}
