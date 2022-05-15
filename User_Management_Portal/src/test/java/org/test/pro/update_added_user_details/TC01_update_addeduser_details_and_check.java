package org.test.pro.update_added_user_details;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

public class TC01_update_addeduser_details_and_check extends BaseClass {
	public static String path = "D:\\\\selenium\\\\work_place\\\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Update_Added_User_Details";
	
	@Test
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
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]")).click();//edit button
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		firstname.clear();
		firstname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 4));
		sleep();
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		lastname.clear();
		lastname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 5));
		sleep();
		WebElement email = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		email.clear();
		email.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		
		driver.findElement(By.id("userStatus")).click();//user status change to inactive
		
		driver.findElement(By.id("userIsAdmin")).click();// user role change to admin
		
		po.getSavebutton().click();	
		sleep();
		boolean usermail = driver.getPageSource().contains(XLdata.getStringCellData(path, sheet1, 7, 1));
		if (usermail== true) 
		{
			String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
			String usertype = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::span[2]")).getText();
			String username = driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::span[2]")).getText();
			String userstatus = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::label[1]")).getText();
			if (usertype.equals(XLdata.getStringCellData(path, sheet1, 7, 3))&&(username.contains(XLdata.getStringCellData(path, sheet1, 7, 4)))
					&&(userstatus.equalsIgnoreCase("inactive"))) 
			{
				System.out.println("TC01 - updated user details properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 1, 2);
				sleep();
				
			} 
			else 
			{
				System.out.println("TC01 - updated user details NOT properly visibel in usermanagement user list");
				XLdata.fail(path, sheet2, 1, 2);
			}
		} 
		else 
		{
			System.out.println("User details not update properly");
			
		}
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
	}
	
	
	@Test
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
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]")).click();//edit button
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		firstname.clear();
		firstname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 4));
		sleep();
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		lastname.clear();
		lastname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 5));
		sleep();
		WebElement email = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		email.clear();
		email.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		
		driver.findElement(By.id("userStatus")).click();//user status change to inactive
		
		driver.findElement(By.id("userIsAdmin")).click();// user role change to admin
		
		po.getSavebutton().click();	
		sleep();
		boolean usermail = driver.getPageSource().contains(XLdata.getStringCellData(path, sheet1, 7, 1));
		if (usermail== true) 
		{
			String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
			String usertype = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::span[2]")).getText();
			String username = driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::span[2]")).getText();
			String userstatus = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::label[1]")).getText();
			if (usertype.equals(XLdata.getStringCellData(path, sheet1, 7, 3))&&(username.contains(XLdata.getStringCellData(path, sheet1, 7, 4)))
					&&(userstatus.equalsIgnoreCase("inactive"))) 
			{
				System.out.println("TC01 - updated user details properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 1, 3);
				sleep();
				
			} 
			else 
			{
				System.out.println("TC01 - updated user details NOT properly visibel in usermanagement user list");
				XLdata.fail(path, sheet2, 1, 3);
			}
		} 
		else 
		{
			System.out.println("User details not update properly");

		}
		String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
		
		
		
	}

	
	
	@Test
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
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::span[7]")).click();//edit button
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		firstname.clear();
		firstname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 4));
		sleep();
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		lastname.clear();
		lastname.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 5));
		sleep();
		WebElement email = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		email.clear();
		email.sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		
		driver.findElement(By.id("userStatus")).click();//user status change to inactive
		
		driver.findElement(By.id("userIsAdmin")).click();// user role change to admin
		
		po.getSavebutton().click();	
		sleep();
		boolean usermail = driver.getPageSource().contains(XLdata.getStringCellData(path, sheet1, 7, 1));
		if (usermail== true) 
		{
			String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
			String usertype = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::span[2]")).getText();
			String username = driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::span[2]")).getText();
			String userstatus = driver.findElement(By.xpath("//span[text()='"+u1+"']/following::label[1]")).getText();
			if (usertype.equals(XLdata.getStringCellData(path, sheet1, 7, 3))&&(username.contains(XLdata.getStringCellData(path, sheet1, 7, 4)))
					&&(userstatus.equalsIgnoreCase("inactive"))) 
			{
				System.out.println("TC01 - updated user details properly visibel in usermanagement user list");
				XLdata.pass(path, sheet2, 1, 4);
				sleep();
			} 
			else 
			{
				System.out.println("TC01 - updated user details NOT properly visibel in usermanagement user list");
				XLdata.fail(path, sheet2, 1, 4);
			}
		} 
		else 
		{
			System.out.println("User details not update properly");
			
		}
//		String u1 = XLdata.getStringCellData(path, sheet1, 7, 1);
//		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
//		sleep();
//		po.getDeletebutton().click();
//		sleep();
//		po.getDeleteanyway().click();
//		sleep();
	}


}
