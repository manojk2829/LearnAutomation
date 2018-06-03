package startToEnd;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCaseFail3 {
   @Test
   public static void GM(){
	   Assert.assertTrue(false);
	   System.out.println("GM Fail....");
   }
}
