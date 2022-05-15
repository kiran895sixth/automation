package org.test.pro.get_portal_user_detail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import basepackage.PojoClass;
import basepackage.XLdata;

//Project prepared by  : Kirankumar
//project purpose : Click on View Details and check if the user details are displaying properly.

public class TC02_to_07_verify_user_details extends BaseClass {
	public static String path = "D:\\selenium\\work_place\\User_Management_Portal.xlsx";
	public static String sheet1 = "Login";
	public static String sheet2 = "Get_Portal_User_Detail";
	
	@Test(enabled=false)
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
		po.getEmailfield().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 1));// emailfield
		po.getFirstname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 4));//firstname field
		po.getLastname().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 5));// last name field
		po.getPassword().sendKeys(XLdata.getStringCellData(path, sheet1, 2, 2));//password field
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		String text = firstname.getAttribute("value");
		System.out.println(text);
		if (text.equals(XLdata.getStringCellData(path, sheet1, 2, 4))) 
		{
			System.out.println("TC02 - user first name is display properly");
			XLdata.pass(path, sheet2, 2, 2);
		} 
		else 
		{
			System.out.println(" user first name is not display properly");
			XLdata.fail(path, sheet2, 2, 2);
		}
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		String text1 = lastname.getAttribute("value");
		System.out.println(text1);
		if (text1.equals(XLdata.getStringCellData(path, sheet1, 2, 5))) 
		{
			System.out.println("TC03 - user last name is display properly");
			XLdata.pass(path, sheet2, 3, 2);
		} 
		else 
		{
			System.out.println(" user last name is not display properly");
			XLdata.fail(path, sheet2, 3, 2);
		}
		WebElement emailfield = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		String text2 = emailfield.getAttribute("value");
		System.out.println(text2);
		if (text2.equals(u)) 
		{
			System.out.println("TC04 - user emailid is display properly");
			XLdata.pass(path, sheet2, 4, 2);
		} 
		else 
		{
			System.out.println(" user emailid is not display properly");
			XLdata.fail(path, sheet2, 4, 2);
		}
		WebElement timezone = driver.findElement(By.xpath("//label[text()='Time Zone']/following::input[1]"));
		String text3 = timezone.getAttribute("value");
		System.out.println(text3);
		if (text3.equals("UTC")) 
		{
			System.out.println("TC05 - user timezone is display properly");
			XLdata.pass(path, sheet2, 5, 2);
		} 
		else 
		{
			System.out.println(" user timezone is not display properly");
			XLdata.fail(path, sheet2, 5, 2);
		}
		WebElement status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]"));
		String text4 = status.getText();
		System.out.println(text4);
		if (text4.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 2, 6))) 
		{
			System.out.println("TC06 - user status is display properly");
			XLdata.pass(path, sheet2, 6, 2);
		} 
		else 
		{
			System.out.println(" user status is not display properly");
			XLdata.fail(path, sheet2, 6, 2);
		}
		WebElement admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]"));
		String text5 = admin.getText();
		System.out.println(text5);
		if (text5.equals("No")) 
		{
			System.out.println("TC07 - Non admin user is display properly 'admin NO'");
			XLdata.pass(path, sheet2, 7, 2);
		} 
		else 
		{
			System.out.println("  Non admin user is not display properly 'admin NO'");
			XLdata.fail(path, sheet2, 7, 2);
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
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		String text = firstname.getAttribute("value");
		System.out.println(text);
		if (text.equals(XLdata.getStringCellData(path, sheet1, 2, 4))) 
		{
			System.out.println("TC02 - user first name is display properly");
			XLdata.pass(path, sheet2, 2, 3);
		} 
		else 
		{
			System.out.println(" user first name is not display properly");
			XLdata.fail(path, sheet2, 2, 3);
		}
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		String text1 = lastname.getAttribute("value");
		System.out.println(text1);
		if (text1.equals(XLdata.getStringCellData(path, sheet1, 2, 5))) 
		{
			System.out.println("TC03 - user last name is display properly");
			XLdata.pass(path, sheet2, 3, 3);
		} 
		else 
		{
			System.out.println(" user last name is not display properly");
			XLdata.fail(path, sheet2, 3, 3);
		}
		WebElement emailfield = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		String text2 = emailfield.getAttribute("value");
		System.out.println(text2);
		if (text2.equals(u)) 
		{
			System.out.println("TC04 - user emailid is display properly");
			XLdata.pass(path, sheet2, 4, 3);
		} 
		else 
		{
			System.out.println(" user emailid is not display properly");
			XLdata.fail(path, sheet2, 4, 3);
		}
		WebElement timezone = driver.findElement(By.xpath("//label[text()='Time Zone']/following::input[1]"));
		String text3 = timezone.getAttribute("value");
		System.out.println(text3);
		if (text3.equals("UTC")) 
		{
			System.out.println("TC05 - user timezone is display properly");
			XLdata.pass(path, sheet2, 5, 3);
		} 
		else 
		{
			System.out.println(" user timezone is not display properly");
			XLdata.fail(path, sheet2, 5, 3);
		}
		WebElement status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]"));
		String text4 = status.getText();
		System.out.println(text4);
		if (text4.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 2, 6))) 
		{
			System.out.println("TC06 - user status is display properly");
			XLdata.pass(path, sheet2, 6, 3);
		} 
		else 
		{
			System.out.println(" user status is not display properly");
			XLdata.fail(path, sheet2, 6, 3);
		}
		WebElement admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]"));
		String text5 = admin.getText();
		System.out.println(text5);
		if (text5.equals("No")) 
		{
			System.out.println("TC07 - Non admin user is display properly 'admin NO'");
			XLdata.pass(path, sheet2, 7, 3);
		} 
		else 
		{
			System.out.println("  Non admin user is not display properly 'admin NO'");
			XLdata.fail(path, sheet2, 7, 3);
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
	
	@Test(enabled=false)
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
		po.getSavebutton().click();// save button
		sleep();
		String u = XLdata.getStringCellData(path, sheet1, 2, 1);
		driver.findElement(By.xpath("//span[text()='"+u+"']/preceding::span[2]")).click();// click username
		sleep();
		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']/following::input[1]"));
		String text = firstname.getAttribute("value");
		System.out.println(text);
		if (text.equals(XLdata.getStringCellData(path, sheet1, 2, 4))) 
		{
			System.out.println("TC02 - user first name is display properly");
			XLdata.pass(path, sheet2, 2, 4);
		} 
		else 
		{
			System.out.println(" user first name is not display properly");
			XLdata.fail(path, sheet2, 2, 4);
		}
		WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name']/following::input[1]"));
		String text1 = lastname.getAttribute("value");
		System.out.println(text1);
		if (text1.equals(XLdata.getStringCellData(path, sheet1, 2, 5))) 
		{
			System.out.println("TC03 - user last name is display properly");
			XLdata.pass(path, sheet2, 3, 4);
		} 
		else 
		{
			System.out.println(" user last name is not display properly");
			XLdata.fail(path, sheet2, 3, 4);
		}
		WebElement emailfield = driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
		String text2 = emailfield.getAttribute("value");
		System.out.println(text2);
		if (text2.equals(u)) 
		{
			System.out.println("TC04 - user emailid is display properly");
			XLdata.pass(path, sheet2, 4, 4);
		} 
		else 
		{
			System.out.println(" user emailid is not display properly");
			XLdata.fail(path, sheet2, 4, 4);
		}
		WebElement timezone = driver.findElement(By.xpath("//label[text()='Time Zone']/following::input[1]"));
		String text3 = timezone.getAttribute("value");
		System.out.println(text3);
		if (text3.equals("UTC")) 
		{
			System.out.println("TC05 - user timezone is display properly");
			XLdata.pass(path, sheet2, 5, 4);
		} 
		else 
		{
			System.out.println(" user timezone is not display properly");
			XLdata.fail(path, sheet2, 5, 4);
		}
		WebElement status = driver.findElement(By.xpath("//label[text()='Status']/following::span[1]"));
		String text4 = status.getText();
		System.out.println(text4);
		if (text4.equalsIgnoreCase(XLdata.getStringCellData(path, sheet1, 2, 6))) 
		{
			System.out.println("TC06 - user status is display properly");
			XLdata.pass(path, sheet2, 6, 4);
		} 
		else 
		{
			System.out.println(" user status is not display properly");
			XLdata.fail(path, sheet2, 6, 4);
		}
		WebElement admin = driver.findElement(By.xpath("//label[text()='Make Super Admin']/following::span[1]"));
		String text5 = admin.getText();
		System.out.println(text5);
		if (text5.equals("No")) 
		{
			System.out.println("TC07 - Non admin user is display properly 'admin NO'");
			XLdata.pass(path, sheet2, 7, 4);
		} 
		else 
		{
			System.out.println("  Non admin user is not display properly 'admin NO'");
			XLdata.fail(path, sheet2, 7, 4);
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
