package seleniumTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;
import java.net.URL;

//import io.cucumber.core.cli.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;




public class Swiggy
{
	
	 @Before
	    public void beforeScenario(){
		 System.out.println("open webDrive and swiggy -> DONE");
		 System.out.println("open login page -> DONE");
	    } 
	 
	 @After
	    public void afterScenario(){
		 System.out.println("close Chrome Driver  ");
	    }
	 
	public WebDriver driver ;
	
	public void driverTest () throws MalformedURLException
	{
		driver = new RemoteWebDriver(         
			      new URL("http://127.0.0.1:9515"),         
			      new ChromeOptions()); 
			  System.setProperty("webdriver.chrome.driver", "C:\\webdrivers.exe");
	}


	@Given("^open the brwoser and Swiggy website$")
		public void open_the_browser_and_Swiggy_website() throws MalformedURLException {
		driverTest ();		 
		driver.get("https://www.swiggy.com/");
		
	}

	@When("^open login page$")
	public void open_login_page()  {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")).click();
		

	}

	@Then("^add phone number and close the browser$")
	public void add_phone_number_and_close_the_browser() throws InterruptedException {
			
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("+966000000000");
		Thread.sleep(2000);
		// driver.close();
		

	}



}


