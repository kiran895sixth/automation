package org.test.pro.update_added_user_details;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

public class TC08_set_temporarypassword_and_check extends BaseClass {
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
		String usermail = XLdata.getStringCellData(path, sheet1, 6, 1);
		WebElement more = driver.findElement(By.xpath("//span[text()='"+usermail+"']/following::span[8]"));//edit button
		more.click();
		sleep();
		driver.findElement(By.xpath("//span[text()='Set Temporary Password']")).click();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 6,8));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 6,8));
		driver.findElement(By.xpath("//span[text()='Set']")).click();
//		po.getSavebutton().click();	
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 8));
		po.getSigninbutton().click();
		sleep();		
		if (driver.findElement(By.xpath("//a[@class='d-inline-block h-100 align-middle p-2']")) != null) 
		{
				
				System.out.println("TC08 - user Password properly updated ");
				XLdata.pass(path, sheet2, 8, 2);
		} 
		else 
		{
			System.out.println("TC08 -  user Password NOT properly updated");
			XLdata.fail(path, sheet2, 8, 2);
		}
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 7, 5));
		po.getSavebutton().click();
		sleep();
		String usermail = XLdata.getStringCellData(path, sheet1, 7, 1);
		WebElement more = driver.findElement(By.xpath("//span[text()='"+usermail+"']/following::span[8]"));//edit button
		more.click();
		sleep();
		driver.findElement(By.xpath("//span[text()='Set Temporary Password']")).click();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 7,8));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 7,8));
		driver.findElement(By.xpath("//span[text()='Set']")).click();
//		po.getSavebutton().click();	
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 6, 8));
		po.getSigninbutton().click();
		sleep();		
		if (driver.findElement(By.xpath("//a[@class='d-inline-block h-100 align-middle p-2']")) != null) 
		{
				
				System.out.println("TC08 - user Password properly updated ");
				XLdata.pass(path, sheet2, 8, 3);
		} 
		else 
		{
			System.out.println("TC08 -  user Password NOT properly updated");
			XLdata.fail(path, sheet2, 8, 3);
		}
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 1));
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 2));
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 4));
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 5));
		po.getSavebutton().click();
		sleep();
		String usermail = XLdata.getStringCellData(path, sheet1, 8, 1);
		WebElement more = driver.findElement(By.xpath("//span[text()='"+usermail+"']/following::span[8]"));//edit button
		more.click();
		sleep();
		driver.findElement(By.xpath("//span[text()='Set Temporary Password']")).click();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password *']/following::input[1]"));
		password.sendKeys(XLdata.getStringCellData(path, sheet1, 8,8));
		
		WebElement Cpassword = driver.findElement(By.xpath("//label[text()='Password *']/following::input[2]"));
		Cpassword.sendKeys(XLdata.getStringCellData(path, sheet1, 8,8));
		driver.findElement(By.xpath("//span[text()='Set']")).click();
//		po.getSavebutton().click();	
		sleep();
		signout();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 1));
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 8, 8));
		po.getSigninbutton().click();
		sleep();		
		if (driver.findElement(By.xpath("//a[@class='d-inline-block h-100 align-middle p-2']")) != null) 
		{
				
				System.out.println("TC08 - user Password properly updated ");
				XLdata.pass(path, sheet2, 8, 4);
		} 
		else 
		{
			System.out.println("TC08 -  user Password NOT properly updated");
			XLdata.fail(path, sheet2, 8, 4);
		}
		sleep();
//		signout();
		backward();
		sleep();
		po.getTextEmail().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 1));//user mail
		po.getTextpassword().sendKeys(XLdata.getStringCellData(path, sheet1, 1, 2));//user password
		po.getSigninbutton().click();
		sleep();
		po.getMenu().click();// menu
		sleep();
		po.getUsersmanagement().click();// user management
		sleep();
		String u1 = XLdata.getStringCellData(path, sheet1, 6, 1);
		driver.findElement(By.xpath("//span[text()='"+u1+"']/preceding::div[2]")).click();
		String u2 = XLdata.getStringCellData(path, sheet1, 7, 1);
		driver.findElement(By.xpath("//span[text()='"+u2+"']/preceding::div[2]")).click();
		String u3 = XLdata.getStringCellData(path, sheet1, 8, 1);
		driver.findElement(By.xpath("//span[text()='"+u3+"']/preceding::div[2]")).click();
		sleep();
		po.getDeletebutton().click();
		sleep();
		po.getDeleteanyway().click();
		sleep();
	}
}
