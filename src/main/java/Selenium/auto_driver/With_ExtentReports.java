package Selenium.auto_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class With_ExtentReports 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        
        ExtentReports extent;
        ExtentTest logger;
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
        extent.addSystemInfo("User Name", "V Malakar");
        logger = extent.startTest("test started");
        
        d.manage().window().maximize();
        d.get("https://github.com");
        logger.log(LogStatus.PASS, "Test Case Passed");
        System.out.print("Success ! No Need to Setup Chrome driver");
        d.quit();
        extent.endTest(logger);
        extent.flush();
        
    }
}
