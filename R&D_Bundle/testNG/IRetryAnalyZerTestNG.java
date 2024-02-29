package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyZerTestNG implements IRetryAnalyzer {

	int defaultRetryCount = 0;
	int maxRetryCount = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (defaultRetryCount < maxRetryCount) {

			defaultRetryCount++;
			
			return true;

		}

		return false;
	}

}
