package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {
	
	@Test(retryAnalyzer = IRetryAnalyZerTestNG.class)
	public void retryMethod() {
		
		System.out.println("This is an Example Method of Retry");
		Assert.fail();
		
	}

}
