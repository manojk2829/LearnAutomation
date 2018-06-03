package toolQA_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 {
  @BeforeTest
  public void careURL() {
	  System.out.println("Care URL found");
  }
  @Test
  public void careLogin() {
	  System.out.println("Care login successfully");
  }
  
  @AfterTest
  public void careLogout() {
	  System.out.println("Care logout successfully");
  }
}
