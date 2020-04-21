package testng;

import org.testng.Assert;

public class Test {
     @org.testng.annotations.Test(priority = 1,description = "this test case will verift")
	  public void testMethod() {
		System.out.println("njh");
		Assert.assertEquals(12, 13);
	}
     @org.testng.annotations.Test(priority = -3,description = "this case will have")
     public void testMethod1() {
    	 System.out.println("gjdr");
     }
     @org.testng.annotations.Test(priority = 2,description = "this will have")
     public void testMethod2() {
    	 System.out.println("bjdghkj");
     }
     
     
     
     
}
