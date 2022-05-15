package org.test.pro.list_all_users;

import java.io.IOException;



//Project prepared by -- Kirankumar
//project purpose --  Add the "Registered users" from repository and check whether it is listed properly in "List of prolaborate Users" page or not.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : Add the "Registered users" from repository and check whether it is listed properly in "List of prolaborate Users" page or not.


public class TC05_RegisteredUser_add_from_repository extends BaseClass {
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "List_All_User";
@Test (enabled = false)
public void add_user_from_repository() throws IOException, InterruptedException {
	chrome();
	sleep();
	PojoClass po = new PojoClass();
	po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
	po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
	po.getSigninbutton().click();
	waits();
	po.getHeadlogo().click();
	driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//select repository
	sleep();
	po.getMenu().click();
	po.getUsers().click();
	po.getAdduser().click();
	sleep();
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 1));
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 2));
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 4));
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 5));
	po.getSavebutton().click();
	sleep();
	po.getMenu().click();
	po.getUsersmanagement().click();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 5, 1);
	String n = XLdata.getStringCellData(path, sheet1, 5, 4);
	boolean username = driver.getPageSource().contains(n);
	if (username == true) 
	{
		System.out.println("User added form Repository is listed in Uesrmanagement portal");
		sleep();
		WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
		sleep();
		if (usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 5, 1))) {
			System.out.println("TC05 - User added form Repository is listed in Uesrmanagement portal");
			XLdata.pass(path, sheet2, 5, 2);
		}
		else {
			System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
			XLdata.fail(path, sheet2, 5, 2);
		}

	} 
	else 
	{
		System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
		XLdata.fail(path, sheet2, 5, 2);
	}	
	
	sleep();
	driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::div[2]")).click();
	sleep();
	po.getDeletebutton().click();
	sleep();
	po.getDeleteanyway().click();
	sleep();

}
	
@Test(enabled = false)
public void add_user_from_repository1() throws IOException, InterruptedException {
	firefox();
	sleep();
	PojoClass po = new PojoClass();
	po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
	po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
	po.getSigninbutton().click();
	waits();
	po.getHeadlogo().click();
	sleep();
	driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//select repository
	sleep();
	po.getMenu().click();
	po.getUsers().click();
	po.getAdduser().click();
	sleep();
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 1));
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 2));
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 4));
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 5));
	po.getSavebutton().click();
	sleep();
	po.getMenu().click();
	po.getUsersmanagement().click();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 5, 1);
	String n = XLdata.getStringCellData(path, sheet1, 5, 4);
	boolean username = driver.getPageSource().contains(n);
	if (username == true) 
	{
		System.out.println("User added form Repository is listed in Uesrmanagement portal");
		WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
		sleep();
		boolean display = usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 5, 1));
		if (display == true) {
			System.out.println("TC05 - User added form Repository is listed in Uesrmanagement portal");
			XLdata.pass(path, sheet2, 5, 3);
		}
		else {
			System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
			XLdata.fail(path, sheet2, 5, 3);
		}
		
	} 
	else 
	{
		System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
		XLdata.fail(path, sheet2, 5, 3);
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
public void add_user_from_repository2() throws IOException, InterruptedException {
	edge();
	sleep();
	PojoClass po = new PojoClass();
	po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));
	po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));
	po.getSigninbutton().click();
	waits();
	po.getHeadlogo().click();
	driver.findElement(By.xpath("//span[text()='DemoModel']")).click();//select repository
	sleep();
	po.getMenu().click();
	po.getUsers().click();
	po.getAdduser().click();
	sleep();
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 1));
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 2));
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 4));
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 5, 5));
	po.getSavebutton().click();
	sleep();
	po.getMenu().click();
	po.getUsersmanagement().click();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 5, 1);
	String n = XLdata.getStringCellData(path, sheet1, 5, 4);
	boolean username = driver.getPageSource().contains(n);
	if (username == true) 
	{
		System.out.println("User added form Repository is listed in Uesrmanagement portal");
		WebElement usermail = driver.findElement(By.xpath("//span[contains(text(),'"+n+"')]/following::span[2]"));
		sleep();
		boolean display = usermail.getText().contains(XLdata.getStringCellData(path, sheet1, 5, 1));
		if (display == true) {
			System.out.println("TC05 - User added form Repository is listed in Uesrmanagement portal");
			XLdata.pass(path, sheet2, 5, 4);
		}
		else {
			System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
			XLdata.fail(path, sheet2, 5, 4);
		}
		
	} 
	else 
	{
		System.out.println("User added form Repository is NOT listed in Uesrmanagement portal");
		XLdata.fail(path, sheet2, 5, 4);
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



