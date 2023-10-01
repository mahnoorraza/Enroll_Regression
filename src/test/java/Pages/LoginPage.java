package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Common_class;

public class LoginPage {


	WebDriver driver = null;

	@FindBy (xpath = "//a[@ng-reflect-router-link='login']")
	public WebElement login;
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	@FindBy (xpath="//button[@class='mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect']")
	public WebElement submit;
	@FindBy (xpath="//button[@ng-reflect-message='Admin Menu']")
	public WebElement useraction;		
	@FindBy (xpath="//span[text()='User Management']")
	public WebElement userclick;
	@FindBy (xpath="//a[@href='/forgot-password']")
	public WebElement forgotpassword;
	@FindBy (xpath="//input[@ng-reflect-name='email']")
	public WebElement sendEmail;
	@FindBy (xpath="//button[text()=' Send Email ']")
	public WebElement Sendbutton;
	@FindBy (xpath="//input[@ng-reflect-name='password']")
	public WebElement updatePassword;
	@FindBy (xpath="//input[@ng-reflect-name='confirm_password']")
	public WebElement Confirmpassword;
	@FindBy (xpath="//button[text()=' Update Password ']")
	public WebElement Update;
	@FindBy (xpath="//button[@class='mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon user_account']")
	public WebElement Userprofile;
	@FindBy (xpath="//div[@class='pastloginuserholder']//following-sibling::a[@href='/my-profile']")
	public WebElement MyProfile;



	//public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	//}

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
		login.click();
	}

	public void ES01() throws InterruptedException

	{
		Thread.sleep(8000);                       //Blank email - negative
		username.sendKeys(" ");
		password.sendKeys("Mm.12345"); 	
		submit.click();
		Thread.sleep(7000);
		username.clear();
		password.clear();
		Thread.sleep(4000);

	}

	public void ES02() throws InterruptedException


	{

		username.sendKeys("mahnoor.moosa@technologyally.com");
		password.sendKeys(" ");                              //Blank password - negative
		username.clear();
		password.clear();
		submit.click();
		Thread.sleep(4000);
		username.clear();
		password.clear();
		Thread.sleep(4000);

	}

	public void ES03() throws InterruptedException


	{

		username.sendKeys(" ");          //Both fields blank - negative
		password.sendKeys(" "); 	
		submit.click(); 
		Thread.sleep(4000);
		username.clear();
		password.clear();
		Thread.sleep(4000);
	}

	public void ES04() throws InterruptedException


	{

		username.sendKeys("mahnoor.moosa@");          //incorrect email format  - negative
		password.sendKeys("Mm.12345"); 	
		submit.click();	
		Thread.sleep(4000);
		username.clear();
		password.clear();
		Thread.sleep(4000);
		
	}
	public void ES05() throws InterruptedException


	{

		username.sendKeys("mahnoor.raza@technologyally.com");           //invalid email  - negative
		password.sendKeys("Mm.12345"); 	
		submit.click(); 	
		Thread.sleep(4000);
		username.clear();
		password.clear();
		Thread.sleep(4000);
	}
	public void ES06() throws InterruptedException


	{

		username.sendKeys("mahnoor.moosa@technologyally.com");            //wrong password  - negative
		password.sendKeys("Mm.123456"); 	
		submit.click();	
		Thread.sleep(7000);

	}

	public void ES07()
	{
		forgotpassword.click();
		sendEmail.sendKeys("mahnoor.moosa@technologyally.com");
		Sendbutton.click();
		driver.get("https://testquote.enroll-source.com/reset/jnUYr2WYBewzvP8bKTFavEyoluVucjSz");
	}

	public void ES08() throws InterruptedException
	{
		updatePassword.sendKeys("mm.12345");
		Confirmpassword.sendKeys("mm.12345");           //wihtout capital case - positive
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}

	public void ES09() throws InterruptedException
	{
		updatePassword.sendKeys("MM.12345");
		Confirmpassword.sendKeys("MM.12345");        //without smallcase  - negative
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}

	public void ES10() throws InterruptedException
	{
		updatePassword.sendKeys("MMahnoor");
		Confirmpassword.sendKeys("MMahnoor");      //without number  - negative
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}
	public void ES11() throws InterruptedException
	{
		updatePassword.sendKeys("MMahnoor");            //without specialcharacter   - negative
		Confirmpassword.sendKeys("MMahnoor");
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}

	public void ES12() throws InterruptedException
	{  
		updatePassword.sendKeys("MMahnoor");            //without specialcharacter  - negative
		Confirmpassword.sendKeys("MMahnoor");
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}

	public void ES13() throws InterruptedException
	{	
		updatePassword.sendKeys("");
		Thread.sleep(4000);
		Confirmpassword.sendKeys("Mm.123456");           //without password  - negative
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}

	public void ES14() throws InterruptedException
	{	                                               
		updatePassword.sendKeys("Mm.12345");   
		Confirmpassword.sendKeys("");                 //without confirmpassword  - negative
		Update.click();
		Thread.sleep(8000);
		updatePassword.clear();
		Confirmpassword.clear();

	}
	public void ES15() throws InterruptedException
	{	                                               
		updatePassword.sendKeys("Mm.12345"); 
		Confirmpassword.sendKeys("Mm.123456");           //without different confirmpassword - negative
		Update.click(); 
		Thread.sleep(10000);
		login.click();

	}



	public void Login_credentials(String usernameone, String passwordone) throws InterruptedException {


		Common_class common = new Common_class(driver);
		common.Implicit_wait(15);
		login.click();

		username.sendKeys(usernameone);
		password.sendKeys(passwordone);
		submit.click();
		//common.Implicit_wait(20);
		common.Implicit_wait(20);;
		Userprofile.click();
		WebElement Action = MyProfile;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Action); 
			
		
	}
}


