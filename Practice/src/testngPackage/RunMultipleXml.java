package testngPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunMultipleXml {

	public static void main(String[] args) {
		
		TestNG runner=new TestNG();
		List<String> xmlfiles=new ArrayList<String>();
		xmlfiles.add("C:\\SeleniumWorkspace\\Practice\\testng.xml");
		xmlfiles.add("C:\\SeleniumWorkspace\\Practice\\testngtestdependency.xml");
		runner.setTestSuites(xmlfiles);
		runner.run();
	}

}
