package toolQA_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	@Test (priority = 2)
	public void fundtransfer(){
		System.out.println("Fund transfer successfull");
	}
	@Test (priority = 3)
	public void Recharge(){
		System.out.println("Recharge successfull");
	}
	@BeforeClass
	public void openbrowser() throws InterruptedException {
		System.out.println("user can open URL successfull");
	}
	@AfterClass
	public void Closebrowser(){
		System.out.println("User close browser");
	}
	
	@Test (priority = 1)
	public void Login(){
	    System.out.println("Login successfully");
    }
	
	@Test (priority = 4)
	public void AccountActive(){
		System.out.println("Account Active successfull");
	}
	@Test (priority = 5)
	public void Logout(){
		System.out.println("Logout successfull");
	}
}
