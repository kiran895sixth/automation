package basepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	public WebElement textEmail;
	
	@FindBy(id = "Password")
	private WebElement textpassword;
	
	@FindBy(xpath= "//button[@class='btn w-100 sign-in-sso-btn']")
	private WebElement signinbutton;
	
	@FindBy(xpath = "//a[@class='d-table-cell align-middle']")
	private WebElement headlogo;

	@FindBy(xpath="//div[@class='header-left-menu pt-1']")
	private WebElement menu;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath = "//div[text()=' User Groups ']")
	private WebElement usergroup;
	
	@FindBy(xpath = "//div[contains(text(),'Access Permissions')]")
	private WebElement accesspermission;
	
	@FindBy(xpath = "//div[text()=' Users ']")
	private WebElement users;
	
	@FindBy(xpath = "//button[@class='btn btn-theme ng-star-inserted']")
	private WebElement adduser;
	
	@FindBy(xpath = "//div[text()=' User and License Management ']")
	private WebElement usersmanagement;
	
	@FindBy(xpath = "//label[text()='Email *']/following::input[1]")
	private WebElement emailfield;
	
	@FindBy(xpath = "//label[text()='First Name *']/following::input[1]")
	private WebElement firstname;
	
	@FindBy(xpath = "//label[text()='Last Name *']/following::input[1]")
	private WebElement lastname;
	
	@FindBy(xpath = "//label[text()='Password *']/following::input[1]")
	private WebElement password;
	
	@FindBy(id = "userStatus")
	private WebElement statusbutton;
	
	@FindBy(id = "userIsAdmin")
	private WebElement adminbutton;
	
	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement deletebutton;
	
	@FindBy(xpath = "//span[text()='Delete Anyway']")
	private WebElement deleteanyway;
	

	

	public WebElement getStatusbutton() {
		return statusbutton;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getDeleteanyway() {
		return deleteanyway;
	}

	public WebElement getAdminbutton() {
		return adminbutton;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsersmanagement() {
		return usersmanagement;
	}

	public WebElement getAdduser() {
		return adduser;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getAccesspermission() {
		return accesspermission;
	}

	public WebElement getUsergroup() {
		return usergroup;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getTextEmail() {
		return textEmail;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public WebElement getHeadlogo() {
		return headlogo;
	}
	
}
