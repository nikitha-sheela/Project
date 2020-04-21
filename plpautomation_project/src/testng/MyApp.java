package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApp {
	@Test
	public void startApp() {
		Assert.assertEquals(12, 13);
		System.out.println("starting app");
		
	}
	@Test(dependsOnMethods = "startApp")
	public void loginapp() {
		System.out.println("login to app");
	}
	@Test(dependsOnMethods = "{loginapp,startApp}")
	public void logoutApp() {
		System.out.println("logout app");
		
	}

}


