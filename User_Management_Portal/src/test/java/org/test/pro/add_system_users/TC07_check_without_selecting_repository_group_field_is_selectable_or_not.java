package org.test.pro.add_system_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;
//Project prepared by  : Kirankumar
//project purpose : Check by without  select any repository from "Add to repository field" and check whether the "Default Dashboard" and "Default Group" fields and "Required EA authentication" button get selectable or not
public class TC07_check_without_selecting_repository_group_field_is_selectable_or_not extends BaseClass{
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 9, 2));//password field
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();
		boolean field = driver.findElement(By.xpath("(//ng-select[@class='ng-select ng-select-multiple ng-untouched ng-pristine ng-select-disabled'])[1]")).isEnabled();
		if (field==true) 
		{
			System.out.println("TC07 - without selecting repository user not able to select group ");
			XLdata.pass(path, sheet2, 7, 2);
		
		} 
		else 
		{
			System.out.println(" Without selecting repository user  able to select group");
			XLdata.fail(path, sheet2, 7, 2);
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 10, 2));//password field
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 10, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();
		boolean field = driver.findElement(By.xpath("(//ng-select[@class='ng-select ng-select-multiple ng-untouched ng-pristine ng-select-disabled'])[1]")).isEnabled();
		if (field==true) 
		{
			System.out.println("TC07 - without selecting repository user not able to select group ");
			XLdata.pass(path, sheet2, 7, 3);
		
		} 
		else 
		{
			System.out.println(" Without selecting repository user  able to select group");
			XLdata.fail(path, sheet2, 7, 3);
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
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 11, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();
		sleep();

		boolean field = driver.findElement(By.xpath("(//ng-select[@class='ng-select ng-select-multiple ng-untouched ng-pristine ng-select-disabled'])[1]")).isEnabled();
		System.out.println(field);
		if (field==true) 
		{
			System.out.println("TC07 - without selecting repository user not able to select group ");
			XLdata.pass(path, sheet2, 7, 4);
		
		} 
		else 
		{
			System.out.println(" Without selecting repository user  able to select group");
			XLdata.fail(path, sheet2, 7, 4);
		}
		sleep();
		backward();
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
