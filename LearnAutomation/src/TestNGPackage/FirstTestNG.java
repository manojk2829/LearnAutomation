package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
 
    @BeforeMethod
    public void beforemethod()
	{
		System.out.println("Before Test method -- @BeforeMethod");
		System.out.println("Yes Login");
	}
    
	@Test
	public void test()
	{
		System.out.println("Test method first method");
		System.out.println("Send sms by app");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test -- @BeforeTest");
		System.out.println("Login App");
	}

    @AfterTest
    public void AfterTest()
	{
		System.out.println("Logout successfull");
	}
}
