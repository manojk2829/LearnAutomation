package startToEnd;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunnerClass {

	public static void main(String[] args) {

        TestNG runner = new TestNG();
        List<String> list = new ArrayList<String>();
        list.add("D:\\MYJAVA\\Myselenium\\LearnAutomation\\test-output\\SuiteFailTestCase\\testng-failed.xml");
        runner.setTestSuites(list);
        runner.run();
	}
}
