package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Common_class;

public class User_profile {

	WebDriver driver = null;

	@FindBy (xpath = "//input[@ng-reflect-name='first_name']")
	public WebElement FirstName;
	@FindBy (xpath = "//input[@ng-reflect-name='last_name']")
	public WebElement LastName;
	@FindBy (xpath = "//input[@ng-reflect-name='middle_name']")
	public WebElement MiddleName;
	@FindBy (xpath = "//input[@placeholder='Phone']")
	public WebElement Phone;
	@FindBy (xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile;
	@FindBy (xpath = "//textarea[@ng-reflect-placeholder='Address']")
	public WebElement Address;
	@FindBy (xpath = "//div[@class='trumbowyg-editor']//following-sibling::textarea")
	public WebElement Emailsignature;
	@FindBy (xpath = "//div[@class='mat-checkbox-inner-container']")
	public WebElement Checkboxpass;
	@FindBy (xpath = "//input[@ng-reflect-name='password']")
	public WebElement password;
	@FindBy (xpath = "//input[@ng-reflect-name='confirm_password']")
	public WebElement Change_password;
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement Save;
	@FindBy (xpath="//button[@class='mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon user_account']")
	public WebElement Userprofile;
	@FindBy (xpath = "//a[@class='dropmenu-menu mdl-js-button mdl-js-ripple-effect ng-star-inserted']//child::i[text()='exit_to_app']")
	public WebElement Signout;



	public  User_profile(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);

	}

	public void ES016() throws InterruptedException
	{


		Thread.sleep(8000);
		FirstName.click();
		Thread.sleep(4000);
		FirstName.clear();
		FirstName.sendKeys("Hamza");                     //change firstname  - positve

	}


	public void ES017() throws InterruptedException
	{
		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		LastName.click();
		LastName.clear();
		Thread.sleep(8000);
		LastName.sendKeys("Aslam");                           //change lastname  - positve

	}
	public void ES018() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		Phone.click();
		Phone.clear();
		Thread.sleep(5000);
		Phone.sendKeys("6789302134");                           //change Phone  - positve

	}
	public void ES019() throws InterruptedException
	{
		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		Address.click();
		Address.clear();
		Thread.sleep(5000);
		Address.sendKeys("10-E, block A");
		Save.click();                                                      //change address  - positve

	}

	public void ES020() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(10);
		WebElement Action = Checkboxpass;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Action);
		password.sendKeys("Mm.12345");
		Thread.sleep(5000);
		Change_password.sendKeys("Mm.12345");
		Thread.sleep(5000);                                                //change password - positve
		Save.click();

	}

	public void ES021() throws InterruptedException
	{
		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		WebElement Action = Checkboxpass;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Action);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		common.Implicit_wait(20);
		WebElement Action1 = Emailsignature;
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", Action1);
		Actions action = new Actions(driver);
		action.sendKeys(Emailsignature, "Hello please help");
		//Emailsignature.clear();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
	    //jse.executeScript("arguments[0].value ='Hello poor()'", Emailsignature);
		WebElement Action2 = Save;
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", Action2);        //change email signature - positve

	}


	public void ES022() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		FirstName.clear();
		Thread.sleep(4000);                                        //Edit profile without first name - negative
		Save.click();
		Thread.sleep(4000);
	}


	public void ES023() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		LastName.clear();
		Thread.sleep(4000);                                  //Edit profile without last name - negative
		Save.click();
		Thread.sleep(4000);
	}


	public void ES024() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		MiddleName.clear();
		Thread.sleep(4000);                                      //Edit profile without middle name - positve
		Save.click();
	}

	public void ES025() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		Phone.clear();
		Thread.sleep(4000);                                          //Edit profile without phone  - positve
		Save.click();
	}

	public void ES026() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		Mobile.clear();
		Thread.sleep(4000);                                            //Edit profile without Mobile  - positve
		Save.click();
	}

	public void ES027() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(23);
		WebElement Action1 = Emailsignature;
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", Action1);
		common.Implicit_wait(7);
		Emailsignature.clear();
		Thread.sleep(8000);                                         //Edit profile without EmailSignature  - positve
		WebElement Action2 = Save;
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", Action2);
	}

	public void ES028() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(10);
		Address.clear();
		Thread.sleep(8000);                                          //Edit profile without Address  - positve
		Save.click();
	}

	public void ES029() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		WebElement Action = Checkboxpass;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Action);
		password.sendKeys("Mm.1234");
		Thread.sleep(8000);
		Save.click();
		common.Implicit_wait(4);
		password.clear();                             //change password without 8 characters - negative
	}

	public void ES030() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("mm.12345");
		Thread.sleep(8000);
		Save.click();                                              //change password without capital case - negative
		common.Implicit_wait(4);
		password.clear();
	}
	public void ES031() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("MM.12345");
		Thread.sleep(8000);
		Save.click();                                              //change password without small case - negative
		common.Implicit_wait(4);
		password.clear();
	}

	public void ES032() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("mm.ahnoor");
		Thread.sleep(8000);
		Save.click();                                              //change password without numeric values - negative
		common.Implicit_wait(4);
		password.clear();
	}

	public void ES033() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("Mm123456");
		Thread.sleep(4000);
		password.clear();
		Thread.sleep(8000);
		Save.click();                                              //change password without special character - negative
		common.Implicit_wait(4);
		password.clear();
	}

	public void ES034() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("Mm.12345!@#$%^&r");
		Thread.sleep(8000);
		Save.click();                                           //change password more than 15 character - negative
		common.Implicit_wait(4);
		password.clear();
	}

	public void ES035() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("Mm.12345!@#$%^&r");
		Change_password.sendKeys("Mm.12345");
		Thread.sleep(8000);
		Save.click();                                         //change password with different confirm password - negative
		common.Implicit_wait(7);
		password.clear();
		Change_password.clear();
	}

	public void ES036() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(7);
		password.sendKeys("Mm.12345");
		Change_password.sendKeys("Mm.12345");
		Thread.sleep(8000);
		Save.click();                                         //change password without different confirm password - negative
	}

	public void ES037() throws InterruptedException
	{

		Common_class common = new Common_class(driver);
		common.Implicit_wait(13);
		WebElement Action1 = Userprofile;
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", Action1);
		WebElement Action2 = Signout;
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", Action2);        //sign out  - positive

	}


}
