package reporters;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class customReporter implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		for(ISuite suite: suites){
			String suiteName = suite.getName();
			Map<String,ISuiteResult> results = suite.getResults();
			for(ISuiteResult res : results.values()){
				ITestContext tc = res.getTestContext();
		        System.out.println("Passed tests for suite '" + suiteName +
		             "' is:" + tc.getPassedTests().getAllResults().size());
		        System.out.println("Failed tests for suite '" + suiteName +
		             "' is:" + 
		             tc.getFailedTests().getAllResults().size());
		        System.out.println("Skipped tests for suite '" + suiteName +
		             "' is:" + 
		             tc.getSkippedTests().getAllResults().size());
			}
			
		}
		
	}
}
