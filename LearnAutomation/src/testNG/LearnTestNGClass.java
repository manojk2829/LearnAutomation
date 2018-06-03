package testNG;

import org.openqa.selenium.remote.ExecuteMethod;
import org.testng.annotations.Test;

public class LearnTestNGClass {
    @Test(priority=1)
    public void A(){
    	System.out.println("A");
    }
    @Test(priority=2)
    public void D(){
    	System.out.println("D");
    }
    @Test(priority=3)
    public void C(){
    	System.out.println("C");
    }
    @Test(priority=4)
    public void B(){
    	System.out.println("B");
    }
    @Test()
    public void E(){
    	System.out.println("E");
    }
}
