package com.TestNGProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryMachanism implements IRetryAnalyzer{
int limit=2;
int count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count<=limit) {
			count++;
		}
		return false;
	}

}
