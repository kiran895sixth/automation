package org.test.pro.add_system_users;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;
//Project prepared by  : Kirankumar
//project purpose : Add System User by enable "Admin" option and check whether the user has admin privilege or not.
public class TC11_add_user_by_enable_admin_check_admin_privilege extends BaseClass {
public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
public static String sheet1 = "Login";
public static String sheet2 = "Add_System_User";
	
@Test
public void add_system_user() throws IOException, InterruptedException {

	chrome();// chrome browser
	System.out.println("TC11 - Check admin user privileges");
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 2));//password field
	po.getAdminbutton().click();// admin enable
	po.getSavebutton().click();// save button
	//		backward();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 13, 1);
	String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
	if (usertype.equals(XLdata.getStringCellData(path, sheet1, 13, 3))) 
	{
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 13, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 13,2));

		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 13,2));

		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		po.getMenu().click();
//		String[] elements = {" Access Control Profiles "," Active Directory Single Sign On "," Integrated Applications - Access Management "
//				""};
		int i = 17;
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='text-theme font-weight-bold']"));
		options.size();
		
		if (i == options.size()) 
		{
			for (WebElement element : options) 
			{
				String name = element.getText();
				System.out.println(name);
			}
			XLdata.pass(path, sheet2, 11, 2);
		} 
		else {
			XLdata.fail(path, sheet2, 11, 2);

		}
	}
}


@Test
public void add_system_user1() throws IOException, InterruptedException {
	firefox();// firefox browser
	System.out.println("TC11 - Check admin user privileges");
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 2));//password field
	po.getAdminbutton().click();// admin enable
	po.getSavebutton().click();// save button
	//		backward();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 14, 1);
	String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
	if (usertype.equals(XLdata.getStringCellData(path, sheet1, 14, 3))) 
	{
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 14, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 14,2));

		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 14,2));

		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		po.getMenu().click();
//		String[] elements = {" Access Control Profiles "," Active Directory Single Sign On "," Integrated Applications - Access Management "
//				""};
		int i = 17;
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='text-theme font-weight-bold']"));
		options.size();
		
		if (i == options.size()) 
		{
			for (WebElement element : options) 
			{
				String name = element.getText();
				System.out.println(name);
			}
			XLdata.pass(path, sheet2, 11, 3);
		} 
		else {
			XLdata.fail(path, sheet2, 11, 3);

		}
	}
 }


@Test
public void add_system_user2() throws IOException, InterruptedException {
	edge();// edge browser
	System.out.println("TC11 - Check admin user privileges");
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
	po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 1));// emailfield
	po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 4));//firstname field
	po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 5));// last name field
	po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 2));//password field
	po.getAdminbutton().click();// admin enable
	po.getSavebutton().click();// save button
	//		backward();
	sleep();
	String u = XLdata.getStringCellData(path, sheet1, 15, 1);
	String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
	if (usertype.equals(XLdata.getStringCellData(path, sheet1, 15, 3))) 
	{
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 15, 2));//user password
		po.getSigninbutton().click();
		sleep();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 15,2));

		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 15,2));

		driver.findElement(By.xpath("//button[@class='btn btn-sm text-xs']")).click();// save password button
		driver.findElement(By.xpath("//a[text()='Click here']")).click();//set password
		waits();
		po.getMenu().click();
//		String[] elements = {" Access Control Profiles "," Active Directory Single Sign On "," Integrated Applications - Access Management "
//				""};
		int i = 17;
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='text-theme font-weight-bold']"));
		options.size();
		
		if (i == options.size()) 
		{
			for (WebElement element : options) 
			{
				String name = element.getText();
				System.out.println(name);
			}
			XLdata.pass(path, sheet2, 11, 4);
		} 
		else {
			XLdata.fail(path, sheet2, 11, 4);

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
		String u1 = XLdata.getStringCellData(path, sheet1, 13, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		String u2 = XLdata.getStringCellData(path, sheet1, 14, 1);
		driver.findElement(By.xpath("//span[text()='"+u2+"']/preceding::div[2]")).click();
		String u3 = XLdata.getStringCellData(path, sheet1, 15, 1);
		driver.findElement(By.xpath("//span[text()='"+u3+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}
 }
}
