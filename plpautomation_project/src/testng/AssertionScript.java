package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {
	@Test
	public void test1() {
		Assert.assertEquals(12, 13);
		
	}

	@Test
	public void test2() {
		Assert.assertEquals(12, 13,"it is not matching");
		
	}
	@Test
	public void test3() {
		Assert.assertEquals("Hello","Hello","words does  not matching");
		
	}

}
