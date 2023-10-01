package Test;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.LoginPage;
import Pages.User_profile;

public class Test_class {



	WebDriver driver;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite

   	public void setup()
	{
		//String project_path = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",project_path+"\\\\Drivers\\\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahnoor.moosa\\eclipse-workspace\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(htmlReporter);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://testquote.enroll-source.com/");
		driver.manage().window().maximize();


	}

	
	
	@Test(priority = 1)

	public void User_credentials() throws InterruptedException, IOException
	{
		//ExtentTest test = extent.createTest(null);

		//test.log(Status.INFO, "This step shows usage of log(status, details)");
		//test.info("This info is about Enrollsource project");
		//test.pass("Navigated to Enrollsource");
		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		//test.addScreenCaptureFromPath("screenshot.png");
		LoginPage lc = new LoginPage(driver);
		lc.ES01();
		lc.ES02();
		lc.ES03();
		lc.ES04();
		lc.ES05();
		lc.ES06();
		lc.ES07();
		lc.ES08();
		lc.ES09();
		lc.ES10();
		lc.ES11();
		lc.ES12();
		lc.ES13();
		lc.ES14();
		lc.ES15();

	}


	@Test(priority = 4)

	public void UserProfile() throws InterruptedException
	{
		User_profile up = new User_profile(driver);
		up.ES016();
		up.ES017();
		up.ES018();
		up.ES019();
		up.ES020();
		up.ES021();
		up.ES022();
		up.ES023();
		up.ES024();
		up.ES025();
		up.ES026();
		up.ES027();
		up.ES028();
		up.ES029();
		up.ES030();
		up.ES031();
		up.ES032();
		up.ES033();
		up.ES034();
		up.ES035();
		up.ES036();
		up.ES037();

	}


	@AfterSuite

	public void TearDown() {
		//extent.flush();
		driver.quit();

		//XL.generateReport("Excel-report.xlsx");
		//XL.generateReport()

	}



     @Test(dataProvider="LoginData", priority = 2)
	  public void Test_Login(String user, String pass) throws InterruptedException {

		  LoginPage lc = new LoginPage(driver);
		  lc.Login_credentials(user, pass);



	  }

	  @DataProvider(name="LoginData")
		 public Object[][] getData()
		 {
			return new Object[][] {
				{"mahnoor.moosa@technologyally.com","Mm.12345"}


	};

		 }
	  }













// Code for Handling the exceptionpublic void Test_Nokia_Mobile_filter_Working_fine()
//{
//	try {
//	Daraz_Home_Page daraz=new Daraz_Home_Page(driver);
//	Boolean b=false;
//	b=daraz.Nokia_Filter_Test();
//	System.out.print(b+"bool varibale.............");
//	assertTrue(b);
//	}
//	catch(NoSuchElementException e)
//	{
//	System.out.print(e.getMessage()+" This Element not find thats why it happens");
//	assertTrue(false);
//
//	}
//	catch(TimeoutException e)
//	{
//	System.out.print(e.getMessage()+" On this element its timeout...........................");
//	assertTrue(false);
//
//	}
//	catch(ElementNotInteractableException e)
//	{
//	System.out.print(e.getMessage()+" This element is not interactible...........................");
//	assertTrue(false);
//
//	}
//	catch(WebDriverException e)
//	{
//	System.out.print(e.getMessage()+"Problem is in WebDriver");
//	assertTrue(false);
//
//	}
//	}
//}




/*@DataProvider(name="dp")
	  public String[] readJson()
	  {
		  String Json_Path = "C:\\Users\\mahnoor.moosa\\eclipse-workspace\\DDTFramework\\jsonfiles\\User.json";
		  JSONParser jsonParser = new JSONParser();
		  FileReader  reader = new FileReader(Json_Path);


	    Object obj = jsonParser.parse(reader);

	    JSONObject userloginsJsonobj = (JSONObject) obj;
        JSONArray userloginsArray = (JSONArray) userloginsJsonobj.get("userlogins");

	      String arr[] = new String[userloginsArray.size()];


		for (int i=0; i<userloginsArray.size(); i++)

	      {
	    	  JSONObject users = (JSONObject) userloginsArray.get(i);
	    	  String user =  (String) users.get ("username");
	    	  String pwd =  (String) users.get ("password");

	    	  arr[i] = user+"," +pwd;
	      }

	      return arr;
	  }



	   @AfterTest
		public void Tear_Down() throws InterruptedException
		{

			driver.quit();
		}
 */


