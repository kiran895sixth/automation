package org.test.pro.add_system_users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;
//Project prepared by  : Kirankumar
//project purpose : Add System User by assigning the particular Group and check whether the Group  is assigned properly  to the user or not.
public class TC08_addsystemuser_assigngroup_and_check extends BaseClass {
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
		sleep();
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
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		waits();
		po.getHeadlogo().click();
		driver.findElement(By.xpath("//span[text()='DemoModel-Copy']")).click();
		sleep();
		po.getMenu().click();
		po.getUsers().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 9, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();//edit button
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();//
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
		po.getSavebutton().click();
		waits();
		po.getMenu().click();
		po.getUsergroup().click();
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
//		String f = XLdata.getStringCellData(path, sheet1, 9, 4);
		String l = XLdata.getStringCellData(path, sheet1, 9, 5);
		sleep();
		String checkbox = driver.findElement(By.xpath("//span[contains(text(),'"+l+"')]/following::button[1]")).getAttribute("class");
		if (checkbox.equals("btn btn-clear text-success")) 
		{
			System.out.println("TC08 - assigned group is properly assigned to the user");
			XLdata.pass(path, sheet2, 8, 2);
		} 
		else 
		{
			System.out.println("TC08 - assigned group is NOT properly assigned to the user");
			XLdata.fail(path, sheet2, 8, 2);
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
		sleep();
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
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		waits();
		po.getHeadlogo().click();
		driver.findElement(By.xpath("//span[text()='DemoModel-Copy']")).click();
		sleep();
		po.getMenu().click();
		po.getUsers().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 10, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();//edit button
		sleep();
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();//
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
		po.getSavebutton().click();
		sleep();
		po.getMenu().click();
		po.getUsergroup().click();
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
//		String f = XLdata.getStringCellData(path, sheet1, 9, 4);
		String l = XLdata.getStringCellData(path, sheet1, 10, 5);
		sleep();
		String checkbox = driver.findElement(By.xpath("//span[contains(text(),'"+l+"')]/following::button[1]")).getAttribute("class");
		if (checkbox.equals("btn btn-clear text-success")) 
		{
			System.out.println("TC08 - assigned group is properly assigned to the user");
			XLdata.pass(path, sheet2, 8, 3);
		} 
		else 
		{
			System.out.println("TC08 - assigned group is NOT properly assigned to the user");
			XLdata.fail(path, sheet2, 8, 3);
		}
		sleep();
			
	}
	
	@Test
	public void add_system_user2() throws IOException, InterruptedException {
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 11, 2));//password field
		driver.findElement(By.xpath("//label[text()='Repository Membership']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='demoprofile']")).click();//select repositry membership
		po.getSavebutton().click();// save button
		waits();
		po.getHeadlogo().click();
		driver.findElement(By.xpath("//span[text()='DemoModel-Copy']")).click();
		sleep();
		po.getMenu().click();
		po.getUsers().click();
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 11, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/following::a[1]")).click();//edit button
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();//
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
		po.getSavebutton().click();
		waits();
		po.getMenu().click();
		po.getUsergroup().click();
		driver.findElement(By.xpath("//span[contains(text(),'Administrators')]")).click();
//		String f = XLdata.getStringCellData(path, sheet1, 11, 4);
		String l = XLdata.getStringCellData(path, sheet1, 11, 5);
		sleep();
		String checkbox = driver.findElement(By.xpath("//span[contains(text(),'"+l+"')]/following::button[1]")).getAttribute("class");
		if (checkbox.equals("btn btn-clear text-success")) 
		{
			System.out.println("TC08 - assigned group is properly assigned to the user");
			XLdata.pass(path, sheet2, 8, 4);
		} 
		else 
		{
			System.out.println("TC08 - assigned group is NOT properly assigned to the user");
			XLdata.fail(path, sheet2, 8, 4);
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
