package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void testSoft() {
		SoftAssert s = new SoftAssert();
		System.out.println("test1 is start");
		s.assertEquals(12, 13,"it does not match");
		System.out.println("tset1 is completed");

		s.assertAll();

	}

	@Test
	public void testHard() {
		System.out.println("test2 is start");
		Assert.assertEquals(12, 13);
		System.out.println("tset2 is completed");
	}

}
