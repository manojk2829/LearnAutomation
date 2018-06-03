package testNG;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class DuplicateLearnTestNG {
	    
		@Test(dependsOnMethods={"DuplicateD"})
		public void DuplicateA(){
	    	System.out.println("Duplicate A");
	    }
	    @Test
	    public void DuplicateC(){
	    	System.out.println("Duplicate C");
	    }
	    @Test
	    public void DuplicateD(){
	    	
	    	System.out.println("Duplicate D");
	    	
	    	String Expected = "DuplicateD";
	    	String Actual = "DuplicateD";
	    	
	    	Assert.assertEquals(Actual, Expected);
	    	
	    	Assert.assertTrue(20>3, "Both are not true");
	    	Assert.assertFalse(30>4, "False condition....");
	    }
	 
	}

