package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class Listeners implements ITestListener {
	ExtentReports ep = Extentreports.config();
	ExtentTest et;
 
	public void onTestStart(ITestResult result) {
		et = ep.createTest(result.getMethod().getMethodName());
	}
 
	public void onTestSuccess(ITestResult result) {
		et.log(Status.PASS, "Test is passed");
		et.pass("Test is Validated");
		et.assignAuthor("Akhila Muniganti");
		et.assignCategory("Functional Testing");
	}
 
	public void onFinish(ITestContext context) {
		ep.flush();
	}
 
}
