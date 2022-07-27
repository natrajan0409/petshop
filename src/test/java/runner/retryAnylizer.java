package runner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnylizer implements IRetryAnalyzer {
	int count = 0;
	int retrylim = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (count < retrylim) {
			count++;
			return true;
		}
		return false;
	}

}
