package org.test.pro.update_added_user_details;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

public class TC07_update_role_check_userlist extends BaseClass {
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Update_Added_User_Details";
	
	@Test(enabled = true)
	public void update_user_details() throws IOException, InterruptedException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 6, 1);
		WebElement user = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]"));//edit button
		user.click();
		sleep();
		WebElement admin = driver.findElement(By.id("userIsAdmin")); //status button
		admin.click();//  change to  admin
		po.getSavebutton().click();	
		sleep();
		String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
		System.out.println(usertype);
		if (usertype.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 8, 3))) 
		{
				
				System.out.println("TC07 - updated user Role properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 7, 2);
		} 
		else 
		{
			System.out.println("TC07 - updated user Role NOT properly visibel in usermanagement user list");
			XLdata.fail(path, sheet2, 7, 2);
		}
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 6, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
		
	}

	@Test(enabled = true)
	public void update_user_details1() throws IOException, InterruptedException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 6, 1);
		WebElement user = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]"));//edit button
		user.click();
		sleep();
		WebElement admin = driver.findElement(By.id("userIsAdmin")); //status button
		admin.click();//  admin change to admin
		po.getSavebutton().click();	
		sleep();
		String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
		System.out.println(usertype);
		if (usertype.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 8, 3))) 
		{
				
				System.out.println("TC07 - updated user Role properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 7, 3);
		} 
		else 
		{
			System.out.println("TC07 - updated user Role NOT properly visibel in usermanagement user list");
			XLdata.fail(path, sheet2, 7, 3);
		}
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 6, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
		
	}
	
	@Test(enabled = true)
	public void update_user_details2() throws IOException, InterruptedException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 5));
		po.getSavebutton().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 6, 1);
		WebElement user = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]"));//edit button
		user.click();
		sleep();
		WebElement admin = driver.findElement(By.id("userIsAdmin")); //status button
		admin.click();// change to non admin
		po.getSavebutton().click();	
		sleep();
		String usertype = driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[2]")).getText();
		System.out.println(usertype);
		if (usertype.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 8, 3))) 
		{
				
				System.out.println("TC07 - updated user Role properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 7, 4);
		} 
		else 
		{
			System.out.println("TC07 - updated user Role NOT properly visibel in usermanagement user list");
			XLdata.fail(path, sheet2, 7, 4);
		}
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 6, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
		
	}
}
