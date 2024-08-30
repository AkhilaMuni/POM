package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {
		public static ExtentReports config()
		{
			String path=System.getProperty("user.dir")+"//Reports//SauceReport.html";
			ExtentSparkReporter report=new ExtentSparkReporter(path);
			report.config().setReportName("Sauce Demo Report");
			report.config().setDocumentTitle("SauceDemo");
			
			ExtentReports extent =new ExtentReports();
			extent.attachReporter(report);
			return extent;
		}
	 
	}

