package project;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import org.testng.annotations.AfterTest;

public class TestNGClass {
	@Test
	public void rest_API_test() throws MalformedURLException 
	{
		System.out.println("open REST api for testing");
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");

	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");

	}

}
