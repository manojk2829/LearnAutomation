package startToEnd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	@Test
	public void softassertmethod(){
		SoftAssert objAssert = new SoftAssert();
		System.out.println("Test 1 pass....");
		objAssert.assertEquals(12, 13);
		System.out.println("Test 11 Pass.....");
		objAssert.assertAll();
	}
	@Test
	public void Newassertmethod(){
		System.out.println("Test Newassertmethod 2 Pass.....");
		Assert.assertEquals(12, 14, "Both String is not Equale...");
		System.out.println("Test Newassertmethod 22 Pass.....");
	}
	@Test
	public void assertmethod(){
		System.out.println("Test 3 Pass.....");
		Assert.assertEquals(12, 12, "Both String is not Equale...");
		System.out.println("Test 33 Pass.....");
	}
	@Test
	public void assertTestBefore(){
		Assert.assertTrue(true);
		System.out.println("Succeffully.. Pass");
	}
	@Test
	public void AssertTestBefore2(){
		Assert.assertTrue(false);
		System.out.println("Succeffully.. false");
	}
	
	@Test
	public void AssertTestBefore3(){
		String Message = "Manoj";
		Assert.assertTrue(Message.contains("Manoj"), "String Manoj Pass....");
		System.out.println("Manoj.... Pass");
	}
	
	@Test
	public void AssertTestBefore4(){
		String Message = "Manoj";
		Assert.assertTrue(Message.contains("Sachin"), "String Sachin not match....");
		System.out.println("false");
	}
}
