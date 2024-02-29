package entireSDET;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzercls implements IRetryAnalyzer{

	
	@Override
	public boolean retry(ITestResult result) {
	if(result.isSuccess())
	return true;
		return false;
	}

}
