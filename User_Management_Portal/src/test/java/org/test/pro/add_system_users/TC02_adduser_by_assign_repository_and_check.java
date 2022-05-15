package org.test.pro.add_system_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;
//Project prepared by  : Kirankumar
//project purpose : Add System User by assigning the particular repository and check whether the repository is assigned properly or not.

public class TC02_adduser_by_assign_repository_and_check extends BaseClass {
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
//		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
//		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 10, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();
		driver.findElement(By.xpath("//label[text()='DemoModel']")).click();
		po.getSavebutton().click();// save button
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 10,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 10,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		sleep();
		po.getHeadlogo().click();
		sleep();
		if (driver.findElement(By.xpath("//span[text()='DemoModel']")) != null) 
		{
			System.out.println("TC02 - Assigned Repository is properly assigned in user account");
			XLdata.pass(path, sheet2, 2, 2);
		} 
		else 
		{
			System.out.println("TC02 - Assigned Repository is NOT properly assigned in user account");
			XLdata.fail(path, sheet2, 2, 2);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 2));//password field
//		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
//		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();
		driver.findElement(By.xpath("//label[text()='DemoModel']")).click();
		po.getSavebutton().click();// save button
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 9,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 9,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		sleep();
		po.getHeadlogo().click();
		sleep();
		if (driver.findElement(By.xpath("//span[text()='DemoModel']")) != null) 
		{
			System.out.println("TC02 - Assigned Repository is properly assigned in user account");
			XLdata.pass(path, sheet2, 2, 3);
		} 
		else 
		{
			System.out.println("TC02 - Assigned Repository is NOT properly assigned in user account");
			XLdata.fail(path, sheet2, 2, 3);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 2));//password field
//		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
//		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 11, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();
		driver.findElement(By.xpath("//label[text()='DemoModel']")).click();
		po.getSavebutton().click();// save button
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 11,2));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 11,2));
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		sleep();
		po.getHeadlogo().click();
		sleep();
		if (driver.findElement(By.xpath("//span[text()='DemoModel']")) != null) 
		{
			System.out.println("TC02 - Assigned Repository is properly assigned in user account");
			XLdata.pass(path, sheet2, 2, 4);
		} 
		else 
		{
			System.out.println("TC02 - Assigned Repository is NOT properly assigned in user account");
			XLdata.fail(path, sheet2, 2, 4);
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
		String u1 = XLdata.getStringCellData(path, sheet1, 9, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		String u2 = XLdata.getStringCellData(path, sheet1, 10, 1);
		driver.findElement(By.xpath("//span[text()='"+u2+"']/preceding::div[2]")).click();
		String u3 = XLdata.getStringCellData(path, sheet1, 11, 1);
		driver.findElement(By.xpath("//span[text()='"+u3+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
}
