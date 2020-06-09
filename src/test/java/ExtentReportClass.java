import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	ExtentReports Extent;
	@BeforeTest
	public void beforeTest() {
		
		
		// ExtentReports , ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reportshere\\Extentreports.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("hemanth");
		reporter.config().setDocumentTitle("errorcheck");
		Extent=new ExtentReports();
		Extent.attachReporter(reporter);
		Extent.setSystemInfo("Tester", "hemanth");
}
	
	@Test
	public void test() {
		Extent.createTest("hemanth");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.google.com");
		System.out.println(web.getTitle());
		Extent.flush();
	}
}
