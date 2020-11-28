package core.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.konfer.util.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='I Accept']")
	WebElement policy;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//input[@name='username']")
	 WebElement username;
     
	@FindBy(xpath="//input[@placeholder='Password']")
	 WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	 WebElement SignInbtn;


	public void Login(String uname, String pword) throws InterruptedException {
	    Thread.sleep(10000);

	policy.click();
    signin.click();
    
    username.clear();
    username.sendKeys(uname);
    
    Password.clear();
    Password.sendKeys(pword);
    
    SignInbtn.click();
	}





}
